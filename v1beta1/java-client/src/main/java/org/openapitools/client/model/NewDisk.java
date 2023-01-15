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
import java.util.Arrays;
import org.openapitools.client.model.DiskAttachment;
import org.openapitools.client.model.NewDiskInitializeParams;

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
 * A Persistent Disk resource that will be created and attached to each Replica in the Pool. Each Replica will have a unique persistent disk that is created and attached to that Replica in READ_WRITE mode.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:23.087479-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NewDisk {
  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private DiskAttachment attachment;

  public static final String SERIALIZED_NAME_AUTO_DELETE = "autoDelete";
  @SerializedName(SERIALIZED_NAME_AUTO_DELETE)
  private Boolean autoDelete;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Boolean boot;

  public static final String SERIALIZED_NAME_INITIALIZE_PARAMS = "initializeParams";
  @SerializedName(SERIALIZED_NAME_INITIALIZE_PARAMS)
  private NewDiskInitializeParams initializeParams;

  public NewDisk() {
  }

  public NewDisk attachment(DiskAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public DiskAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(DiskAttachment attachment) {
    this.attachment = attachment;
  }


  public NewDisk autoDelete(Boolean autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * If true, then this disk will be deleted when the instance is deleted. The default value is true.
   * @return autoDelete
   */
  @javax.annotation.Nullable
  public Boolean getAutoDelete() {
    return autoDelete;
  }

  public void setAutoDelete(Boolean autoDelete) {
    this.autoDelete = autoDelete;
  }


  public NewDisk boot(Boolean boot) {
    this.boot = boot;
    return this;
  }

  /**
   * If true, indicates that this is the root persistent disk.
   * @return boot
   */
  @javax.annotation.Nullable
  public Boolean getBoot() {
    return boot;
  }

  public void setBoot(Boolean boot) {
    this.boot = boot;
  }


  public NewDisk initializeParams(NewDiskInitializeParams initializeParams) {
    this.initializeParams = initializeParams;
    return this;
  }

  /**
   * Get initializeParams
   * @return initializeParams
   */
  @javax.annotation.Nullable
  public NewDiskInitializeParams getInitializeParams() {
    return initializeParams;
  }

  public void setInitializeParams(NewDiskInitializeParams initializeParams) {
    this.initializeParams = initializeParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewDisk newDisk = (NewDisk) o;
    return Objects.equals(this.attachment, newDisk.attachment) &&
        Objects.equals(this.autoDelete, newDisk.autoDelete) &&
        Objects.equals(this.boot, newDisk.boot) &&
        Objects.equals(this.initializeParams, newDisk.initializeParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, autoDelete, boot, initializeParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewDisk {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
    sb.append("    initializeParams: ").append(toIndentedString(initializeParams)).append("\n");
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
    openapiFields.add("attachment");
    openapiFields.add("autoDelete");
    openapiFields.add("boot");
    openapiFields.add("initializeParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NewDisk
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NewDisk.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewDisk is not found in the empty JSON string", NewDisk.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NewDisk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewDisk` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `attachment`
      if (jsonObj.get("attachment") != null && !jsonObj.get("attachment").isJsonNull()) {
        DiskAttachment.validateJsonElement(jsonObj.get("attachment"));
      }
      // validate the optional field `initializeParams`
      if (jsonObj.get("initializeParams") != null && !jsonObj.get("initializeParams").isJsonNull()) {
        NewDiskInitializeParams.validateJsonElement(jsonObj.get("initializeParams"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewDisk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewDisk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewDisk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewDisk.class));

       return (TypeAdapter<T>) new TypeAdapter<NewDisk>() {
           @Override
           public void write(JsonWriter out, NewDisk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewDisk read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NewDisk given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NewDisk
   * @throws IOException if the JSON string is invalid with respect to NewDisk
   */
  public static NewDisk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewDisk.class);
  }

  /**
   * Convert an instance of NewDisk to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

