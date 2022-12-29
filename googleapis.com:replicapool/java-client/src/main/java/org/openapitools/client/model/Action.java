/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
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
import org.openapitools.client.model.EnvVariable;

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
 * An action that gets executed during initialization of the replicas.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:37.514463-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Action {
  public static final String SERIALIZED_NAME_COMMANDS = "commands";
  @SerializedName(SERIALIZED_NAME_COMMANDS)
  private List<String> commands = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV_VARIABLES = "envVariables";
  @SerializedName(SERIALIZED_NAME_ENV_VARIABLES)
  private List<EnvVariable> envVariables = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMEOUT_MILLI_SECONDS = "timeoutMilliSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_MILLI_SECONDS)
  private Integer timeoutMilliSeconds;

  public Action() {
  }

  public Action commands(List<String> commands) {
    this.commands = commands;
    return this;
  }

  public Action addCommandsItem(String commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

  /**
   * A list of commands to run, one per line. If any command fails, the whole action is considered a failure and no further actions are run. This also marks the virtual machine or replica as a failure.
   * @return commands
   */
  @javax.annotation.Nullable
  public List<String> getCommands() {
    return commands;
  }

  public void setCommands(List<String> commands) {
    this.commands = commands;
  }


  public Action envVariables(List<EnvVariable> envVariables) {
    this.envVariables = envVariables;
    return this;
  }

  public Action addEnvVariablesItem(EnvVariable envVariablesItem) {
    if (this.envVariables == null) {
      this.envVariables = new ArrayList<>();
    }
    this.envVariables.add(envVariablesItem);
    return this;
  }

  /**
   * A list of environment variables to use for the commands in this action.
   * @return envVariables
   */
  @javax.annotation.Nullable
  public List<EnvVariable> getEnvVariables() {
    return envVariables;
  }

  public void setEnvVariables(List<EnvVariable> envVariables) {
    this.envVariables = envVariables;
  }


  public Action timeoutMilliSeconds(Integer timeoutMilliSeconds) {
    this.timeoutMilliSeconds = timeoutMilliSeconds;
    return this;
  }

  /**
   * If an action&#39;s commands on a particular replica do not finish in the specified timeoutMilliSeconds, the replica is considered to be in a FAILING state. No efforts are made to stop any processes that were spawned or created as the result of running the action&#39;s commands. The default is the max allowed value, 1 hour (i.e. 3600000 milliseconds).
   * @return timeoutMilliSeconds
   */
  @javax.annotation.Nullable
  public Integer getTimeoutMilliSeconds() {
    return timeoutMilliSeconds;
  }

  public void setTimeoutMilliSeconds(Integer timeoutMilliSeconds) {
    this.timeoutMilliSeconds = timeoutMilliSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(this.commands, action.commands) &&
        Objects.equals(this.envVariables, action.envVariables) &&
        Objects.equals(this.timeoutMilliSeconds, action.timeoutMilliSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands, envVariables, timeoutMilliSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    timeoutMilliSeconds: ").append(toIndentedString(timeoutMilliSeconds)).append("\n");
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
    openapiFields.add("commands");
    openapiFields.add("envVariables");
    openapiFields.add("timeoutMilliSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Action
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Action.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Action is not found in the empty JSON string", Action.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Action.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Action` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("commands") != null && !jsonObj.get("commands").isJsonNull() && !jsonObj.get("commands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commands` to be an array in the JSON string but got `%s`", jsonObj.get("commands").toString()));
      }
      if (jsonObj.get("envVariables") != null && !jsonObj.get("envVariables").isJsonNull()) {
        JsonArray jsonArrayenvVariables = jsonObj.getAsJsonArray("envVariables");
        if (jsonArrayenvVariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("envVariables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `envVariables` to be an array in the JSON string but got `%s`", jsonObj.get("envVariables").toString()));
          }

          // validate the optional field `envVariables` (array)
          for (int i = 0; i < jsonArrayenvVariables.size(); i++) {
            EnvVariable.validateJsonElement(jsonArrayenvVariables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Action.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Action' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Action> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Action.class));

       return (TypeAdapter<T>) new TypeAdapter<Action>() {
           @Override
           public void write(JsonWriter out, Action value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Action read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Action given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Action
   * @throws IOException if the JSON string is invalid with respect to Action
   */
  public static Action fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Action.class);
  }

  /**
   * Convert an instance of Action to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

