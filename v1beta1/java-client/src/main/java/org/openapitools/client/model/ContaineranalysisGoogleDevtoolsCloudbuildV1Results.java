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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage;
import org.openapitools.client.model.ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage;

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
 * Artifacts created by the build pipeline.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContaineranalysisGoogleDevtoolsCloudbuildV1Results {
  public static final String SERIALIZED_NAME_ARTIFACT_MANIFEST = "artifactManifest";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_MANIFEST)
  private String artifactManifest;

  public static final String SERIALIZED_NAME_ARTIFACT_TIMING = "artifactTiming";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_TIMING)
  private ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan artifactTiming;

  public static final String SERIALIZED_NAME_BUILD_STEP_IMAGES = "buildStepImages";
  @SerializedName(SERIALIZED_NAME_BUILD_STEP_IMAGES)
  private List<String> buildStepImages = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUILD_STEP_OUTPUTS = "buildStepOutputs";
  @SerializedName(SERIALIZED_NAME_BUILD_STEP_OUTPUTS)
  private List<byte[]> buildStepOutputs = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAVEN_ARTIFACTS = "mavenArtifacts";
  @SerializedName(SERIALIZED_NAME_MAVEN_ARTIFACTS)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact> mavenArtifacts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NPM_PACKAGES = "npmPackages";
  @SerializedName(SERIALIZED_NAME_NPM_PACKAGES)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage> npmPackages = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUM_ARTIFACTS = "numArtifacts";
  @SerializedName(SERIALIZED_NAME_NUM_ARTIFACTS)
  private String numArtifacts;

  public static final String SERIALIZED_NAME_PYTHON_PACKAGES = "pythonPackages";
  @SerializedName(SERIALIZED_NAME_PYTHON_PACKAGES)
  private List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage> pythonPackages = new ArrayList<>();

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results() {
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results artifactManifest(String artifactManifest) {
    this.artifactManifest = artifactManifest;
    return this;
  }

  /**
   * Path to the artifact manifest for non-container artifacts uploaded to Cloud Storage. Only populated when artifacts are uploaded to Cloud Storage.
   * @return artifactManifest
   */
  @javax.annotation.Nullable
  public String getArtifactManifest() {
    return artifactManifest;
  }

  public void setArtifactManifest(String artifactManifest) {
    this.artifactManifest = artifactManifest;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results artifactTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan artifactTiming) {
    this.artifactTiming = artifactTiming;
    return this;
  }

  /**
   * Get artifactTiming
   * @return artifactTiming
   */
  @javax.annotation.Nullable
  public ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan getArtifactTiming() {
    return artifactTiming;
  }

  public void setArtifactTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan artifactTiming) {
    this.artifactTiming = artifactTiming;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results buildStepImages(List<String> buildStepImages) {
    this.buildStepImages = buildStepImages;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addBuildStepImagesItem(String buildStepImagesItem) {
    if (this.buildStepImages == null) {
      this.buildStepImages = new ArrayList<>();
    }
    this.buildStepImages.add(buildStepImagesItem);
    return this;
  }

  /**
   * List of build step digests, in the order corresponding to build step indices.
   * @return buildStepImages
   */
  @javax.annotation.Nullable
  public List<String> getBuildStepImages() {
    return buildStepImages;
  }

  public void setBuildStepImages(List<String> buildStepImages) {
    this.buildStepImages = buildStepImages;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results buildStepOutputs(List<byte[]> buildStepOutputs) {
    this.buildStepOutputs = buildStepOutputs;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addBuildStepOutputsItem(byte[] buildStepOutputsItem) {
    if (this.buildStepOutputs == null) {
      this.buildStepOutputs = new ArrayList<>();
    }
    this.buildStepOutputs.add(buildStepOutputsItem);
    return this;
  }

  /**
   * List of build step outputs, produced by builder images, in the order corresponding to build step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can produce this output by writing to &#x60;$BUILDER_OUTPUT/output&#x60;. Only the first 4KB of data is stored.
   * @return buildStepOutputs
   */
  @javax.annotation.Nullable
  public List<byte[]> getBuildStepOutputs() {
    return buildStepOutputs;
  }

  public void setBuildStepOutputs(List<byte[]> buildStepOutputs) {
    this.buildStepOutputs = buildStepOutputs;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results images(List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> images) {
    this.images = images;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addImagesItem(ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Container images that were built as a part of the build.
   * @return images
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> getImages() {
    return images;
  }

  public void setImages(List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> images) {
    this.images = images;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results mavenArtifacts(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact> mavenArtifacts) {
    this.mavenArtifacts = mavenArtifacts;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addMavenArtifactsItem(ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact mavenArtifactsItem) {
    if (this.mavenArtifacts == null) {
      this.mavenArtifacts = new ArrayList<>();
    }
    this.mavenArtifacts.add(mavenArtifactsItem);
    return this;
  }

  /**
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * @return mavenArtifacts
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact> getMavenArtifacts() {
    return mavenArtifacts;
  }

  public void setMavenArtifacts(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact> mavenArtifacts) {
    this.mavenArtifacts = mavenArtifacts;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results npmPackages(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage> npmPackages) {
    this.npmPackages = npmPackages;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addNpmPackagesItem(ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage npmPackagesItem) {
    if (this.npmPackages == null) {
      this.npmPackages = new ArrayList<>();
    }
    this.npmPackages.add(npmPackagesItem);
    return this;
  }

  /**
   * Npm packages uploaded to Artifact Registry at the end of the build.
   * @return npmPackages
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage> getNpmPackages() {
    return npmPackages;
  }

  public void setNpmPackages(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage> npmPackages) {
    this.npmPackages = npmPackages;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results numArtifacts(String numArtifacts) {
    this.numArtifacts = numArtifacts;
    return this;
  }

  /**
   * Number of non-container artifacts uploaded to Cloud Storage. Only populated when artifacts are uploaded to Cloud Storage.
   * @return numArtifacts
   */
  @javax.annotation.Nullable
  public String getNumArtifacts() {
    return numArtifacts;
  }

  public void setNumArtifacts(String numArtifacts) {
    this.numArtifacts = numArtifacts;
  }


  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results pythonPackages(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage> pythonPackages) {
    this.pythonPackages = pythonPackages;
    return this;
  }

  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results addPythonPackagesItem(ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage pythonPackagesItem) {
    if (this.pythonPackages == null) {
      this.pythonPackages = new ArrayList<>();
    }
    this.pythonPackages.add(pythonPackagesItem);
    return this;
  }

  /**
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * @return pythonPackages
   */
  @javax.annotation.Nullable
  public List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage> getPythonPackages() {
    return pythonPackages;
  }

  public void setPythonPackages(List<ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage> pythonPackages) {
    this.pythonPackages = pythonPackages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaineranalysisGoogleDevtoolsCloudbuildV1Results containeranalysisGoogleDevtoolsCloudbuildV1Results = (ContaineranalysisGoogleDevtoolsCloudbuildV1Results) o;
    return Objects.equals(this.artifactManifest, containeranalysisGoogleDevtoolsCloudbuildV1Results.artifactManifest) &&
        Objects.equals(this.artifactTiming, containeranalysisGoogleDevtoolsCloudbuildV1Results.artifactTiming) &&
        Objects.equals(this.buildStepImages, containeranalysisGoogleDevtoolsCloudbuildV1Results.buildStepImages) &&
        Objects.equals(this.buildStepOutputs, containeranalysisGoogleDevtoolsCloudbuildV1Results.buildStepOutputs) &&
        Objects.equals(this.images, containeranalysisGoogleDevtoolsCloudbuildV1Results.images) &&
        Objects.equals(this.mavenArtifacts, containeranalysisGoogleDevtoolsCloudbuildV1Results.mavenArtifacts) &&
        Objects.equals(this.npmPackages, containeranalysisGoogleDevtoolsCloudbuildV1Results.npmPackages) &&
        Objects.equals(this.numArtifacts, containeranalysisGoogleDevtoolsCloudbuildV1Results.numArtifacts) &&
        Objects.equals(this.pythonPackages, containeranalysisGoogleDevtoolsCloudbuildV1Results.pythonPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactManifest, artifactTiming, buildStepImages, buildStepOutputs, images, mavenArtifacts, npmPackages, numArtifacts, pythonPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaineranalysisGoogleDevtoolsCloudbuildV1Results {\n");
    sb.append("    artifactManifest: ").append(toIndentedString(artifactManifest)).append("\n");
    sb.append("    artifactTiming: ").append(toIndentedString(artifactTiming)).append("\n");
    sb.append("    buildStepImages: ").append(toIndentedString(buildStepImages)).append("\n");
    sb.append("    buildStepOutputs: ").append(toIndentedString(buildStepOutputs)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mavenArtifacts: ").append(toIndentedString(mavenArtifacts)).append("\n");
    sb.append("    npmPackages: ").append(toIndentedString(npmPackages)).append("\n");
    sb.append("    numArtifacts: ").append(toIndentedString(numArtifacts)).append("\n");
    sb.append("    pythonPackages: ").append(toIndentedString(pythonPackages)).append("\n");
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
    openapiFields.add("artifactManifest");
    openapiFields.add("artifactTiming");
    openapiFields.add("buildStepImages");
    openapiFields.add("buildStepOutputs");
    openapiFields.add("images");
    openapiFields.add("mavenArtifacts");
    openapiFields.add("npmPackages");
    openapiFields.add("numArtifacts");
    openapiFields.add("pythonPackages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1Results
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Results.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContaineranalysisGoogleDevtoolsCloudbuildV1Results is not found in the empty JSON string", ContaineranalysisGoogleDevtoolsCloudbuildV1Results.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Results.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContaineranalysisGoogleDevtoolsCloudbuildV1Results` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artifactManifest") != null && !jsonObj.get("artifactManifest").isJsonNull()) && !jsonObj.get("artifactManifest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactManifest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactManifest").toString()));
      }
      // validate the optional field `artifactTiming`
      if (jsonObj.get("artifactTiming") != null && !jsonObj.get("artifactTiming").isJsonNull()) {
        ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan.validateJsonElement(jsonObj.get("artifactTiming"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buildStepImages") != null && !jsonObj.get("buildStepImages").isJsonNull() && !jsonObj.get("buildStepImages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildStepImages` to be an array in the JSON string but got `%s`", jsonObj.get("buildStepImages").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buildStepOutputs") != null && !jsonObj.get("buildStepOutputs").isJsonNull() && !jsonObj.get("buildStepOutputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildStepOutputs` to be an array in the JSON string but got `%s`", jsonObj.get("buildStepOutputs").toString()));
      }
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
        if (jsonArrayimages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("images").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
          }

          // validate the optional field `images` (array)
          for (int i = 0; i < jsonArrayimages.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage.validateJsonElement(jsonArrayimages.get(i));
          };
        }
      }
      if (jsonObj.get("mavenArtifacts") != null && !jsonObj.get("mavenArtifacts").isJsonNull()) {
        JsonArray jsonArraymavenArtifacts = jsonObj.getAsJsonArray("mavenArtifacts");
        if (jsonArraymavenArtifacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mavenArtifacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mavenArtifacts` to be an array in the JSON string but got `%s`", jsonObj.get("mavenArtifacts").toString()));
          }

          // validate the optional field `mavenArtifacts` (array)
          for (int i = 0; i < jsonArraymavenArtifacts.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedMavenArtifact.validateJsonElement(jsonArraymavenArtifacts.get(i));
          };
        }
      }
      if (jsonObj.get("npmPackages") != null && !jsonObj.get("npmPackages").isJsonNull()) {
        JsonArray jsonArraynpmPackages = jsonObj.getAsJsonArray("npmPackages");
        if (jsonArraynpmPackages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("npmPackages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `npmPackages` to be an array in the JSON string but got `%s`", jsonObj.get("npmPackages").toString()));
          }

          // validate the optional field `npmPackages` (array)
          for (int i = 0; i < jsonArraynpmPackages.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedNpmPackage.validateJsonElement(jsonArraynpmPackages.get(i));
          };
        }
      }
      if ((jsonObj.get("numArtifacts") != null && !jsonObj.get("numArtifacts").isJsonNull()) && !jsonObj.get("numArtifacts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numArtifacts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numArtifacts").toString()));
      }
      if (jsonObj.get("pythonPackages") != null && !jsonObj.get("pythonPackages").isJsonNull()) {
        JsonArray jsonArraypythonPackages = jsonObj.getAsJsonArray("pythonPackages");
        if (jsonArraypythonPackages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pythonPackages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pythonPackages` to be an array in the JSON string but got `%s`", jsonObj.get("pythonPackages").toString()));
          }

          // validate the optional field `pythonPackages` (array)
          for (int i = 0; i < jsonArraypythonPackages.size(); i++) {
            ContaineranalysisGoogleDevtoolsCloudbuildV1UploadedPythonPackage.validateJsonElement(jsonArraypythonPackages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContaineranalysisGoogleDevtoolsCloudbuildV1Results.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContaineranalysisGoogleDevtoolsCloudbuildV1Results' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1Results> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContaineranalysisGoogleDevtoolsCloudbuildV1Results.class));

       return (TypeAdapter<T>) new TypeAdapter<ContaineranalysisGoogleDevtoolsCloudbuildV1Results>() {
           @Override
           public void write(JsonWriter out, ContaineranalysisGoogleDevtoolsCloudbuildV1Results value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContaineranalysisGoogleDevtoolsCloudbuildV1Results read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Results given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Results
   * @throws IOException if the JSON string is invalid with respect to ContaineranalysisGoogleDevtoolsCloudbuildV1Results
   */
  public static ContaineranalysisGoogleDevtoolsCloudbuildV1Results fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContaineranalysisGoogleDevtoolsCloudbuildV1Results.class);
  }

  /**
   * Convert an instance of ContaineranalysisGoogleDevtoolsCloudbuildV1Results to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

