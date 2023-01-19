/*
 * Amazon DynamoDB Streams
 * <fullname>Amazon DynamoDB</fullname> <p>Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about application development with Streams, see <a href=\"https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html\">Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.</p>
 *
 * The version of the OpenAPI document: 2012-08-10
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
import org.openapitools.client.model.KeyType;

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
 * &lt;p&gt;Represents &lt;i&gt;a single element&lt;/i&gt; of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.&lt;/p&gt; &lt;p&gt;A &lt;code&gt;KeySchemaElement&lt;/code&gt; represents exactly one attribute of the primary key. For example, a simple primary key would be represented by one &lt;code&gt;KeySchemaElement&lt;/code&gt; (for the partition key). A composite primary key would require one &lt;code&gt;KeySchemaElement&lt;/code&gt; for the partition key, and another &lt;code&gt;KeySchemaElement&lt;/code&gt; for the sort key.&lt;/p&gt; &lt;p&gt;A &lt;code&gt;KeySchemaElement&lt;/code&gt; must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:33.390334-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class KeySchemaElement {
  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "AttributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private KeyType keyType;

  public KeySchemaElement() {
  }

  public KeySchemaElement attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Get attributeName
   * @return attributeName
   */
  @javax.annotation.Nonnull
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public KeySchemaElement keyType(KeyType keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   * @return keyType
   */
  @javax.annotation.Nonnull
  public KeyType getKeyType() {
    return keyType;
  }

  public void setKeyType(KeyType keyType) {
    this.keyType = keyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeySchemaElement keySchemaElement = (KeySchemaElement) o;
    return Objects.equals(this.attributeName, keySchemaElement.attributeName) &&
        Objects.equals(this.keyType, keySchemaElement.keyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, keyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeySchemaElement {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
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
    openapiFields.add("AttributeName");
    openapiFields.add("KeyType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AttributeName");
    openapiRequiredFields.add("KeyType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeySchemaElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeySchemaElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeySchemaElement is not found in the empty JSON string", KeySchemaElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KeySchemaElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeySchemaElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeySchemaElement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `AttributeName`
      String.validateJsonElement(jsonObj.get("AttributeName"));
      // validate the required field `KeyType`
      KeyType.validateJsonElement(jsonObj.get("KeyType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeySchemaElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeySchemaElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeySchemaElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeySchemaElement.class));

       return (TypeAdapter<T>) new TypeAdapter<KeySchemaElement>() {
           @Override
           public void write(JsonWriter out, KeySchemaElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeySchemaElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KeySchemaElement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KeySchemaElement
   * @throws IOException if the JSON string is invalid with respect to KeySchemaElement
   */
  public static KeySchemaElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeySchemaElement.class);
  }

  /**
   * Convert an instance of KeySchemaElement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

