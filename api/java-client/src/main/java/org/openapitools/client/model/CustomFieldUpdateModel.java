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
 * CustomFieldUpdateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:28.402833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CustomFieldUpdateModel {
  public static final String SERIALIZED_NAME_FIELD1 = "field1";
  @SerializedName(SERIALIZED_NAME_FIELD1)
  private String field1;

  public static final String SERIALIZED_NAME_FIELD10 = "field10";
  @SerializedName(SERIALIZED_NAME_FIELD10)
  private String field10;

  public static final String SERIALIZED_NAME_FIELD2 = "field2";
  @SerializedName(SERIALIZED_NAME_FIELD2)
  private String field2;

  public static final String SERIALIZED_NAME_FIELD3 = "field3";
  @SerializedName(SERIALIZED_NAME_FIELD3)
  private String field3;

  public static final String SERIALIZED_NAME_FIELD4 = "field4";
  @SerializedName(SERIALIZED_NAME_FIELD4)
  private String field4;

  public static final String SERIALIZED_NAME_FIELD5 = "field5";
  @SerializedName(SERIALIZED_NAME_FIELD5)
  private String field5;

  public static final String SERIALIZED_NAME_FIELD6 = "field6";
  @SerializedName(SERIALIZED_NAME_FIELD6)
  private String field6;

  public static final String SERIALIZED_NAME_FIELD7 = "field7";
  @SerializedName(SERIALIZED_NAME_FIELD7)
  private String field7;

  public static final String SERIALIZED_NAME_FIELD8 = "field8";
  @SerializedName(SERIALIZED_NAME_FIELD8)
  private String field8;

  public static final String SERIALIZED_NAME_FIELD9 = "field9";
  @SerializedName(SERIALIZED_NAME_FIELD9)
  private String field9;

  public CustomFieldUpdateModel() {
  }

  public CustomFieldUpdateModel field1(String field1) {
    this.field1 = field1;
    return this;
  }

  /**
   * Get field1
   * @return field1
   */
  @javax.annotation.Nullable
  public String getField1() {
    return field1;
  }

  public void setField1(String field1) {
    this.field1 = field1;
  }


  public CustomFieldUpdateModel field10(String field10) {
    this.field10 = field10;
    return this;
  }

  /**
   * Get field10
   * @return field10
   */
  @javax.annotation.Nullable
  public String getField10() {
    return field10;
  }

  public void setField10(String field10) {
    this.field10 = field10;
  }


  public CustomFieldUpdateModel field2(String field2) {
    this.field2 = field2;
    return this;
  }

  /**
   * Get field2
   * @return field2
   */
  @javax.annotation.Nullable
  public String getField2() {
    return field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }


  public CustomFieldUpdateModel field3(String field3) {
    this.field3 = field3;
    return this;
  }

  /**
   * Get field3
   * @return field3
   */
  @javax.annotation.Nullable
  public String getField3() {
    return field3;
  }

  public void setField3(String field3) {
    this.field3 = field3;
  }


  public CustomFieldUpdateModel field4(String field4) {
    this.field4 = field4;
    return this;
  }

  /**
   * Get field4
   * @return field4
   */
  @javax.annotation.Nullable
  public String getField4() {
    return field4;
  }

  public void setField4(String field4) {
    this.field4 = field4;
  }


  public CustomFieldUpdateModel field5(String field5) {
    this.field5 = field5;
    return this;
  }

  /**
   * Get field5
   * @return field5
   */
  @javax.annotation.Nullable
  public String getField5() {
    return field5;
  }

  public void setField5(String field5) {
    this.field5 = field5;
  }


  public CustomFieldUpdateModel field6(String field6) {
    this.field6 = field6;
    return this;
  }

  /**
   * Get field6
   * @return field6
   */
  @javax.annotation.Nullable
  public String getField6() {
    return field6;
  }

  public void setField6(String field6) {
    this.field6 = field6;
  }


  public CustomFieldUpdateModel field7(String field7) {
    this.field7 = field7;
    return this;
  }

  /**
   * Get field7
   * @return field7
   */
  @javax.annotation.Nullable
  public String getField7() {
    return field7;
  }

  public void setField7(String field7) {
    this.field7 = field7;
  }


  public CustomFieldUpdateModel field8(String field8) {
    this.field8 = field8;
    return this;
  }

  /**
   * Get field8
   * @return field8
   */
  @javax.annotation.Nullable
  public String getField8() {
    return field8;
  }

  public void setField8(String field8) {
    this.field8 = field8;
  }


  public CustomFieldUpdateModel field9(String field9) {
    this.field9 = field9;
    return this;
  }

  /**
   * Get field9
   * @return field9
   */
  @javax.annotation.Nullable
  public String getField9() {
    return field9;
  }

  public void setField9(String field9) {
    this.field9 = field9;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldUpdateModel customFieldUpdateModel = (CustomFieldUpdateModel) o;
    return Objects.equals(this.field1, customFieldUpdateModel.field1) &&
        Objects.equals(this.field10, customFieldUpdateModel.field10) &&
        Objects.equals(this.field2, customFieldUpdateModel.field2) &&
        Objects.equals(this.field3, customFieldUpdateModel.field3) &&
        Objects.equals(this.field4, customFieldUpdateModel.field4) &&
        Objects.equals(this.field5, customFieldUpdateModel.field5) &&
        Objects.equals(this.field6, customFieldUpdateModel.field6) &&
        Objects.equals(this.field7, customFieldUpdateModel.field7) &&
        Objects.equals(this.field8, customFieldUpdateModel.field8) &&
        Objects.equals(this.field9, customFieldUpdateModel.field9);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field10, field2, field3, field4, field5, field6, field7, field8, field9);
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
    sb.append("class CustomFieldUpdateModel {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field10: ").append(toIndentedString(field10)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
    sb.append("    field3: ").append(toIndentedString(field3)).append("\n");
    sb.append("    field4: ").append(toIndentedString(field4)).append("\n");
    sb.append("    field5: ").append(toIndentedString(field5)).append("\n");
    sb.append("    field6: ").append(toIndentedString(field6)).append("\n");
    sb.append("    field7: ").append(toIndentedString(field7)).append("\n");
    sb.append("    field8: ").append(toIndentedString(field8)).append("\n");
    sb.append("    field9: ").append(toIndentedString(field9)).append("\n");
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
    openapiFields.add("field1");
    openapiFields.add("field10");
    openapiFields.add("field2");
    openapiFields.add("field3");
    openapiFields.add("field4");
    openapiFields.add("field5");
    openapiFields.add("field6");
    openapiFields.add("field7");
    openapiFields.add("field8");
    openapiFields.add("field9");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldUpdateModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldUpdateModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldUpdateModel is not found in the empty JSON string", CustomFieldUpdateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldUpdateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldUpdateModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("field1") != null && !jsonObj.get("field1").isJsonNull()) && !jsonObj.get("field1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field1").toString()));
      }
      if ((jsonObj.get("field10") != null && !jsonObj.get("field10").isJsonNull()) && !jsonObj.get("field10").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field10` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field10").toString()));
      }
      if ((jsonObj.get("field2") != null && !jsonObj.get("field2").isJsonNull()) && !jsonObj.get("field2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field2").toString()));
      }
      if ((jsonObj.get("field3") != null && !jsonObj.get("field3").isJsonNull()) && !jsonObj.get("field3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field3").toString()));
      }
      if ((jsonObj.get("field4") != null && !jsonObj.get("field4").isJsonNull()) && !jsonObj.get("field4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field4").toString()));
      }
      if ((jsonObj.get("field5") != null && !jsonObj.get("field5").isJsonNull()) && !jsonObj.get("field5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field5").toString()));
      }
      if ((jsonObj.get("field6") != null && !jsonObj.get("field6").isJsonNull()) && !jsonObj.get("field6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field6").toString()));
      }
      if ((jsonObj.get("field7") != null && !jsonObj.get("field7").isJsonNull()) && !jsonObj.get("field7").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field7` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field7").toString()));
      }
      if ((jsonObj.get("field8") != null && !jsonObj.get("field8").isJsonNull()) && !jsonObj.get("field8").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field8` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field8").toString()));
      }
      if ((jsonObj.get("field9") != null && !jsonObj.get("field9").isJsonNull()) && !jsonObj.get("field9").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field9` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field9").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldUpdateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldUpdateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldUpdateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldUpdateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldUpdateModel>() {
           @Override
           public void write(JsonWriter out, CustomFieldUpdateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldUpdateModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldUpdateModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldUpdateModel
   * @throws IOException if the JSON string is invalid with respect to CustomFieldUpdateModel
   */
  public static CustomFieldUpdateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldUpdateModel.class);
  }

  /**
   * Convert an instance of CustomFieldUpdateModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

