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
 * ModifyListenerOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:07.748801-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModifyListenerOutput {
  public static final String SERIALIZED_NAME_LISTENERS = "Listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List listeners;

  public ModifyListenerOutput() {
  }

  public ModifyListenerOutput listeners(List listeners) {
    this.listeners = listeners;
    return this;
  }

  /**
   * Get listeners
   * @return listeners
   */
  @javax.annotation.Nullable
  public List getListeners() {
    return listeners;
  }

  public void setListeners(List listeners) {
    this.listeners = listeners;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyListenerOutput modifyListenerOutput = (ModifyListenerOutput) o;
    return Objects.equals(this.listeners, modifyListenerOutput.listeners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listeners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyListenerOutput {\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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
    openapiFields.add("Listeners");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyListenerOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyListenerOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyListenerOutput is not found in the empty JSON string", ModifyListenerOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyListenerOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyListenerOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Listeners`
      if (jsonObj.get("Listeners") != null && !jsonObj.get("Listeners").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Listeners"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyListenerOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyListenerOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyListenerOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyListenerOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyListenerOutput>() {
           @Override
           public void write(JsonWriter out, ModifyListenerOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyListenerOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyListenerOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyListenerOutput
   * @throws IOException if the JSON string is invalid with respect to ModifyListenerOutput
   */
  public static ModifyListenerOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyListenerOutput.class);
  }

  /**
   * Convert an instance of ModifyListenerOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

