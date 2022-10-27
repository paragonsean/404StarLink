/*
 * Serverless VPC Access API
 * API for managing VPC access connectors.
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
import org.openapitools.client.model.Subnet;

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
 * Definition of a Serverless VPC Access connector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:28.078869-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Connector {
  public static final String SERIALIZED_NAME_CONNECTED_PROJECTS = "connectedProjects";
  @SerializedName(SERIALIZED_NAME_CONNECTED_PROJECTS)
  private List<String> connectedProjects = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP_CIDR_RANGE = "ipCidrRange";
  @SerializedName(SERIALIZED_NAME_IP_CIDR_RANGE)
  private String ipCidrRange;

  public static final String SERIALIZED_NAME_MACHINE_TYPE = "machineType";
  @SerializedName(SERIALIZED_NAME_MACHINE_TYPE)
  private String machineType;

  public static final String SERIALIZED_NAME_MAX_INSTANCES = "maxInstances";
  @SerializedName(SERIALIZED_NAME_MAX_INSTANCES)
  private Integer maxInstances;

  public static final String SERIALIZED_NAME_MAX_THROUGHPUT = "maxThroughput";
  @SerializedName(SERIALIZED_NAME_MAX_THROUGHPUT)
  private Integer maxThroughput;

  public static final String SERIALIZED_NAME_MIN_INSTANCES = "minInstances";
  @SerializedName(SERIALIZED_NAME_MIN_INSTANCES)
  private Integer minInstances;

  public static final String SERIALIZED_NAME_MIN_THROUGHPUT = "minThroughput";
  @SerializedName(SERIALIZED_NAME_MIN_THROUGHPUT)
  private Integer minThroughput;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  /**
   * Output only. State of the VPC access connector.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    READY("READY"),
    
    CREATING("CREATING"),
    
    DELETING("DELETING"),
    
    ERROR("ERROR"),
    
    UPDATING("UPDATING");

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

  public static final String SERIALIZED_NAME_SUBNET = "subnet";
  @SerializedName(SERIALIZED_NAME_SUBNET)
  private Subnet subnet;

  public Connector() {
  }

  public Connector(
     List<String> connectedProjects, 
     StateEnum state
  ) {
    this();
    this.connectedProjects = connectedProjects;
    this.state = state;
  }

  /**
   * Output only. List of projects using the connector.
   * @return connectedProjects
   */
  @javax.annotation.Nullable
  public List<String> getConnectedProjects() {
    return connectedProjects;
  }



  public Connector ipCidrRange(String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * The range of internal addresses that follows RFC 4632 notation. Example: &#x60;10.132.0.0/28&#x60;.
   * @return ipCidrRange
   */
  @javax.annotation.Nullable
  public String getIpCidrRange() {
    return ipCidrRange;
  }

  public void setIpCidrRange(String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
  }


  public Connector machineType(String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Machine type of VM Instance underlying connector. Default is e2-micro
   * @return machineType
   */
  @javax.annotation.Nullable
  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }


  public Connector maxInstances(Integer maxInstances) {
    this.maxInstances = maxInstances;
    return this;
  }

  /**
   * Maximum value of instances in autoscaling group underlying the connector.
   * @return maxInstances
   */
  @javax.annotation.Nullable
  public Integer getMaxInstances() {
    return maxInstances;
  }

  public void setMaxInstances(Integer maxInstances) {
    this.maxInstances = maxInstances;
  }


  public Connector maxThroughput(Integer maxThroughput) {
    this.maxThroughput = maxThroughput;
    return this;
  }

  /**
   * Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
   * @return maxThroughput
   */
  @javax.annotation.Nullable
  public Integer getMaxThroughput() {
    return maxThroughput;
  }

  public void setMaxThroughput(Integer maxThroughput) {
    this.maxThroughput = maxThroughput;
  }


  public Connector minInstances(Integer minInstances) {
    this.minInstances = minInstances;
    return this;
  }

  /**
   * Minimum value of instances in autoscaling group underlying the connector.
   * @return minInstances
   */
  @javax.annotation.Nullable
  public Integer getMinInstances() {
    return minInstances;
  }

  public void setMinInstances(Integer minInstances) {
    this.minInstances = minInstances;
  }


  public Connector minThroughput(Integer minThroughput) {
    this.minThroughput = minThroughput;
    return this;
  }

  /**
   * Minimum throughput of the connector in Mbps. Default and min is 200.
   * @return minThroughput
   */
  @javax.annotation.Nullable
  public Integer getMinThroughput() {
    return minThroughput;
  }

  public void setMinThroughput(Integer minThroughput) {
    this.minThroughput = minThroughput;
  }


  public Connector name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The resource name in the format &#x60;projects/_*_/locations/_*_/connectors/_*&#x60;.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Connector network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Name of a VPC network.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  /**
   * Output only. State of the VPC access connector.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



  public Connector subnet(Subnet subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * Get subnet
   * @return subnet
   */
  @javax.annotation.Nullable
  public Subnet getSubnet() {
    return subnet;
  }

  public void setSubnet(Subnet subnet) {
    this.subnet = subnet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return Objects.equals(this.connectedProjects, connector.connectedProjects) &&
        Objects.equals(this.ipCidrRange, connector.ipCidrRange) &&
        Objects.equals(this.machineType, connector.machineType) &&
        Objects.equals(this.maxInstances, connector.maxInstances) &&
        Objects.equals(this.maxThroughput, connector.maxThroughput) &&
        Objects.equals(this.minInstances, connector.minInstances) &&
        Objects.equals(this.minThroughput, connector.minThroughput) &&
        Objects.equals(this.name, connector.name) &&
        Objects.equals(this.network, connector.network) &&
        Objects.equals(this.state, connector.state) &&
        Objects.equals(this.subnet, connector.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedProjects, ipCidrRange, machineType, maxInstances, maxThroughput, minInstances, minThroughput, name, network, state, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    connectedProjects: ").append(toIndentedString(connectedProjects)).append("\n");
    sb.append("    ipCidrRange: ").append(toIndentedString(ipCidrRange)).append("\n");
    sb.append("    machineType: ").append(toIndentedString(machineType)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    minThroughput: ").append(toIndentedString(minThroughput)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
    openapiFields.add("connectedProjects");
    openapiFields.add("ipCidrRange");
    openapiFields.add("machineType");
    openapiFields.add("maxInstances");
    openapiFields.add("maxThroughput");
    openapiFields.add("minInstances");
    openapiFields.add("minThroughput");
    openapiFields.add("name");
    openapiFields.add("network");
    openapiFields.add("state");
    openapiFields.add("subnet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Connector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connector is not found in the empty JSON string", Connector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("connectedProjects") != null && !jsonObj.get("connectedProjects").isJsonNull() && !jsonObj.get("connectedProjects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectedProjects` to be an array in the JSON string but got `%s`", jsonObj.get("connectedProjects").toString()));
      }
      if ((jsonObj.get("ipCidrRange") != null && !jsonObj.get("ipCidrRange").isJsonNull()) && !jsonObj.get("ipCidrRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipCidrRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipCidrRange").toString()));
      }
      if ((jsonObj.get("machineType") != null && !jsonObj.get("machineType").isJsonNull()) && !jsonObj.get("machineType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machineType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machineType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `subnet`
      if (jsonObj.get("subnet") != null && !jsonObj.get("subnet").isJsonNull()) {
        Subnet.validateJsonElement(jsonObj.get("subnet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connector.class));

       return (TypeAdapter<T>) new TypeAdapter<Connector>() {
           @Override
           public void write(JsonWriter out, Connector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Connector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Connector
   * @throws IOException if the JSON string is invalid with respect to Connector
   */
  public static Connector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connector.class);
  }

  /**
   * Convert an instance of Connector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

