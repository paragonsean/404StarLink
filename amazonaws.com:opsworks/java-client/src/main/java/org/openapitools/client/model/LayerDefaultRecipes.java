/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
 * LayerDefaultRecipes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:31.585098-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LayerDefaultRecipes {
  public static final String SERIALIZED_NAME_SETUP = "Setup";
  @SerializedName(SERIALIZED_NAME_SETUP)
  private List setup;

  public static final String SERIALIZED_NAME_CONFIGURE = "Configure";
  @SerializedName(SERIALIZED_NAME_CONFIGURE)
  private List configure;

  public static final String SERIALIZED_NAME_DEPLOY = "Deploy";
  @SerializedName(SERIALIZED_NAME_DEPLOY)
  private List deploy;

  public static final String SERIALIZED_NAME_UNDEPLOY = "Undeploy";
  @SerializedName(SERIALIZED_NAME_UNDEPLOY)
  private List undeploy;

  public static final String SERIALIZED_NAME_SHUTDOWN = "Shutdown";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN)
  private List shutdown;

  public LayerDefaultRecipes() {
  }

  public LayerDefaultRecipes setup(List setup) {
    this.setup = setup;
    return this;
  }

  /**
   * Get setup
   * @return setup
   */
  @javax.annotation.Nullable
  public List getSetup() {
    return setup;
  }

  public void setSetup(List setup) {
    this.setup = setup;
  }


  public LayerDefaultRecipes configure(List configure) {
    this.configure = configure;
    return this;
  }

  /**
   * Get configure
   * @return configure
   */
  @javax.annotation.Nullable
  public List getConfigure() {
    return configure;
  }

  public void setConfigure(List configure) {
    this.configure = configure;
  }


  public LayerDefaultRecipes deploy(List deploy) {
    this.deploy = deploy;
    return this;
  }

  /**
   * Get deploy
   * @return deploy
   */
  @javax.annotation.Nullable
  public List getDeploy() {
    return deploy;
  }

  public void setDeploy(List deploy) {
    this.deploy = deploy;
  }


  public LayerDefaultRecipes undeploy(List undeploy) {
    this.undeploy = undeploy;
    return this;
  }

  /**
   * Get undeploy
   * @return undeploy
   */
  @javax.annotation.Nullable
  public List getUndeploy() {
    return undeploy;
  }

  public void setUndeploy(List undeploy) {
    this.undeploy = undeploy;
  }


  public LayerDefaultRecipes shutdown(List shutdown) {
    this.shutdown = shutdown;
    return this;
  }

  /**
   * Get shutdown
   * @return shutdown
   */
  @javax.annotation.Nullable
  public List getShutdown() {
    return shutdown;
  }

  public void setShutdown(List shutdown) {
    this.shutdown = shutdown;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerDefaultRecipes layerDefaultRecipes = (LayerDefaultRecipes) o;
    return Objects.equals(this.setup, layerDefaultRecipes.setup) &&
        Objects.equals(this.configure, layerDefaultRecipes.configure) &&
        Objects.equals(this.deploy, layerDefaultRecipes.deploy) &&
        Objects.equals(this.undeploy, layerDefaultRecipes.undeploy) &&
        Objects.equals(this.shutdown, layerDefaultRecipes.shutdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setup, configure, deploy, undeploy, shutdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerDefaultRecipes {\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    configure: ").append(toIndentedString(configure)).append("\n");
    sb.append("    deploy: ").append(toIndentedString(deploy)).append("\n");
    sb.append("    undeploy: ").append(toIndentedString(undeploy)).append("\n");
    sb.append("    shutdown: ").append(toIndentedString(shutdown)).append("\n");
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
    openapiFields.add("Setup");
    openapiFields.add("Configure");
    openapiFields.add("Deploy");
    openapiFields.add("Undeploy");
    openapiFields.add("Shutdown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LayerDefaultRecipes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LayerDefaultRecipes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LayerDefaultRecipes is not found in the empty JSON string", LayerDefaultRecipes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LayerDefaultRecipes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LayerDefaultRecipes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Setup`
      if (jsonObj.get("Setup") != null && !jsonObj.get("Setup").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Setup"));
      }
      // validate the optional field `Configure`
      if (jsonObj.get("Configure") != null && !jsonObj.get("Configure").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Configure"));
      }
      // validate the optional field `Deploy`
      if (jsonObj.get("Deploy") != null && !jsonObj.get("Deploy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Deploy"));
      }
      // validate the optional field `Undeploy`
      if (jsonObj.get("Undeploy") != null && !jsonObj.get("Undeploy").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Undeploy"));
      }
      // validate the optional field `Shutdown`
      if (jsonObj.get("Shutdown") != null && !jsonObj.get("Shutdown").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Shutdown"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LayerDefaultRecipes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LayerDefaultRecipes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LayerDefaultRecipes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LayerDefaultRecipes.class));

       return (TypeAdapter<T>) new TypeAdapter<LayerDefaultRecipes>() {
           @Override
           public void write(JsonWriter out, LayerDefaultRecipes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LayerDefaultRecipes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LayerDefaultRecipes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LayerDefaultRecipes
   * @throws IOException if the JSON string is invalid with respect to LayerDefaultRecipes
   */
  public static LayerDefaultRecipes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LayerDefaultRecipes.class);
  }

  /**
   * Convert an instance of LayerDefaultRecipes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

