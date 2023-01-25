/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
 * Information about a partner&#39;s icon.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:51.108833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Icon {
  /**
   * Gets or Sets disapprovalReasons
   */
  @JsonAdapter(DisapprovalReasonsEnum.Adapter.class)
  public enum DisapprovalReasonsEnum {
    IMAGE_DISAPPROVAL_REASON_UNSPECIFIED("IMAGE_DISAPPROVAL_REASON_UNSPECIFIED"),
    
    NOT_LIKE_SITE("NOT_LIKE_SITE"),
    
    OFFENSIVE("OFFENSIVE"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    ANIMATED("ANIMATED"),
    
    BAD_BACKGROUND("BAD_BACKGROUND"),
    
    TEXT_TOO_SMALL("TEXT_TOO_SMALL");

    private String value;

    DisapprovalReasonsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisapprovalReasonsEnum fromValue(String value) {
      for (DisapprovalReasonsEnum b : DisapprovalReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisapprovalReasonsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisapprovalReasonsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisapprovalReasonsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisapprovalReasonsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DisapprovalReasonsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DISAPPROVAL_REASONS = "disapprovalReasons";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REASONS)
  private List<DisapprovalReasonsEnum> disapprovalReasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_ICON_URI = "iconUri";
  @SerializedName(SERIALIZED_NAME_ICON_URI)
  private String iconUri;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "imageData";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private byte[] imageData;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * Output only. The icon&#39;s current state.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    NEW("NEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

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

  public Icon() {
  }

  public Icon(
     List<DisapprovalReasonsEnum> disapprovalReasons, 
     String iconUri, 
     String name, 
     StateEnum state
  ) {
    this();
    this.disapprovalReasons = disapprovalReasons;
    this.iconUri = iconUri;
    this.name = name;
    this.state = state;
  }

  /**
   * Output only. The icon&#39;s disapproval reason(s). Only applies to icons with &#x60;REJECTED&#x60; state.
   * @return disapprovalReasons
   */
  @javax.annotation.Nullable
  public List<DisapprovalReasonsEnum> getDisapprovalReasons() {
    return disapprovalReasons;
  }



  /**
   * Output only. The approved icon&#39;s Google-hosted URI. Only applies to icons with &#x60;APPROVED&#x60; state.
   * @return iconUri
   */
  @javax.annotation.Nullable
  public String getIconUri() {
    return iconUri;
  }



  public Icon imageData(byte[] imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Required. Input only. The icon contents, which must be in PNG format, or convertible to PNG.
   * @return imageData
   */
  @javax.annotation.Nullable
  public byte[] getImageData() {
    return imageData;
  }

  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }


  /**
   * Required. Output only. The resource name for the icon in the format &#x60;accounts/{account_id}/icons/{icon_id}&#x60;. Google generates the &#x60;icon_id&#x60; during the &#x60;create&#x60; operation. Use the &#x60;icon_id&#x60; to associate the icon with a brand using the [accounts.brands](/hotels/hotel-prices/api-reference/rest/v3/accounts.brands#resource:-brand) API.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public Icon reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Optional. Value for tracking the icon. It could be the primary key to your icon in your system, or the icon&#39;s filename. Google does not use this value.
   * @return reference
   */
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  /**
   * Output only. The icon&#39;s current state.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Icon icon = (Icon) o;
    return Objects.equals(this.disapprovalReasons, icon.disapprovalReasons) &&
        Objects.equals(this.iconUri, icon.iconUri) &&
        Arrays.equals(this.imageData, icon.imageData) &&
        Objects.equals(this.name, icon.name) &&
        Objects.equals(this.reference, icon.reference) &&
        Objects.equals(this.state, icon.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasons, iconUri, Arrays.hashCode(imageData), name, reference, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Icon {\n");
    sb.append("    disapprovalReasons: ").append(toIndentedString(disapprovalReasons)).append("\n");
    sb.append("    iconUri: ").append(toIndentedString(iconUri)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("disapprovalReasons");
    openapiFields.add("iconUri");
    openapiFields.add("imageData");
    openapiFields.add("name");
    openapiFields.add("reference");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Icon
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Icon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Icon is not found in the empty JSON string", Icon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Icon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Icon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("disapprovalReasons") != null && !jsonObj.get("disapprovalReasons").isJsonNull() && !jsonObj.get("disapprovalReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disapprovalReasons` to be an array in the JSON string but got `%s`", jsonObj.get("disapprovalReasons").toString()));
      }
      if ((jsonObj.get("iconUri") != null && !jsonObj.get("iconUri").isJsonNull()) && !jsonObj.get("iconUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUri").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Icon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Icon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Icon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Icon.class));

       return (TypeAdapter<T>) new TypeAdapter<Icon>() {
           @Override
           public void write(JsonWriter out, Icon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Icon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Icon given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Icon
   * @throws IOException if the JSON string is invalid with respect to Icon
   */
  public static Icon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Icon.class);
  }

  /**
   * Convert an instance of Icon to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

