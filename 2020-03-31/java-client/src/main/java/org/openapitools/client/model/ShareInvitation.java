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
import org.openapitools.client.model.ShareResourceType;

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
 * The share invitation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ShareInvitation {
  public static final String SERIALIZED_NAME_SHARE_INVITATION_ID = "ShareInvitationId";
  @SerializedName(SERIALIZED_NAME_SHARE_INVITATION_ID)
  private String shareInvitationId;

  public static final String SERIALIZED_NAME_SHARE_RESOURCE_TYPE = "ShareResourceType";
  @SerializedName(SERIALIZED_NAME_SHARE_RESOURCE_TYPE)
  private ShareResourceType shareResourceType;

  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public static final String SERIALIZED_NAME_LENS_ALIAS = "LensAlias";
  @SerializedName(SERIALIZED_NAME_LENS_ALIAS)
  private String lensAlias;

  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public ShareInvitation() {
  }

  public ShareInvitation shareInvitationId(String shareInvitationId) {
    this.shareInvitationId = shareInvitationId;
    return this;
  }

  /**
   * Get shareInvitationId
   * @return shareInvitationId
   */
  @javax.annotation.Nullable
  public String getShareInvitationId() {
    return shareInvitationId;
  }

  public void setShareInvitationId(String shareInvitationId) {
    this.shareInvitationId = shareInvitationId;
  }


  public ShareInvitation shareResourceType(ShareResourceType shareResourceType) {
    this.shareResourceType = shareResourceType;
    return this;
  }

  /**
   * Get shareResourceType
   * @return shareResourceType
   */
  @javax.annotation.Nullable
  public ShareResourceType getShareResourceType() {
    return shareResourceType;
  }

  public void setShareResourceType(ShareResourceType shareResourceType) {
    this.shareResourceType = shareResourceType;
  }


  public ShareInvitation workloadId(String workloadId) {
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


  public ShareInvitation lensAlias(String lensAlias) {
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


  public ShareInvitation lensArn(String lensArn) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareInvitation shareInvitation = (ShareInvitation) o;
    return Objects.equals(this.shareInvitationId, shareInvitation.shareInvitationId) &&
        Objects.equals(this.shareResourceType, shareInvitation.shareResourceType) &&
        Objects.equals(this.workloadId, shareInvitation.workloadId) &&
        Objects.equals(this.lensAlias, shareInvitation.lensAlias) &&
        Objects.equals(this.lensArn, shareInvitation.lensArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareInvitationId, shareResourceType, workloadId, lensAlias, lensArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareInvitation {\n");
    sb.append("    shareInvitationId: ").append(toIndentedString(shareInvitationId)).append("\n");
    sb.append("    shareResourceType: ").append(toIndentedString(shareResourceType)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    lensAlias: ").append(toIndentedString(lensAlias)).append("\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
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
    openapiFields.add("ShareInvitationId");
    openapiFields.add("ShareResourceType");
    openapiFields.add("WorkloadId");
    openapiFields.add("LensAlias");
    openapiFields.add("LensArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ShareInvitation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ShareInvitation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShareInvitation is not found in the empty JSON string", ShareInvitation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ShareInvitation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShareInvitation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ShareInvitationId`
      if (jsonObj.get("ShareInvitationId") != null && !jsonObj.get("ShareInvitationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ShareInvitationId"));
      }
      // validate the optional field `ShareResourceType`
      if (jsonObj.get("ShareResourceType") != null && !jsonObj.get("ShareResourceType").isJsonNull()) {
        ShareResourceType.validateJsonElement(jsonObj.get("ShareResourceType"));
      }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShareInvitation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShareInvitation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShareInvitation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShareInvitation.class));

       return (TypeAdapter<T>) new TypeAdapter<ShareInvitation>() {
           @Override
           public void write(JsonWriter out, ShareInvitation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShareInvitation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ShareInvitation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ShareInvitation
   * @throws IOException if the JSON string is invalid with respect to ShareInvitation
   */
  public static ShareInvitation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShareInvitation.class);
  }

  /**
   * Convert an instance of ShareInvitation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

