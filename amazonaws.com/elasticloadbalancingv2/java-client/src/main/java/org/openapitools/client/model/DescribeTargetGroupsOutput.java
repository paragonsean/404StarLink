/*
 * Elastic Load Balancing
 * <fullname>Elastic Load Balancing</fullname> <p>A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase the availability of your application. The load balancer also monitors the health of its registered targets and ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic by specifying one or more listeners, which are configured with a protocol and port number for connections from clients to the load balancer. You configure a target group with a protocol and port number for connections from the load balancer to the targets, and with health check settings to be used when checking the health status of the targets.</p> <p>Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load Balancers, Gateway Load Balancers, and Classic Load Balancers. This reference covers the following load balancer types:</p> <ul> <li> <p>Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.</p> </li> <li> <p>Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.</p> </li> <li> <p>Gateway Load Balancer - Operates at the network layer (layer 3).</p> </li> </ul> <p>For more information, see the <a href=\"https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/\">Elastic Load Balancing User Guide</a>.</p> <p>All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat an operation, it succeeds.</p>
 *
 * The version of the OpenAPI document: 2015-12-01
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
 * DescribeTargetGroupsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:07.748801-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeTargetGroupsOutput {
  public static final String SERIALIZED_NAME_TARGET_GROUPS = "TargetGroups";
  @SerializedName(SERIALIZED_NAME_TARGET_GROUPS)
  private List targetGroups;

  public static final String SERIALIZED_NAME_NEXT_MARKER = "NextMarker";
  @SerializedName(SERIALIZED_NAME_NEXT_MARKER)
  private String nextMarker;

  public DescribeTargetGroupsOutput() {
  }

  public DescribeTargetGroupsOutput targetGroups(List targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  /**
   * Get targetGroups
   * @return targetGroups
   */
  @javax.annotation.Nullable
  public List getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List targetGroups) {
    this.targetGroups = targetGroups;
  }


  public DescribeTargetGroupsOutput nextMarker(String nextMarker) {
    this.nextMarker = nextMarker;
    return this;
  }

  /**
   * Get nextMarker
   * @return nextMarker
   */
  @javax.annotation.Nullable
  public String getNextMarker() {
    return nextMarker;
  }

  public void setNextMarker(String nextMarker) {
    this.nextMarker = nextMarker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTargetGroupsOutput describeTargetGroupsOutput = (DescribeTargetGroupsOutput) o;
    return Objects.equals(this.targetGroups, describeTargetGroupsOutput.targetGroups) &&
        Objects.equals(this.nextMarker, describeTargetGroupsOutput.nextMarker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetGroups, nextMarker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTargetGroupsOutput {\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
    openapiFields.add("TargetGroups");
    openapiFields.add("NextMarker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeTargetGroupsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeTargetGroupsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeTargetGroupsOutput is not found in the empty JSON string", DescribeTargetGroupsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeTargetGroupsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeTargetGroupsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TargetGroups`
      if (jsonObj.get("TargetGroups") != null && !jsonObj.get("TargetGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("TargetGroups"));
      }
      // validate the optional field `NextMarker`
      if (jsonObj.get("NextMarker") != null && !jsonObj.get("NextMarker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextMarker"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeTargetGroupsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeTargetGroupsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeTargetGroupsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeTargetGroupsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeTargetGroupsOutput>() {
           @Override
           public void write(JsonWriter out, DescribeTargetGroupsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeTargetGroupsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeTargetGroupsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeTargetGroupsOutput
   * @throws IOException if the JSON string is invalid with respect to DescribeTargetGroupsOutput
   */
  public static DescribeTargetGroupsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeTargetGroupsOutput.class);
  }

  /**
   * Convert an instance of DescribeTargetGroupsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

