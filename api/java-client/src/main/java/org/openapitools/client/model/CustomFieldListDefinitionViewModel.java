/*
 * OnSched Consumer API
 * Build secure and scalable custom apps for Online Booking. Our flexible API provides many options for availability and booking.  <br><br>  Take the API for a test drive. Just click on the Authorize button below and authenticate.   You can access our demo company profile if you are not a customer, or your own profile by using your assigned ClientId and Secret.  <br><br>  The API has two interfaces, consumer and setup.   <ul>  <li>  The consumer interface provides all the endpoints required for implementing consumer booking flows.  </li>  <li>  The setup interface provides endpoints for profile configuration and setup.  </li>  </ul>  Toggle freely between the two interfaces using the swagger tool bar option labelled 'Select a definition'.  
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CustomFieldListDefinitionViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:28.402833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CustomFieldListDefinitionViewModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LEAD_ANSWER_SCORE = "leadAnswerScore";
  @SerializedName(SERIALIZED_NAME_LEAD_ANSWER_SCORE)
  private Integer leadAnswerScore;

  public static final String SERIALIZED_NAME_LEAD_ROUTING_ENTITY_ID = "leadRoutingEntityId";
  @SerializedName(SERIALIZED_NAME_LEAD_ROUTING_ENTITY_ID)
  private Integer leadRoutingEntityId;

  public static final String SERIALIZED_NAME_LEAD_ROUTING_ENTITY_TYPE = "leadRoutingEntityType";
  @SerializedName(SERIALIZED_NAME_LEAD_ROUTING_ENTITY_TYPE)
  private String leadRoutingEntityType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CustomFieldListDefinitionViewModel() {
  }

  public CustomFieldListDefinitionViewModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CustomFieldListDefinitionViewModel leadAnswerScore(Integer leadAnswerScore) {
    this.leadAnswerScore = leadAnswerScore;
    return this;
  }

  /**
   * Get leadAnswerScore
   * @return leadAnswerScore
   */
  @javax.annotation.Nullable
  public Integer getLeadAnswerScore() {
    return leadAnswerScore;
  }

  public void setLeadAnswerScore(Integer leadAnswerScore) {
    this.leadAnswerScore = leadAnswerScore;
  }


  public CustomFieldListDefinitionViewModel leadRoutingEntityId(Integer leadRoutingEntityId) {
    this.leadRoutingEntityId = leadRoutingEntityId;
    return this;
  }

  /**
   * Get leadRoutingEntityId
   * @return leadRoutingEntityId
   */
  @javax.annotation.Nullable
  public Integer getLeadRoutingEntityId() {
    return leadRoutingEntityId;
  }

  public void setLeadRoutingEntityId(Integer leadRoutingEntityId) {
    this.leadRoutingEntityId = leadRoutingEntityId;
  }


  public CustomFieldListDefinitionViewModel leadRoutingEntityType(String leadRoutingEntityType) {
    this.leadRoutingEntityType = leadRoutingEntityType;
    return this;
  }

  /**
   * Get leadRoutingEntityType
   * @return leadRoutingEntityType
   */
  @javax.annotation.Nullable
  public String getLeadRoutingEntityType() {
    return leadRoutingEntityType;
  }

  public void setLeadRoutingEntityType(String leadRoutingEntityType) {
    this.leadRoutingEntityType = leadRoutingEntityType;
  }


  public CustomFieldListDefinitionViewModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CustomFieldListDefinitionViewModel _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  public CustomFieldListDefinitionViewModel value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldListDefinitionViewModel customFieldListDefinitionViewModel = (CustomFieldListDefinitionViewModel) o;
    return Objects.equals(this.id, customFieldListDefinitionViewModel.id) &&
        Objects.equals(this.leadAnswerScore, customFieldListDefinitionViewModel.leadAnswerScore) &&
        Objects.equals(this.leadRoutingEntityId, customFieldListDefinitionViewModel.leadRoutingEntityId) &&
        Objects.equals(this.leadRoutingEntityType, customFieldListDefinitionViewModel.leadRoutingEntityType) &&
        Objects.equals(this.name, customFieldListDefinitionViewModel.name) &&
        Objects.equals(this._object, customFieldListDefinitionViewModel._object) &&
        Objects.equals(this.value, customFieldListDefinitionViewModel.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, leadAnswerScore, leadRoutingEntityId, leadRoutingEntityType, name, _object, value);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldListDefinitionViewModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadAnswerScore: ").append(toIndentedString(leadAnswerScore)).append("\n");
    sb.append("    leadRoutingEntityId: ").append(toIndentedString(leadRoutingEntityId)).append("\n");
    sb.append("    leadRoutingEntityType: ").append(toIndentedString(leadRoutingEntityType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("leadAnswerScore");
    openapiFields.add("leadRoutingEntityId");
    openapiFields.add("leadRoutingEntityType");
    openapiFields.add("name");
    openapiFields.add("object");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldListDefinitionViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldListDefinitionViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldListDefinitionViewModel is not found in the empty JSON string", CustomFieldListDefinitionViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldListDefinitionViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldListDefinitionViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("leadRoutingEntityType") != null && !jsonObj.get("leadRoutingEntityType").isJsonNull()) && !jsonObj.get("leadRoutingEntityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leadRoutingEntityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leadRoutingEntityType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldListDefinitionViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldListDefinitionViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldListDefinitionViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldListDefinitionViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldListDefinitionViewModel>() {
           @Override
           public void write(JsonWriter out, CustomFieldListDefinitionViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldListDefinitionViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldListDefinitionViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldListDefinitionViewModel
   * @throws IOException if the JSON string is invalid with respect to CustomFieldListDefinitionViewModel
   */
  public static CustomFieldListDefinitionViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldListDefinitionViewModel.class);
  }

  /**
   * Convert an instance of CustomFieldListDefinitionViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

