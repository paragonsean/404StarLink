/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Justification;
import org.openapitools.client.model.Remediation;

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
 * VexAssessment provides all publisher provided Vex information that is related to this vulnerability.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:03.965307-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VexAssessment {
  public static final String SERIALIZED_NAME_CVE = "cve";
  @SerializedName(SERIALIZED_NAME_CVE)
  private String cve;

  public static final String SERIALIZED_NAME_IMPACTS = "impacts";
  @SerializedName(SERIALIZED_NAME_IMPACTS)
  private List<String> impacts = new ArrayList<>();

  public static final String SERIALIZED_NAME_JUSTIFICATION = "justification";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION)
  private Justification justification;

  public static final String SERIALIZED_NAME_NOTE_NAME = "noteName";
  @SerializedName(SERIALIZED_NAME_NOTE_NAME)
  private String noteName;

  public static final String SERIALIZED_NAME_RELATED_URIS = "relatedUris";
  @SerializedName(SERIALIZED_NAME_RELATED_URIS)
  private List<URI> relatedUris = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMEDIATIONS = "remediations";
  @SerializedName(SERIALIZED_NAME_REMEDIATIONS)
  private List<Remediation> remediations = new ArrayList<>();

  /**
   * Provides the state of this Vulnerability assessment.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    AFFECTED("AFFECTED"),
    
    NOT_AFFECTED("NOT_AFFECTED"),
    
    FIXED("FIXED"),
    
    UNDER_INVESTIGATION("UNDER_INVESTIGATION");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public VexAssessment() {
  }

  public VexAssessment cve(String cve) {
    this.cve = cve;
    return this;
  }

  /**
   * Holds the MITRE standard Common Vulnerabilities and Exposures (CVE) tracking number for the vulnerability.
   * @return cve
   */
  @javax.annotation.Nullable
  public String getCve() {
    return cve;
  }

  public void setCve(String cve) {
    this.cve = cve;
  }


  public VexAssessment impacts(List<String> impacts) {
    this.impacts = impacts;
    return this;
  }

  public VexAssessment addImpactsItem(String impactsItem) {
    if (this.impacts == null) {
      this.impacts = new ArrayList<>();
    }
    this.impacts.add(impactsItem);
    return this;
  }

  /**
   * Contains information about the impact of this vulnerability, this will change with time.
   * @return impacts
   */
  @javax.annotation.Nullable
  public List<String> getImpacts() {
    return impacts;
  }

  public void setImpacts(List<String> impacts) {
    this.impacts = impacts;
  }


  public VexAssessment justification(Justification justification) {
    this.justification = justification;
    return this;
  }

  /**
   * Get justification
   * @return justification
   */
  @javax.annotation.Nullable
  public Justification getJustification() {
    return justification;
  }

  public void setJustification(Justification justification) {
    this.justification = justification;
  }


  public VexAssessment noteName(String noteName) {
    this.noteName = noteName;
    return this;
  }

  /**
   * The VulnerabilityAssessment note from which this VexAssessment was generated. This will be of the form: &#x60;projects/[PROJECT_ID]/notes/[NOTE_ID]&#x60;.
   * @return noteName
   */
  @javax.annotation.Nullable
  public String getNoteName() {
    return noteName;
  }

  public void setNoteName(String noteName) {
    this.noteName = noteName;
  }


  public VexAssessment relatedUris(List<URI> relatedUris) {
    this.relatedUris = relatedUris;
    return this;
  }

  public VexAssessment addRelatedUrisItem(URI relatedUrisItem) {
    if (this.relatedUris == null) {
      this.relatedUris = new ArrayList<>();
    }
    this.relatedUris.add(relatedUrisItem);
    return this;
  }

  /**
   * Holds a list of references associated with this vulnerability item and assessment. These uris have additional information about the vulnerability and the assessment itself. E.g. Link to a document which details how this assessment concluded the state of this vulnerability.
   * @return relatedUris
   */
  @javax.annotation.Nullable
  public List<URI> getRelatedUris() {
    return relatedUris;
  }

  public void setRelatedUris(List<URI> relatedUris) {
    this.relatedUris = relatedUris;
  }


  public VexAssessment remediations(List<Remediation> remediations) {
    this.remediations = remediations;
    return this;
  }

  public VexAssessment addRemediationsItem(Remediation remediationsItem) {
    if (this.remediations == null) {
      this.remediations = new ArrayList<>();
    }
    this.remediations.add(remediationsItem);
    return this;
  }

  /**
   * Specifies details on how to handle (and presumably, fix) a vulnerability.
   * @return remediations
   */
  @javax.annotation.Nullable
  public List<Remediation> getRemediations() {
    return remediations;
  }

  public void setRemediations(List<Remediation> remediations) {
    this.remediations = remediations;
  }


  public VexAssessment state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Provides the state of this Vulnerability assessment.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VexAssessment vexAssessment = (VexAssessment) o;
    return Objects.equals(this.cve, vexAssessment.cve) &&
        Objects.equals(this.impacts, vexAssessment.impacts) &&
        Objects.equals(this.justification, vexAssessment.justification) &&
        Objects.equals(this.noteName, vexAssessment.noteName) &&
        Objects.equals(this.relatedUris, vexAssessment.relatedUris) &&
        Objects.equals(this.remediations, vexAssessment.remediations) &&
        Objects.equals(this.state, vexAssessment.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cve, impacts, justification, noteName, relatedUris, remediations, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VexAssessment {\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    impacts: ").append(toIndentedString(impacts)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    noteName: ").append(toIndentedString(noteName)).append("\n");
    sb.append("    relatedUris: ").append(toIndentedString(relatedUris)).append("\n");
    sb.append("    remediations: ").append(toIndentedString(remediations)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("cve");
    openapiFields.add("impacts");
    openapiFields.add("justification");
    openapiFields.add("noteName");
    openapiFields.add("relatedUris");
    openapiFields.add("remediations");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VexAssessment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VexAssessment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VexAssessment is not found in the empty JSON string", VexAssessment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VexAssessment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VexAssessment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cve") != null && !jsonObj.get("cve").isJsonNull()) && !jsonObj.get("cve").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cve` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cve").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("impacts") != null && !jsonObj.get("impacts").isJsonNull() && !jsonObj.get("impacts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `impacts` to be an array in the JSON string but got `%s`", jsonObj.get("impacts").toString()));
      }
      // validate the optional field `justification`
      if (jsonObj.get("justification") != null && !jsonObj.get("justification").isJsonNull()) {
        Justification.validateJsonElement(jsonObj.get("justification"));
      }
      if ((jsonObj.get("noteName") != null && !jsonObj.get("noteName").isJsonNull()) && !jsonObj.get("noteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noteName").toString()));
      }
      if (jsonObj.get("relatedUris") != null && !jsonObj.get("relatedUris").isJsonNull()) {
        JsonArray jsonArrayrelatedUris = jsonObj.getAsJsonArray("relatedUris");
        if (jsonArrayrelatedUris != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relatedUris").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relatedUris` to be an array in the JSON string but got `%s`", jsonObj.get("relatedUris").toString()));
          }

          // validate the optional field `relatedUris` (array)
          for (int i = 0; i < jsonArrayrelatedUris.size(); i++) {
            URI.validateJsonElement(jsonArrayrelatedUris.get(i));
          };
        }
      }
      if (jsonObj.get("remediations") != null && !jsonObj.get("remediations").isJsonNull()) {
        JsonArray jsonArrayremediations = jsonObj.getAsJsonArray("remediations");
        if (jsonArrayremediations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("remediations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `remediations` to be an array in the JSON string but got `%s`", jsonObj.get("remediations").toString()));
          }

          // validate the optional field `remediations` (array)
          for (int i = 0; i < jsonArrayremediations.size(); i++) {
            Remediation.validateJsonElement(jsonArrayremediations.get(i));
          };
        }
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VexAssessment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VexAssessment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VexAssessment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VexAssessment.class));

       return (TypeAdapter<T>) new TypeAdapter<VexAssessment>() {
           @Override
           public void write(JsonWriter out, VexAssessment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VexAssessment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VexAssessment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VexAssessment
   * @throws IOException if the JSON string is invalid with respect to VexAssessment
   */
  public static VexAssessment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VexAssessment.class);
  }

  /**
   * Convert an instance of VexAssessment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

