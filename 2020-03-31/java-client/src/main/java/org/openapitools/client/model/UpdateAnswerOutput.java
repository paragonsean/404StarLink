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
import java.util.Arrays;
import org.openapitools.client.model.Answer;

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
 * Output of a update answer call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateAnswerOutput {
  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public static final String SERIALIZED_NAME_LENS_ALIAS = "LensAlias";
  @SerializedName(SERIALIZED_NAME_LENS_ALIAS)
  private String lensAlias;

  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public static final String SERIALIZED_NAME_ANSWER = "Answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private Answer answer;

  public UpdateAnswerOutput() {
  }

  public UpdateAnswerOutput workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * The ID assigned to the workload. This ID is unique within an Amazon Web Services Region.
   * @return workloadId
   */
  @javax.annotation.Nullable
  public String getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }


  public UpdateAnswerOutput lensAlias(String lensAlias) {
    this.lensAlias = lensAlias;
    return this;
  }

  /**
   * &lt;p&gt;The alias of the lens.&lt;/p&gt; &lt;p&gt;For Amazon Web Services official lenses, this is either the lens alias, such as &lt;code&gt;serverless&lt;/code&gt;, or the lens ARN, such as &lt;code&gt;arn:aws:wellarchitected:us-east-1::lens/serverless&lt;/code&gt;. Note that some operations (such as ExportLens and CreateLensShare) are not permitted on Amazon Web Services official lenses.&lt;/p&gt; &lt;p&gt;For custom lenses, this is the lens ARN, such as &lt;code&gt;arn:aws:wellarchitected:us-west-2:123456789012:lens/0123456789abcdef01234567890abcdef&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;Each lens is identified by its &lt;a&gt;LensSummary$LensAlias&lt;/a&gt;.&lt;/p&gt;
   * @return lensAlias
   */
  @javax.annotation.Nullable
  public String getLensAlias() {
    return lensAlias;
  }

  public void setLensAlias(String lensAlias) {
    this.lensAlias = lensAlias;
  }


  public UpdateAnswerOutput lensArn(String lensArn) {
    this.lensArn = lensArn;
    return this;
  }

  /**
   * Get lensArn
   * @return lensArn
   */
  @javax.annotation.Nullable
  public String getLensArn() {
    return lensArn;
  }

  public void setLensArn(String lensArn) {
    this.lensArn = lensArn;
  }


  public UpdateAnswerOutput answer(Answer answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  @javax.annotation.Nullable
  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnswerOutput updateAnswerOutput = (UpdateAnswerOutput) o;
    return Objects.equals(this.workloadId, updateAnswerOutput.workloadId) &&
        Objects.equals(this.lensAlias, updateAnswerOutput.lensAlias) &&
        Objects.equals(this.lensArn, updateAnswerOutput.lensArn) &&
        Objects.equals(this.answer, updateAnswerOutput.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadId, lensAlias, lensArn, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnswerOutput {\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    lensAlias: ").append(toIndentedString(lensAlias)).append("\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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
    openapiFields.add("WorkloadId");
    openapiFields.add("LensAlias");
    openapiFields.add("LensArn");
    openapiFields.add("Answer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAnswerOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAnswerOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAnswerOutput is not found in the empty JSON string", UpdateAnswerOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAnswerOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAnswerOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WorkloadId") != null && !jsonObj.get("WorkloadId").isJsonNull()) && !jsonObj.get("WorkloadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadId").toString()));
      }
      if ((jsonObj.get("LensAlias") != null && !jsonObj.get("LensAlias").isJsonNull()) && !jsonObj.get("LensAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensAlias").toString()));
      }
      // validate the optional field `LensArn`
      if (jsonObj.get("LensArn") != null && !jsonObj.get("LensArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensArn"));
      }
      // validate the optional field `Answer`
      if (jsonObj.get("Answer") != null && !jsonObj.get("Answer").isJsonNull()) {
        Answer.validateJsonElement(jsonObj.get("Answer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAnswerOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAnswerOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAnswerOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAnswerOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAnswerOutput>() {
           @Override
           public void write(JsonWriter out, UpdateAnswerOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAnswerOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAnswerOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAnswerOutput
   * @throws IOException if the JSON string is invalid with respect to UpdateAnswerOutput
   */
  public static UpdateAnswerOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAnswerOutput.class);
  }

  /**
   * Convert an instance of UpdateAnswerOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

