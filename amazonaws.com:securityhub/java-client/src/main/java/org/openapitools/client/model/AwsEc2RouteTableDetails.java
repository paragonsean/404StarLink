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
 *  Provides details about a route table for the specified VPC. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2RouteTableDetails {
  public static final String SERIALIZED_NAME_ASSOCIATION_SET = "AssociationSet";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_SET)
  private List associationSet;

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PROPAGATING_VGW_SET = "PropagatingVgwSet";
  @SerializedName(SERIALIZED_NAME_PROPAGATING_VGW_SET)
  private List propagatingVgwSet;

  public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";
  @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
  private String routeTableId;

  public static final String SERIALIZED_NAME_ROUTE_SET = "RouteSet";
  @SerializedName(SERIALIZED_NAME_ROUTE_SET)
  private List routeSet;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public AwsEc2RouteTableDetails() {
  }

  public AwsEc2RouteTableDetails associationSet(List associationSet) {
    this.associationSet = associationSet;
    return this;
  }

  /**
   * Get associationSet
   * @return associationSet
   */
  @javax.annotation.Nullable
  public List getAssociationSet() {
    return associationSet;
  }

  public void setAssociationSet(List associationSet) {
    this.associationSet = associationSet;
  }


  public AwsEc2RouteTableDetails ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public AwsEc2RouteTableDetails propagatingVgwSet(List propagatingVgwSet) {
    this.propagatingVgwSet = propagatingVgwSet;
    return this;
  }

  /**
   * Get propagatingVgwSet
   * @return propagatingVgwSet
   */
  @javax.annotation.Nullable
  public List getPropagatingVgwSet() {
    return propagatingVgwSet;
  }

  public void setPropagatingVgwSet(List propagatingVgwSet) {
    this.propagatingVgwSet = propagatingVgwSet;
  }


  public AwsEc2RouteTableDetails routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

  /**
   * Get routeTableId
   * @return routeTableId
   */
  @javax.annotation.Nullable
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }


  public AwsEc2RouteTableDetails routeSet(List routeSet) {
    this.routeSet = routeSet;
    return this;
  }

  /**
   * Get routeSet
   * @return routeSet
   */
  @javax.annotation.Nullable
  public List getRouteSet() {
    return routeSet;
  }

  public void setRouteSet(List routeSet) {
    this.routeSet = routeSet;
  }


  public AwsEc2RouteTableDetails vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2RouteTableDetails awsEc2RouteTableDetails = (AwsEc2RouteTableDetails) o;
    return Objects.equals(this.associationSet, awsEc2RouteTableDetails.associationSet) &&
        Objects.equals(this.ownerId, awsEc2RouteTableDetails.ownerId) &&
        Objects.equals(this.propagatingVgwSet, awsEc2RouteTableDetails.propagatingVgwSet) &&
        Objects.equals(this.routeTableId, awsEc2RouteTableDetails.routeTableId) &&
        Objects.equals(this.routeSet, awsEc2RouteTableDetails.routeSet) &&
        Objects.equals(this.vpcId, awsEc2RouteTableDetails.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationSet, ownerId, propagatingVgwSet, routeTableId, routeSet, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2RouteTableDetails {\n");
    sb.append("    associationSet: ").append(toIndentedString(associationSet)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    propagatingVgwSet: ").append(toIndentedString(propagatingVgwSet)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    routeSet: ").append(toIndentedString(routeSet)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
    openapiFields.add("AssociationSet");
    openapiFields.add("OwnerId");
    openapiFields.add("PropagatingVgwSet");
    openapiFields.add("RouteTableId");
    openapiFields.add("RouteSet");
    openapiFields.add("VpcId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2RouteTableDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2RouteTableDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2RouteTableDetails is not found in the empty JSON string", AwsEc2RouteTableDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2RouteTableDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2RouteTableDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AssociationSet`
      if (jsonObj.get("AssociationSet") != null && !jsonObj.get("AssociationSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AssociationSet"));
      }
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `PropagatingVgwSet`
      if (jsonObj.get("PropagatingVgwSet") != null && !jsonObj.get("PropagatingVgwSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PropagatingVgwSet"));
      }
      // validate the optional field `RouteTableId`
      if (jsonObj.get("RouteTableId") != null && !jsonObj.get("RouteTableId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RouteTableId"));
      }
      // validate the optional field `RouteSet`
      if (jsonObj.get("RouteSet") != null && !jsonObj.get("RouteSet").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RouteSet"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2RouteTableDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2RouteTableDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2RouteTableDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2RouteTableDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2RouteTableDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2RouteTableDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2RouteTableDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2RouteTableDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2RouteTableDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2RouteTableDetails
   */
  public static AwsEc2RouteTableDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2RouteTableDetails.class);
  }

  /**
   * Convert an instance of AwsEc2RouteTableDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

