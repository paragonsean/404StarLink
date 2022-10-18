/*
 * The SureVoIP RESTful API
 * # Introduction Welcome to the SureVoIP RESTful hypermedia API (sometimes known as a VoIP REST API, Telecom REST API, SIP API, Hypermedia API or just VoIP API.)  The SureVoIP API is a way for you to automate your interaction with the SureVoIP platforms. With the API, you can create your own scripts, applications or mashups which can: * List calls * create customers * search numbers * provision numbers * send SMS texts * create outbound calls * schedule announcements * schedule call hangups with an announcement * subscribe to events/alerts * track calls * retrieve invoices * grab your SIP details * check your IP address * be 100% self-sufficient * and much more! 
 *
 * The version of the OpenAPI document: 9dcb0dc8
 * Contact: support@surevoip.co.uk
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
 * CallsPostRequestOptionsPlayAudioInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:24.569656-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CallsPostRequestOptionsPlayAudioInner {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT_ID = "announcement_id";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_ID)
  private String announcementId;

  public CallsPostRequestOptionsPlayAudioInner() {
  }

  public CallsPostRequestOptionsPlayAudioInner announcementId(String announcementId) {
    this.announcementId = announcementId;
    return this;
  }

  /**
   * Id of announcement audio file which will play to the a leg of the call, i.e. the person that must answer the call first. This plays one or more audio files you have uploaded. The use case being you want to play audio to let the a leg of the call know what the call is about. Imagine a call center agent needs to know that they are calling a customer. These audio files may play a customer account number to the agent for example.  Have lots of audio files in this array to build up a message 
   * @return announcementId
   */
  @javax.annotation.Nullable
  public String getAnnouncementId() {
    return announcementId;
  }

  public void setAnnouncementId(String announcementId) {
    this.announcementId = announcementId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallsPostRequestOptionsPlayAudioInner callsPostRequestOptionsPlayAudioInner = (CallsPostRequestOptionsPlayAudioInner) o;
    return Objects.equals(this.announcementId, callsPostRequestOptionsPlayAudioInner.announcementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsPostRequestOptionsPlayAudioInner {\n");
    sb.append("    announcementId: ").append(toIndentedString(announcementId)).append("\n");
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
    openapiFields.add("announcement_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallsPostRequestOptionsPlayAudioInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallsPostRequestOptionsPlayAudioInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallsPostRequestOptionsPlayAudioInner is not found in the empty JSON string", CallsPostRequestOptionsPlayAudioInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallsPostRequestOptionsPlayAudioInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallsPostRequestOptionsPlayAudioInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("announcement_id") != null && !jsonObj.get("announcement_id").isJsonNull()) && !jsonObj.get("announcement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcement_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallsPostRequestOptionsPlayAudioInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallsPostRequestOptionsPlayAudioInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallsPostRequestOptionsPlayAudioInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallsPostRequestOptionsPlayAudioInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CallsPostRequestOptionsPlayAudioInner>() {
           @Override
           public void write(JsonWriter out, CallsPostRequestOptionsPlayAudioInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallsPostRequestOptionsPlayAudioInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallsPostRequestOptionsPlayAudioInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallsPostRequestOptionsPlayAudioInner
   * @throws IOException if the JSON string is invalid with respect to CallsPostRequestOptionsPlayAudioInner
   */
  public static CallsPostRequestOptionsPlayAudioInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallsPostRequestOptionsPlayAudioInner.class);
  }

  /**
   * Convert an instance of CallsPostRequestOptionsPlayAudioInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

