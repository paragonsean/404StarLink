/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1
 * 
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
import org.openapitools.client.model.AttestationOccurrence;
import org.openapitools.client.model.BuildOccurrence;
import org.openapitools.client.model.ComplianceOccurrence;
import org.openapitools.client.model.DSSEAttestationOccurrence;
import org.openapitools.client.model.DeploymentOccurrence;
import org.openapitools.client.model.DiscoveryOccurrence;
import org.openapitools.client.model.Envelope;
import org.openapitools.client.model.ImageOccurrence;
import org.openapitools.client.model.PackageOccurrence;
import org.openapitools.client.model.UpgradeOccurrence;
import org.openapitools.client.model.VulnerabilityOccurrence;

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
 * An instance of an analysis type that has been found on a resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:59.945291-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Occurrence {
  public static final String SERIALIZED_NAME_ATTESTATION = "attestation";
  @SerializedName(SERIALIZED_NAME_ATTESTATION)
  private AttestationOccurrence attestation;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private BuildOccurrence build;

  public static final String SERIALIZED_NAME_COMPLIANCE = "compliance";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE)
  private ComplianceOccurrence compliance;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DEPLOYMENT = "deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private DeploymentOccurrence deployment;

  public static final String SERIALIZED_NAME_DISCOVERY = "discovery";
  @SerializedName(SERIALIZED_NAME_DISCOVERY)
  private DiscoveryOccurrence discovery;

  public static final String SERIALIZED_NAME_DSSE_ATTESTATION = "dsseAttestation";
  @SerializedName(SERIALIZED_NAME_DSSE_ATTESTATION)
  private DSSEAttestationOccurrence dsseAttestation;

  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  private Envelope envelope;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ImageOccurrence image;

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    NOTE_KIND_UNSPECIFIED("NOTE_KIND_UNSPECIFIED"),
    
    VULNERABILITY("VULNERABILITY"),
    
    BUILD("BUILD"),
    
    IMAGE("IMAGE"),
    
    PACKAGE("PACKAGE"),
    
    DEPLOYMENT("DEPLOYMENT"),
    
    DISCOVERY("DISCOVERY"),
    
    ATTESTATION("ATTESTATION"),
    
    UPGRADE("UPGRADE"),
    
    COMPLIANCE("COMPLIANCE"),
    
    DSSE_ATTESTATION("DSSE_ATTESTATION"),
    
    VULNERABILITY_ASSESSMENT("VULNERABILITY_ASSESSMENT");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTE_NAME = "noteName";
  @SerializedName(SERIALIZED_NAME_NOTE_NAME)
  private String noteName;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private PackageOccurrence _package;

  public static final String SERIALIZED_NAME_REMEDIATION = "remediation";
  @SerializedName(SERIALIZED_NAME_REMEDIATION)
  private String remediation;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_UPGRADE = "upgrade";
  @SerializedName(SERIALIZED_NAME_UPGRADE)
  private UpgradeOccurrence upgrade;

  public static final String SERIALIZED_NAME_VULNERABILITY = "vulnerability";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY)
  private VulnerabilityOccurrence vulnerability;

  public Occurrence() {
  }

  public Occurrence attestation(AttestationOccurrence attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Get attestation
   * @return attestation
   */
  @javax.annotation.Nullable
  public AttestationOccurrence getAttestation() {
    return attestation;
  }

  public void setAttestation(AttestationOccurrence attestation) {
    this.attestation = attestation;
  }


  public Occurrence build(BuildOccurrence build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
   */
  @javax.annotation.Nullable
  public BuildOccurrence getBuild() {
    return build;
  }

  public void setBuild(BuildOccurrence build) {
    this.build = build;
  }


  public Occurrence compliance(ComplianceOccurrence compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
   */
  @javax.annotation.Nullable
  public ComplianceOccurrence getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceOccurrence compliance) {
    this.compliance = compliance;
  }


  public Occurrence createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time this occurrence was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public Occurrence deployment(DeploymentOccurrence deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Get deployment
   * @return deployment
   */
  @javax.annotation.Nullable
  public DeploymentOccurrence getDeployment() {
    return deployment;
  }

  public void setDeployment(DeploymentOccurrence deployment) {
    this.deployment = deployment;
  }


  public Occurrence discovery(DiscoveryOccurrence discovery) {
    this.discovery = discovery;
    return this;
  }

  /**
   * Get discovery
   * @return discovery
   */
  @javax.annotation.Nullable
  public DiscoveryOccurrence getDiscovery() {
    return discovery;
  }

  public void setDiscovery(DiscoveryOccurrence discovery) {
    this.discovery = discovery;
  }


  public Occurrence dsseAttestation(DSSEAttestationOccurrence dsseAttestation) {
    this.dsseAttestation = dsseAttestation;
    return this;
  }

  /**
   * Get dsseAttestation
   * @return dsseAttestation
   */
  @javax.annotation.Nullable
  public DSSEAttestationOccurrence getDsseAttestation() {
    return dsseAttestation;
  }

  public void setDsseAttestation(DSSEAttestationOccurrence dsseAttestation) {
    this.dsseAttestation = dsseAttestation;
  }


  public Occurrence envelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Get envelope
   * @return envelope
   */
  @javax.annotation.Nullable
  public Envelope getEnvelope() {
    return envelope;
  }

  public void setEnvelope(Envelope envelope) {
    this.envelope = envelope;
  }


  public Occurrence image(ImageOccurrence image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public ImageOccurrence getImage() {
    return image;
  }

  public void setImage(ImageOccurrence image) {
    this.image = image;
  }


  public Occurrence kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
   * @return kind
   */
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public Occurrence name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Occurrence noteName(String noteName) {
    this.noteName = noteName;
    return this;
  }

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. This field can be used as a filter in list requests.
   * @return noteName
   */
  @javax.annotation.Nullable
  public String getNoteName() {
    return noteName;
  }

  public void setNoteName(String noteName) {
    this.noteName = noteName;
  }


  public Occurrence _package(PackageOccurrence _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   */
  @javax.annotation.Nullable
  public PackageOccurrence getPackage() {
    return _package;
  }

  public void setPackage(PackageOccurrence _package) {
    this._package = _package;
  }


  public Occurrence remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * A description of actions that can be taken to remedy the note.
   * @return remediation
   */
  @javax.annotation.Nullable
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }


  public Occurrence resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * Required. Immutable. A URI that represents the resource for which the occurrence applies. For example, &#x60;https://gcr.io/project/image@sha256:123abc&#x60; for a Docker image.
   * @return resourceUri
   */
  @javax.annotation.Nullable
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public Occurrence updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The time this occurrence was last updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public Occurrence upgrade(UpgradeOccurrence upgrade) {
    this.upgrade = upgrade;
    return this;
  }

  /**
   * Get upgrade
   * @return upgrade
   */
  @javax.annotation.Nullable
  public UpgradeOccurrence getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(UpgradeOccurrence upgrade) {
    this.upgrade = upgrade;
  }


  public Occurrence vulnerability(VulnerabilityOccurrence vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  /**
   * Get vulnerability
   * @return vulnerability
   */
  @javax.annotation.Nullable
  public VulnerabilityOccurrence getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(VulnerabilityOccurrence vulnerability) {
    this.vulnerability = vulnerability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Occurrence occurrence = (Occurrence) o;
    return Objects.equals(this.attestation, occurrence.attestation) &&
        Objects.equals(this.build, occurrence.build) &&
        Objects.equals(this.compliance, occurrence.compliance) &&
        Objects.equals(this.createTime, occurrence.createTime) &&
        Objects.equals(this.deployment, occurrence.deployment) &&
        Objects.equals(this.discovery, occurrence.discovery) &&
        Objects.equals(this.dsseAttestation, occurrence.dsseAttestation) &&
        Objects.equals(this.envelope, occurrence.envelope) &&
        Objects.equals(this.image, occurrence.image) &&
        Objects.equals(this.kind, occurrence.kind) &&
        Objects.equals(this.name, occurrence.name) &&
        Objects.equals(this.noteName, occurrence.noteName) &&
        Objects.equals(this._package, occurrence._package) &&
        Objects.equals(this.remediation, occurrence.remediation) &&
        Objects.equals(this.resourceUri, occurrence.resourceUri) &&
        Objects.equals(this.updateTime, occurrence.updateTime) &&
        Objects.equals(this.upgrade, occurrence.upgrade) &&
        Objects.equals(this.vulnerability, occurrence.vulnerability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attestation, build, compliance, createTime, deployment, discovery, dsseAttestation, envelope, image, kind, name, noteName, _package, remediation, resourceUri, updateTime, upgrade, vulnerability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Occurrence {\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    discovery: ").append(toIndentedString(discovery)).append("\n");
    sb.append("    dsseAttestation: ").append(toIndentedString(dsseAttestation)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noteName: ").append(toIndentedString(noteName)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
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
    openapiFields.add("attestation");
    openapiFields.add("build");
    openapiFields.add("compliance");
    openapiFields.add("createTime");
    openapiFields.add("deployment");
    openapiFields.add("discovery");
    openapiFields.add("dsseAttestation");
    openapiFields.add("envelope");
    openapiFields.add("image");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("noteName");
    openapiFields.add("package");
    openapiFields.add("remediation");
    openapiFields.add("resourceUri");
    openapiFields.add("updateTime");
    openapiFields.add("upgrade");
    openapiFields.add("vulnerability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Occurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Occurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Occurrence is not found in the empty JSON string", Occurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Occurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Occurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `attestation`
      if (jsonObj.get("attestation") != null && !jsonObj.get("attestation").isJsonNull()) {
        AttestationOccurrence.validateJsonElement(jsonObj.get("attestation"));
      }
      // validate the optional field `build`
      if (jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) {
        BuildOccurrence.validateJsonElement(jsonObj.get("build"));
      }
      // validate the optional field `compliance`
      if (jsonObj.get("compliance") != null && !jsonObj.get("compliance").isJsonNull()) {
        ComplianceOccurrence.validateJsonElement(jsonObj.get("compliance"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // validate the optional field `deployment`
      if (jsonObj.get("deployment") != null && !jsonObj.get("deployment").isJsonNull()) {
        DeploymentOccurrence.validateJsonElement(jsonObj.get("deployment"));
      }
      // validate the optional field `discovery`
      if (jsonObj.get("discovery") != null && !jsonObj.get("discovery").isJsonNull()) {
        DiscoveryOccurrence.validateJsonElement(jsonObj.get("discovery"));
      }
      // validate the optional field `dsseAttestation`
      if (jsonObj.get("dsseAttestation") != null && !jsonObj.get("dsseAttestation").isJsonNull()) {
        DSSEAttestationOccurrence.validateJsonElement(jsonObj.get("dsseAttestation"));
      }
      // validate the optional field `envelope`
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonNull()) {
        Envelope.validateJsonElement(jsonObj.get("envelope"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        ImageOccurrence.validateJsonElement(jsonObj.get("image"));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("noteName") != null && !jsonObj.get("noteName").isJsonNull()) && !jsonObj.get("noteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noteName").toString()));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        PackageOccurrence.validateJsonElement(jsonObj.get("package"));
      }
      if ((jsonObj.get("remediation") != null && !jsonObj.get("remediation").isJsonNull()) && !jsonObj.get("remediation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remediation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remediation").toString()));
      }
      if ((jsonObj.get("resourceUri") != null && !jsonObj.get("resourceUri").isJsonNull()) && !jsonObj.get("resourceUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceUri").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      // validate the optional field `upgrade`
      if (jsonObj.get("upgrade") != null && !jsonObj.get("upgrade").isJsonNull()) {
        UpgradeOccurrence.validateJsonElement(jsonObj.get("upgrade"));
      }
      // validate the optional field `vulnerability`
      if (jsonObj.get("vulnerability") != null && !jsonObj.get("vulnerability").isJsonNull()) {
        VulnerabilityOccurrence.validateJsonElement(jsonObj.get("vulnerability"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Occurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Occurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Occurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Occurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<Occurrence>() {
           @Override
           public void write(JsonWriter out, Occurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Occurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Occurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Occurrence
   * @throws IOException if the JSON string is invalid with respect to Occurrence
   */
  public static Occurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Occurrence.class);
  }

  /**
   * Convert an instance of Occurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

