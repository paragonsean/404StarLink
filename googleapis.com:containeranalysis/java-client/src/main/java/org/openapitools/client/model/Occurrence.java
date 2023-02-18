/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.Details;
import org.openapitools.client.model.DocumentOccurrence;
import org.openapitools.client.model.Envelope;
import org.openapitools.client.model.FileOccurrence;
import org.openapitools.client.model.GrafeasV1beta1BuildDetails;
import org.openapitools.client.model.GrafeasV1beta1DeploymentDetails;
import org.openapitools.client.model.GrafeasV1beta1DiscoveryDetails;
import org.openapitools.client.model.GrafeasV1beta1ImageDetails;
import org.openapitools.client.model.GrafeasV1beta1IntotoDetails;
import org.openapitools.client.model.GrafeasV1beta1PackageDetails;
import org.openapitools.client.model.GrafeasV1beta1VulnerabilityDetails;
import org.openapitools.client.model.PackageInfoOccurrence;
import org.openapitools.client.model.RelationshipOccurrence;
import org.openapitools.client.model.Resource;
import org.openapitools.client.model.SBOMReferenceOccurrence;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Occurrence {
  public static final String SERIALIZED_NAME_ATTESTATION = "attestation";
  @SerializedName(SERIALIZED_NAME_ATTESTATION)
  private Details attestation;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private GrafeasV1beta1BuildDetails build;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DEPLOYMENT = "deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private GrafeasV1beta1DeploymentDetails deployment;

  public static final String SERIALIZED_NAME_DERIVED_IMAGE = "derivedImage";
  @SerializedName(SERIALIZED_NAME_DERIVED_IMAGE)
  private GrafeasV1beta1ImageDetails derivedImage;

  public static final String SERIALIZED_NAME_DISCOVERED = "discovered";
  @SerializedName(SERIALIZED_NAME_DISCOVERED)
  private GrafeasV1beta1DiscoveryDetails discovered;

  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  private Envelope envelope;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private GrafeasV1beta1PackageDetails installation;

  public static final String SERIALIZED_NAME_INTOTO = "intoto";
  @SerializedName(SERIALIZED_NAME_INTOTO)
  private GrafeasV1beta1IntotoDetails intoto;

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
    
    INTOTO("INTOTO"),
    
    SBOM("SBOM"),
    
    SPDX_PACKAGE("SPDX_PACKAGE"),
    
    SPDX_FILE("SPDX_FILE"),
    
    SPDX_RELATIONSHIP("SPDX_RELATIONSHIP"),
    
    VULNERABILITY_ASSESSMENT("VULNERABILITY_ASSESSMENT"),
    
    SBOM_REFERENCE("SBOM_REFERENCE");

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

  public static final String SERIALIZED_NAME_REMEDIATION = "remediation";
  @SerializedName(SERIALIZED_NAME_REMEDIATION)
  private String remediation;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private Resource resource;

  public static final String SERIALIZED_NAME_SBOM = "sbom";
  @SerializedName(SERIALIZED_NAME_SBOM)
  private DocumentOccurrence sbom;

  public static final String SERIALIZED_NAME_SBOM_REFERENCE = "sbomReference";
  @SerializedName(SERIALIZED_NAME_SBOM_REFERENCE)
  private SBOMReferenceOccurrence sbomReference;

  public static final String SERIALIZED_NAME_SPDX_FILE = "spdxFile";
  @SerializedName(SERIALIZED_NAME_SPDX_FILE)
  private FileOccurrence spdxFile;

  public static final String SERIALIZED_NAME_SPDX_PACKAGE = "spdxPackage";
  @SerializedName(SERIALIZED_NAME_SPDX_PACKAGE)
  private PackageInfoOccurrence spdxPackage;

  public static final String SERIALIZED_NAME_SPDX_RELATIONSHIP = "spdxRelationship";
  @SerializedName(SERIALIZED_NAME_SPDX_RELATIONSHIP)
  private RelationshipOccurrence spdxRelationship;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_VULNERABILITY = "vulnerability";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY)
  private GrafeasV1beta1VulnerabilityDetails vulnerability;

  public Occurrence() {
  }

  public Occurrence attestation(Details attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Get attestation
   * @return attestation
   */
  @javax.annotation.Nullable
  public Details getAttestation() {
    return attestation;
  }

  public void setAttestation(Details attestation) {
    this.attestation = attestation;
  }


  public Occurrence build(GrafeasV1beta1BuildDetails build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1BuildDetails getBuild() {
    return build;
  }

  public void setBuild(GrafeasV1beta1BuildDetails build) {
    this.build = build;
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


  public Occurrence deployment(GrafeasV1beta1DeploymentDetails deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Get deployment
   * @return deployment
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1DeploymentDetails getDeployment() {
    return deployment;
  }

  public void setDeployment(GrafeasV1beta1DeploymentDetails deployment) {
    this.deployment = deployment;
  }


  public Occurrence derivedImage(GrafeasV1beta1ImageDetails derivedImage) {
    this.derivedImage = derivedImage;
    return this;
  }

  /**
   * Get derivedImage
   * @return derivedImage
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1ImageDetails getDerivedImage() {
    return derivedImage;
  }

  public void setDerivedImage(GrafeasV1beta1ImageDetails derivedImage) {
    this.derivedImage = derivedImage;
  }


  public Occurrence discovered(GrafeasV1beta1DiscoveryDetails discovered) {
    this.discovered = discovered;
    return this;
  }

  /**
   * Get discovered
   * @return discovered
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1DiscoveryDetails getDiscovered() {
    return discovered;
  }

  public void setDiscovered(GrafeasV1beta1DiscoveryDetails discovered) {
    this.discovered = discovered;
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


  public Occurrence installation(GrafeasV1beta1PackageDetails installation) {
    this.installation = installation;
    return this;
  }

  /**
   * Get installation
   * @return installation
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1PackageDetails getInstallation() {
    return installation;
  }

  public void setInstallation(GrafeasV1beta1PackageDetails installation) {
    this.installation = installation;
  }


  public Occurrence intoto(GrafeasV1beta1IntotoDetails intoto) {
    this.intoto = intoto;
    return this;
  }

  /**
   * Get intoto
   * @return intoto
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1IntotoDetails getIntoto() {
    return intoto;
  }

  public void setIntoto(GrafeasV1beta1IntotoDetails intoto) {
    this.intoto = intoto;
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


  public Occurrence resource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @javax.annotation.Nullable
  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }


  public Occurrence sbom(DocumentOccurrence sbom) {
    this.sbom = sbom;
    return this;
  }

  /**
   * Get sbom
   * @return sbom
   */
  @javax.annotation.Nullable
  public DocumentOccurrence getSbom() {
    return sbom;
  }

  public void setSbom(DocumentOccurrence sbom) {
    this.sbom = sbom;
  }


  public Occurrence sbomReference(SBOMReferenceOccurrence sbomReference) {
    this.sbomReference = sbomReference;
    return this;
  }

  /**
   * Get sbomReference
   * @return sbomReference
   */
  @javax.annotation.Nullable
  public SBOMReferenceOccurrence getSbomReference() {
    return sbomReference;
  }

  public void setSbomReference(SBOMReferenceOccurrence sbomReference) {
    this.sbomReference = sbomReference;
  }


  public Occurrence spdxFile(FileOccurrence spdxFile) {
    this.spdxFile = spdxFile;
    return this;
  }

  /**
   * Get spdxFile
   * @return spdxFile
   */
  @javax.annotation.Nullable
  public FileOccurrence getSpdxFile() {
    return spdxFile;
  }

  public void setSpdxFile(FileOccurrence spdxFile) {
    this.spdxFile = spdxFile;
  }


  public Occurrence spdxPackage(PackageInfoOccurrence spdxPackage) {
    this.spdxPackage = spdxPackage;
    return this;
  }

  /**
   * Get spdxPackage
   * @return spdxPackage
   */
  @javax.annotation.Nullable
  public PackageInfoOccurrence getSpdxPackage() {
    return spdxPackage;
  }

  public void setSpdxPackage(PackageInfoOccurrence spdxPackage) {
    this.spdxPackage = spdxPackage;
  }


  public Occurrence spdxRelationship(RelationshipOccurrence spdxRelationship) {
    this.spdxRelationship = spdxRelationship;
    return this;
  }

  /**
   * Get spdxRelationship
   * @return spdxRelationship
   */
  @javax.annotation.Nullable
  public RelationshipOccurrence getSpdxRelationship() {
    return spdxRelationship;
  }

  public void setSpdxRelationship(RelationshipOccurrence spdxRelationship) {
    this.spdxRelationship = spdxRelationship;
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


  public Occurrence vulnerability(GrafeasV1beta1VulnerabilityDetails vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  /**
   * Get vulnerability
   * @return vulnerability
   */
  @javax.annotation.Nullable
  public GrafeasV1beta1VulnerabilityDetails getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(GrafeasV1beta1VulnerabilityDetails vulnerability) {
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
        Objects.equals(this.createTime, occurrence.createTime) &&
        Objects.equals(this.deployment, occurrence.deployment) &&
        Objects.equals(this.derivedImage, occurrence.derivedImage) &&
        Objects.equals(this.discovered, occurrence.discovered) &&
        Objects.equals(this.envelope, occurrence.envelope) &&
        Objects.equals(this.installation, occurrence.installation) &&
        Objects.equals(this.intoto, occurrence.intoto) &&
        Objects.equals(this.kind, occurrence.kind) &&
        Objects.equals(this.name, occurrence.name) &&
        Objects.equals(this.noteName, occurrence.noteName) &&
        Objects.equals(this.remediation, occurrence.remediation) &&
        Objects.equals(this.resource, occurrence.resource) &&
        Objects.equals(this.sbom, occurrence.sbom) &&
        Objects.equals(this.sbomReference, occurrence.sbomReference) &&
        Objects.equals(this.spdxFile, occurrence.spdxFile) &&
        Objects.equals(this.spdxPackage, occurrence.spdxPackage) &&
        Objects.equals(this.spdxRelationship, occurrence.spdxRelationship) &&
        Objects.equals(this.updateTime, occurrence.updateTime) &&
        Objects.equals(this.vulnerability, occurrence.vulnerability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attestation, build, createTime, deployment, derivedImage, discovered, envelope, installation, intoto, kind, name, noteName, remediation, resource, sbom, sbomReference, spdxFile, spdxPackage, spdxRelationship, updateTime, vulnerability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Occurrence {\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    derivedImage: ").append(toIndentedString(derivedImage)).append("\n");
    sb.append("    discovered: ").append(toIndentedString(discovered)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    intoto: ").append(toIndentedString(intoto)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noteName: ").append(toIndentedString(noteName)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    sbom: ").append(toIndentedString(sbom)).append("\n");
    sb.append("    sbomReference: ").append(toIndentedString(sbomReference)).append("\n");
    sb.append("    spdxFile: ").append(toIndentedString(spdxFile)).append("\n");
    sb.append("    spdxPackage: ").append(toIndentedString(spdxPackage)).append("\n");
    sb.append("    spdxRelationship: ").append(toIndentedString(spdxRelationship)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("createTime");
    openapiFields.add("deployment");
    openapiFields.add("derivedImage");
    openapiFields.add("discovered");
    openapiFields.add("envelope");
    openapiFields.add("installation");
    openapiFields.add("intoto");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("noteName");
    openapiFields.add("remediation");
    openapiFields.add("resource");
    openapiFields.add("sbom");
    openapiFields.add("sbomReference");
    openapiFields.add("spdxFile");
    openapiFields.add("spdxPackage");
    openapiFields.add("spdxRelationship");
    openapiFields.add("updateTime");
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
        Details.validateJsonElement(jsonObj.get("attestation"));
      }
      // validate the optional field `build`
      if (jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) {
        GrafeasV1beta1BuildDetails.validateJsonElement(jsonObj.get("build"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // validate the optional field `deployment`
      if (jsonObj.get("deployment") != null && !jsonObj.get("deployment").isJsonNull()) {
        GrafeasV1beta1DeploymentDetails.validateJsonElement(jsonObj.get("deployment"));
      }
      // validate the optional field `derivedImage`
      if (jsonObj.get("derivedImage") != null && !jsonObj.get("derivedImage").isJsonNull()) {
        GrafeasV1beta1ImageDetails.validateJsonElement(jsonObj.get("derivedImage"));
      }
      // validate the optional field `discovered`
      if (jsonObj.get("discovered") != null && !jsonObj.get("discovered").isJsonNull()) {
        GrafeasV1beta1DiscoveryDetails.validateJsonElement(jsonObj.get("discovered"));
      }
      // validate the optional field `envelope`
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonNull()) {
        Envelope.validateJsonElement(jsonObj.get("envelope"));
      }
      // validate the optional field `installation`
      if (jsonObj.get("installation") != null && !jsonObj.get("installation").isJsonNull()) {
        GrafeasV1beta1PackageDetails.validateJsonElement(jsonObj.get("installation"));
      }
      // validate the optional field `intoto`
      if (jsonObj.get("intoto") != null && !jsonObj.get("intoto").isJsonNull()) {
        GrafeasV1beta1IntotoDetails.validateJsonElement(jsonObj.get("intoto"));
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
      if ((jsonObj.get("remediation") != null && !jsonObj.get("remediation").isJsonNull()) && !jsonObj.get("remediation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remediation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remediation").toString()));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        Resource.validateJsonElement(jsonObj.get("resource"));
      }
      // validate the optional field `sbom`
      if (jsonObj.get("sbom") != null && !jsonObj.get("sbom").isJsonNull()) {
        DocumentOccurrence.validateJsonElement(jsonObj.get("sbom"));
      }
      // validate the optional field `sbomReference`
      if (jsonObj.get("sbomReference") != null && !jsonObj.get("sbomReference").isJsonNull()) {
        SBOMReferenceOccurrence.validateJsonElement(jsonObj.get("sbomReference"));
      }
      // validate the optional field `spdxFile`
      if (jsonObj.get("spdxFile") != null && !jsonObj.get("spdxFile").isJsonNull()) {
        FileOccurrence.validateJsonElement(jsonObj.get("spdxFile"));
      }
      // validate the optional field `spdxPackage`
      if (jsonObj.get("spdxPackage") != null && !jsonObj.get("spdxPackage").isJsonNull()) {
        PackageInfoOccurrence.validateJsonElement(jsonObj.get("spdxPackage"));
      }
      // validate the optional field `spdxRelationship`
      if (jsonObj.get("spdxRelationship") != null && !jsonObj.get("spdxRelationship").isJsonNull()) {
        RelationshipOccurrence.validateJsonElement(jsonObj.get("spdxRelationship"));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      // validate the optional field `vulnerability`
      if (jsonObj.get("vulnerability") != null && !jsonObj.get("vulnerability").isJsonNull()) {
        GrafeasV1beta1VulnerabilityDetails.validateJsonElement(jsonObj.get("vulnerability"));
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

