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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CallsPostRequestOptionsPlayAudioInner;

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
 * CallsPostRequestOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:46.849483-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CallsPostRequestOptions {
  public static final String SERIALIZED_NAME_A_LEG_CALLER_ID = "a_leg_caller_id";
  @SerializedName(SERIALIZED_NAME_A_LEG_CALLER_ID)
  private String aLegCallerId;

  public static final String SERIALIZED_NAME_A_LEG_ONLY = "a_leg_only";
  @SerializedName(SERIALIZED_NAME_A_LEG_ONLY)
  private Integer aLegOnly;

  public static final String SERIALIZED_NAME_CANCEL_KEY = "cancel_key";
  @SerializedName(SERIALIZED_NAME_CANCEL_KEY)
  private Integer cancelKey;

  public static final String SERIALIZED_NAME_CONNECT_KEY = "connect_key";
  @SerializedName(SERIALIZED_NAME_CONNECT_KEY)
  private Integer connectKey;

  public static final String SERIALIZED_NAME_PLAY_AUDIO = "play_audio";
  @SerializedName(SERIALIZED_NAME_PLAY_AUDIO)
  private List<CallsPostRequestOptionsPlayAudioInner> playAudio = new ArrayList<>();

  public CallsPostRequestOptions() {
  }

  public CallsPostRequestOptions aLegCallerId(String aLegCallerId) {
    this.aLegCallerId = aLegCallerId;
    return this;
  }

  /**
   * Change the caller ID shown to the a leg (from)
   * @return aLegCallerId
   */
  @javax.annotation.Nullable
  public String getaLegCallerId() {
    return aLegCallerId;
  }

  public void setaLegCallerId(String aLegCallerId) {
    this.aLegCallerId = aLegCallerId;
  }


  public CallsPostRequestOptions aLegOnly(Integer aLegOnly) {
    this.aLegOnly = aLegOnly;
    return this;
  }

  /**
   * Do not ring the \&quot;to\&quot; number, only the from and show \&quot;caller_id\&quot;
   * @return aLegOnly
   */
  @javax.annotation.Nullable
  public Integer getaLegOnly() {
    return aLegOnly;
  }

  public void setaLegOnly(Integer aLegOnly) {
    this.aLegOnly = aLegOnly;
  }


  public CallsPostRequestOptions cancelKey(Integer cancelKey) {
    this.cancelKey = cancelKey;
    return this;
  }

  /**
   * The phone keypad number to press to hangup the call and not place the second leg of the call. Default 2
   * @return cancelKey
   */
  @javax.annotation.Nullable
  public Integer getCancelKey() {
    return cancelKey;
  }

  public void setCancelKey(Integer cancelKey) {
    this.cancelKey = cancelKey;
  }


  public CallsPostRequestOptions connectKey(Integer connectKey) {
    this.connectKey = connectKey;
    return this;
  }

  /**
   * The phone keypad number to press in order to place the call to the b leg, i.e. press to confirm. Default 1
   * @return connectKey
   */
  @javax.annotation.Nullable
  public Integer getConnectKey() {
    return connectKey;
  }

  public void setConnectKey(Integer connectKey) {
    this.connectKey = connectKey;
  }


  public CallsPostRequestOptions playAudio(List<CallsPostRequestOptionsPlayAudioInner> playAudio) {
    this.playAudio = playAudio;
    return this;
  }

  public CallsPostRequestOptions addPlayAudioItem(CallsPostRequestOptionsPlayAudioInner playAudioItem) {
    if (this.playAudio == null) {
      this.playAudio = new ArrayList<>();
    }
    this.playAudio.add(playAudioItem);
    return this;
  }

  /**
   * Get playAudio
   * @return playAudio
   */
  @javax.annotation.Nullable
  public List<CallsPostRequestOptionsPlayAudioInner> getPlayAudio() {
    return playAudio;
  }

  public void setPlayAudio(List<CallsPostRequestOptionsPlayAudioInner> playAudio) {
    this.playAudio = playAudio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallsPostRequestOptions callsPostRequestOptions = (CallsPostRequestOptions) o;
    return Objects.equals(this.aLegCallerId, callsPostRequestOptions.aLegCallerId) &&
        Objects.equals(this.aLegOnly, callsPostRequestOptions.aLegOnly) &&
        Objects.equals(this.cancelKey, callsPostRequestOptions.cancelKey) &&
        Objects.equals(this.connectKey, callsPostRequestOptions.connectKey) &&
        Objects.equals(this.playAudio, callsPostRequestOptions.playAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aLegCallerId, aLegOnly, cancelKey, connectKey, playAudio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsPostRequestOptions {\n");
    sb.append("    aLegCallerId: ").append(toIndentedString(aLegCallerId)).append("\n");
    sb.append("    aLegOnly: ").append(toIndentedString(aLegOnly)).append("\n");
    sb.append("    cancelKey: ").append(toIndentedString(cancelKey)).append("\n");
    sb.append("    connectKey: ").append(toIndentedString(connectKey)).append("\n");
    sb.append("    playAudio: ").append(toIndentedString(playAudio)).append("\n");
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
    openapiFields.add("a_leg_caller_id");
    openapiFields.add("a_leg_only");
    openapiFields.add("cancel_key");
    openapiFields.add("connect_key");
    openapiFields.add("play_audio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallsPostRequestOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallsPostRequestOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallsPostRequestOptions is not found in the empty JSON string", CallsPostRequestOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallsPostRequestOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallsPostRequestOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("a_leg_caller_id") != null && !jsonObj.get("a_leg_caller_id").isJsonNull()) && !jsonObj.get("a_leg_caller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a_leg_caller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a_leg_caller_id").toString()));
      }
      if (jsonObj.get("play_audio") != null && !jsonObj.get("play_audio").isJsonNull()) {
        JsonArray jsonArrayplayAudio = jsonObj.getAsJsonArray("play_audio");
        if (jsonArrayplayAudio != null) {
          // ensure the json data is an array
          if (!jsonObj.get("play_audio").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `play_audio` to be an array in the JSON string but got `%s`", jsonObj.get("play_audio").toString()));
          }

          // validate the optional field `play_audio` (array)
          for (int i = 0; i < jsonArrayplayAudio.size(); i++) {
            CallsPostRequestOptionsPlayAudioInner.validateJsonElement(jsonArrayplayAudio.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallsPostRequestOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallsPostRequestOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallsPostRequestOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallsPostRequestOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CallsPostRequestOptions>() {
           @Override
           public void write(JsonWriter out, CallsPostRequestOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallsPostRequestOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallsPostRequestOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallsPostRequestOptions
   * @throws IOException if the JSON string is invalid with respect to CallsPostRequestOptions
   */
  public static CallsPostRequestOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallsPostRequestOptions.class);
  }

  /**
   * Convert an instance of CallsPostRequestOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

