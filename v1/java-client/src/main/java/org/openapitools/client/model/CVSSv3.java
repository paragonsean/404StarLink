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
 * Common Vulnerability Scoring System version 3. For details, see https://www.first.org/cvss/specification-document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CVSSv3 {
  /**
   * Gets or Sets attackComplexity
   */
  @JsonAdapter(AttackComplexityEnum.Adapter.class)
  public enum AttackComplexityEnum {
    UNSPECIFIED("ATTACK_COMPLEXITY_UNSPECIFIED"),
    
    LOW("ATTACK_COMPLEXITY_LOW"),
    
    HIGH("ATTACK_COMPLEXITY_HIGH");

    private String value;

    AttackComplexityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttackComplexityEnum fromValue(String value) {
      for (AttackComplexityEnum b : AttackComplexityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttackComplexityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttackComplexityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttackComplexityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttackComplexityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AttackComplexityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ATTACK_COMPLEXITY = "attackComplexity";
  @SerializedName(SERIALIZED_NAME_ATTACK_COMPLEXITY)
  private AttackComplexityEnum attackComplexity;

  /**
   * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
   */
  @JsonAdapter(AttackVectorEnum.Adapter.class)
  public enum AttackVectorEnum {
    UNSPECIFIED("ATTACK_VECTOR_UNSPECIFIED"),
    
    NETWORK("ATTACK_VECTOR_NETWORK"),
    
    ADJACENT("ATTACK_VECTOR_ADJACENT"),
    
    LOCAL("ATTACK_VECTOR_LOCAL"),
    
    PHYSICAL("ATTACK_VECTOR_PHYSICAL");

    private String value;

    AttackVectorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttackVectorEnum fromValue(String value) {
      for (AttackVectorEnum b : AttackVectorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttackVectorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttackVectorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttackVectorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttackVectorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AttackVectorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ATTACK_VECTOR = "attackVector";
  @SerializedName(SERIALIZED_NAME_ATTACK_VECTOR)
  private AttackVectorEnum attackVector;

  /**
   * Gets or Sets availabilityImpact
   */
  @JsonAdapter(AvailabilityImpactEnum.Adapter.class)
  public enum AvailabilityImpactEnum {
    UNSPECIFIED("IMPACT_UNSPECIFIED"),
    
    HIGH("IMPACT_HIGH"),
    
    LOW("IMPACT_LOW"),
    
    NONE("IMPACT_NONE");

    private String value;

    AvailabilityImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityImpactEnum fromValue(String value) {
      for (AvailabilityImpactEnum b : AvailabilityImpactEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailabilityImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityImpactEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AvailabilityImpactEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_IMPACT = "availabilityImpact";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_IMPACT)
  private AvailabilityImpactEnum availabilityImpact;

  public static final String SERIALIZED_NAME_BASE_SCORE = "baseScore";
  @SerializedName(SERIALIZED_NAME_BASE_SCORE)
  private Float baseScore;

  /**
   * Gets or Sets confidentialityImpact
   */
  @JsonAdapter(ConfidentialityImpactEnum.Adapter.class)
  public enum ConfidentialityImpactEnum {
    UNSPECIFIED("IMPACT_UNSPECIFIED"),
    
    HIGH("IMPACT_HIGH"),
    
    LOW("IMPACT_LOW"),
    
    NONE("IMPACT_NONE");

    private String value;

    ConfidentialityImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfidentialityImpactEnum fromValue(String value) {
      for (ConfidentialityImpactEnum b : ConfidentialityImpactEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfidentialityImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfidentialityImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfidentialityImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfidentialityImpactEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ConfidentialityImpactEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONFIDENTIALITY_IMPACT = "confidentialityImpact";
  @SerializedName(SERIALIZED_NAME_CONFIDENTIALITY_IMPACT)
  private ConfidentialityImpactEnum confidentialityImpact;

  public static final String SERIALIZED_NAME_EXPLOITABILITY_SCORE = "exploitabilityScore";
  @SerializedName(SERIALIZED_NAME_EXPLOITABILITY_SCORE)
  private Float exploitabilityScore;

  public static final String SERIALIZED_NAME_IMPACT_SCORE = "impactScore";
  @SerializedName(SERIALIZED_NAME_IMPACT_SCORE)
  private Float impactScore;

  /**
   * Gets or Sets integrityImpact
   */
  @JsonAdapter(IntegrityImpactEnum.Adapter.class)
  public enum IntegrityImpactEnum {
    UNSPECIFIED("IMPACT_UNSPECIFIED"),
    
    HIGH("IMPACT_HIGH"),
    
    LOW("IMPACT_LOW"),
    
    NONE("IMPACT_NONE");

    private String value;

    IntegrityImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrityImpactEnum fromValue(String value) {
      for (IntegrityImpactEnum b : IntegrityImpactEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntegrityImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrityImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrityImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntegrityImpactEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IntegrityImpactEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INTEGRITY_IMPACT = "integrityImpact";
  @SerializedName(SERIALIZED_NAME_INTEGRITY_IMPACT)
  private IntegrityImpactEnum integrityImpact;

  /**
   * Gets or Sets privilegesRequired
   */
  @JsonAdapter(PrivilegesRequiredEnum.Adapter.class)
  public enum PrivilegesRequiredEnum {
    UNSPECIFIED("PRIVILEGES_REQUIRED_UNSPECIFIED"),
    
    NONE("PRIVILEGES_REQUIRED_NONE"),
    
    LOW("PRIVILEGES_REQUIRED_LOW"),
    
    HIGH("PRIVILEGES_REQUIRED_HIGH");

    private String value;

    PrivilegesRequiredEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegesRequiredEnum fromValue(String value) {
      for (PrivilegesRequiredEnum b : PrivilegesRequiredEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivilegesRequiredEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegesRequiredEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegesRequiredEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivilegesRequiredEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PrivilegesRequiredEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PRIVILEGES_REQUIRED = "privilegesRequired";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES_REQUIRED)
  private PrivilegesRequiredEnum privilegesRequired;

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    UNSPECIFIED("SCOPE_UNSPECIFIED"),
    
    UNCHANGED("SCOPE_UNCHANGED"),
    
    CHANGED("SCOPE_CHANGED");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  /**
   * Gets or Sets userInteraction
   */
  @JsonAdapter(UserInteractionEnum.Adapter.class)
  public enum UserInteractionEnum {
    UNSPECIFIED("USER_INTERACTION_UNSPECIFIED"),
    
    NONE("USER_INTERACTION_NONE"),
    
    REQUIRED("USER_INTERACTION_REQUIRED");

    private String value;

    UserInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserInteractionEnum fromValue(String value) {
      for (UserInteractionEnum b : UserInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserInteractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserInteractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserInteractionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserInteractionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      UserInteractionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_USER_INTERACTION = "userInteraction";
  @SerializedName(SERIALIZED_NAME_USER_INTERACTION)
  private UserInteractionEnum userInteraction;

  public CVSSv3() {
  }

  public CVSSv3 attackComplexity(AttackComplexityEnum attackComplexity) {
    this.attackComplexity = attackComplexity;
    return this;
  }

  /**
   * Get attackComplexity
   * @return attackComplexity
   */
  @javax.annotation.Nullable
  public AttackComplexityEnum getAttackComplexity() {
    return attackComplexity;
  }

  public void setAttackComplexity(AttackComplexityEnum attackComplexity) {
    this.attackComplexity = attackComplexity;
  }


  public CVSSv3 attackVector(AttackVectorEnum attackVector) {
    this.attackVector = attackVector;
    return this;
  }

  /**
   * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
   * @return attackVector
   */
  @javax.annotation.Nullable
  public AttackVectorEnum getAttackVector() {
    return attackVector;
  }

  public void setAttackVector(AttackVectorEnum attackVector) {
    this.attackVector = attackVector;
  }


  public CVSSv3 availabilityImpact(AvailabilityImpactEnum availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
    return this;
  }

  /**
   * Get availabilityImpact
   * @return availabilityImpact
   */
  @javax.annotation.Nullable
  public AvailabilityImpactEnum getAvailabilityImpact() {
    return availabilityImpact;
  }

  public void setAvailabilityImpact(AvailabilityImpactEnum availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
  }


  public CVSSv3 baseScore(Float baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  /**
   * The base score is a function of the base metric scores.
   * @return baseScore
   */
  @javax.annotation.Nullable
  public Float getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Float baseScore) {
    this.baseScore = baseScore;
  }


  public CVSSv3 confidentialityImpact(ConfidentialityImpactEnum confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
    return this;
  }

  /**
   * Get confidentialityImpact
   * @return confidentialityImpact
   */
  @javax.annotation.Nullable
  public ConfidentialityImpactEnum getConfidentialityImpact() {
    return confidentialityImpact;
  }

  public void setConfidentialityImpact(ConfidentialityImpactEnum confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
  }


  public CVSSv3 exploitabilityScore(Float exploitabilityScore) {
    this.exploitabilityScore = exploitabilityScore;
    return this;
  }

  /**
   * Get exploitabilityScore
   * @return exploitabilityScore
   */
  @javax.annotation.Nullable
  public Float getExploitabilityScore() {
    return exploitabilityScore;
  }

  public void setExploitabilityScore(Float exploitabilityScore) {
    this.exploitabilityScore = exploitabilityScore;
  }


  public CVSSv3 impactScore(Float impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Get impactScore
   * @return impactScore
   */
  @javax.annotation.Nullable
  public Float getImpactScore() {
    return impactScore;
  }

  public void setImpactScore(Float impactScore) {
    this.impactScore = impactScore;
  }


  public CVSSv3 integrityImpact(IntegrityImpactEnum integrityImpact) {
    this.integrityImpact = integrityImpact;
    return this;
  }

  /**
   * Get integrityImpact
   * @return integrityImpact
   */
  @javax.annotation.Nullable
  public IntegrityImpactEnum getIntegrityImpact() {
    return integrityImpact;
  }

  public void setIntegrityImpact(IntegrityImpactEnum integrityImpact) {
    this.integrityImpact = integrityImpact;
  }


  public CVSSv3 privilegesRequired(PrivilegesRequiredEnum privilegesRequired) {
    this.privilegesRequired = privilegesRequired;
    return this;
  }

  /**
   * Get privilegesRequired
   * @return privilegesRequired
   */
  @javax.annotation.Nullable
  public PrivilegesRequiredEnum getPrivilegesRequired() {
    return privilegesRequired;
  }

  public void setPrivilegesRequired(PrivilegesRequiredEnum privilegesRequired) {
    this.privilegesRequired = privilegesRequired;
  }


  public CVSSv3 scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public CVSSv3 userInteraction(UserInteractionEnum userInteraction) {
    this.userInteraction = userInteraction;
    return this;
  }

  /**
   * Get userInteraction
   * @return userInteraction
   */
  @javax.annotation.Nullable
  public UserInteractionEnum getUserInteraction() {
    return userInteraction;
  }

  public void setUserInteraction(UserInteractionEnum userInteraction) {
    this.userInteraction = userInteraction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CVSSv3 cvSSv3 = (CVSSv3) o;
    return Objects.equals(this.attackComplexity, cvSSv3.attackComplexity) &&
        Objects.equals(this.attackVector, cvSSv3.attackVector) &&
        Objects.equals(this.availabilityImpact, cvSSv3.availabilityImpact) &&
        Objects.equals(this.baseScore, cvSSv3.baseScore) &&
        Objects.equals(this.confidentialityImpact, cvSSv3.confidentialityImpact) &&
        Objects.equals(this.exploitabilityScore, cvSSv3.exploitabilityScore) &&
        Objects.equals(this.impactScore, cvSSv3.impactScore) &&
        Objects.equals(this.integrityImpact, cvSSv3.integrityImpact) &&
        Objects.equals(this.privilegesRequired, cvSSv3.privilegesRequired) &&
        Objects.equals(this.scope, cvSSv3.scope) &&
        Objects.equals(this.userInteraction, cvSSv3.userInteraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackComplexity, attackVector, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CVSSv3 {\n");
    sb.append("    attackComplexity: ").append(toIndentedString(attackComplexity)).append("\n");
    sb.append("    attackVector: ").append(toIndentedString(attackVector)).append("\n");
    sb.append("    availabilityImpact: ").append(toIndentedString(availabilityImpact)).append("\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    confidentialityImpact: ").append(toIndentedString(confidentialityImpact)).append("\n");
    sb.append("    exploitabilityScore: ").append(toIndentedString(exploitabilityScore)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    integrityImpact: ").append(toIndentedString(integrityImpact)).append("\n");
    sb.append("    privilegesRequired: ").append(toIndentedString(privilegesRequired)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    userInteraction: ").append(toIndentedString(userInteraction)).append("\n");
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
    openapiFields.add("attackComplexity");
    openapiFields.add("attackVector");
    openapiFields.add("availabilityImpact");
    openapiFields.add("baseScore");
    openapiFields.add("confidentialityImpact");
    openapiFields.add("exploitabilityScore");
    openapiFields.add("impactScore");
    openapiFields.add("integrityImpact");
    openapiFields.add("privilegesRequired");
    openapiFields.add("scope");
    openapiFields.add("userInteraction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CVSSv3
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CVSSv3.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CVSSv3 is not found in the empty JSON string", CVSSv3.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CVSSv3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CVSSv3` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attackComplexity") != null && !jsonObj.get("attackComplexity").isJsonNull()) && !jsonObj.get("attackComplexity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attackComplexity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attackComplexity").toString()));
      }
      // validate the optional field `attackComplexity`
      if (jsonObj.get("attackComplexity") != null && !jsonObj.get("attackComplexity").isJsonNull()) {
        AttackComplexityEnum.validateJsonElement(jsonObj.get("attackComplexity"));
      }
      if ((jsonObj.get("attackVector") != null && !jsonObj.get("attackVector").isJsonNull()) && !jsonObj.get("attackVector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attackVector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attackVector").toString()));
      }
      // validate the optional field `attackVector`
      if (jsonObj.get("attackVector") != null && !jsonObj.get("attackVector").isJsonNull()) {
        AttackVectorEnum.validateJsonElement(jsonObj.get("attackVector"));
      }
      if ((jsonObj.get("availabilityImpact") != null && !jsonObj.get("availabilityImpact").isJsonNull()) && !jsonObj.get("availabilityImpact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availabilityImpact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availabilityImpact").toString()));
      }
      // validate the optional field `availabilityImpact`
      if (jsonObj.get("availabilityImpact") != null && !jsonObj.get("availabilityImpact").isJsonNull()) {
        AvailabilityImpactEnum.validateJsonElement(jsonObj.get("availabilityImpact"));
      }
      if ((jsonObj.get("confidentialityImpact") != null && !jsonObj.get("confidentialityImpact").isJsonNull()) && !jsonObj.get("confidentialityImpact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidentialityImpact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidentialityImpact").toString()));
      }
      // validate the optional field `confidentialityImpact`
      if (jsonObj.get("confidentialityImpact") != null && !jsonObj.get("confidentialityImpact").isJsonNull()) {
        ConfidentialityImpactEnum.validateJsonElement(jsonObj.get("confidentialityImpact"));
      }
      if ((jsonObj.get("integrityImpact") != null && !jsonObj.get("integrityImpact").isJsonNull()) && !jsonObj.get("integrityImpact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrityImpact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrityImpact").toString()));
      }
      // validate the optional field `integrityImpact`
      if (jsonObj.get("integrityImpact") != null && !jsonObj.get("integrityImpact").isJsonNull()) {
        IntegrityImpactEnum.validateJsonElement(jsonObj.get("integrityImpact"));
      }
      if ((jsonObj.get("privilegesRequired") != null && !jsonObj.get("privilegesRequired").isJsonNull()) && !jsonObj.get("privilegesRequired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilegesRequired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privilegesRequired").toString()));
      }
      // validate the optional field `privilegesRequired`
      if (jsonObj.get("privilegesRequired") != null && !jsonObj.get("privilegesRequired").isJsonNull()) {
        PrivilegesRequiredEnum.validateJsonElement(jsonObj.get("privilegesRequired"));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        ScopeEnum.validateJsonElement(jsonObj.get("scope"));
      }
      if ((jsonObj.get("userInteraction") != null && !jsonObj.get("userInteraction").isJsonNull()) && !jsonObj.get("userInteraction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userInteraction").toString()));
      }
      // validate the optional field `userInteraction`
      if (jsonObj.get("userInteraction") != null && !jsonObj.get("userInteraction").isJsonNull()) {
        UserInteractionEnum.validateJsonElement(jsonObj.get("userInteraction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CVSSv3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CVSSv3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CVSSv3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CVSSv3.class));

       return (TypeAdapter<T>) new TypeAdapter<CVSSv3>() {
           @Override
           public void write(JsonWriter out, CVSSv3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CVSSv3 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CVSSv3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CVSSv3
   * @throws IOException if the JSON string is invalid with respect to CVSSv3
   */
  public static CVSSv3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CVSSv3.class);
  }

  /**
   * Convert an instance of CVSSv3 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

