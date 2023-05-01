/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.4
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
import org.openapitools.client.model.ApplicationOut;
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
 * ListResponseApplicationOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:47.716405-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListResponseApplicationOut {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ApplicationOut> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public static final String SERIALIZED_NAME_ITERATOR = "iterator";
  @SerializedName(SERIALIZED_NAME_ITERATOR)
  private String iterator;

  public static final String SERIALIZED_NAME_PREV_ITERATOR = "prevIterator";
  @SerializedName(SERIALIZED_NAME_PREV_ITERATOR)
  private String prevIterator;

  public ListResponseApplicationOut() {
  }

  public ListResponseApplicationOut data(List<ApplicationOut> data) {
    this.data = data;
    return this;
  }

  public ListResponseApplicationOut addDataItem(ApplicationOut dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public List<ApplicationOut> getData() {
    return data;
  }

  public void setData(List<ApplicationOut> data) {
    this.data = data;
  }


  public ListResponseApplicationOut done(Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
   */
  @javax.annotation.Nonnull
  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }


  public ListResponseApplicationOut iterator(String iterator) {
    this.iterator = iterator;
    return this;
  }

  /**
   * Get iterator
   * @return iterator
   */
  @javax.annotation.Nullable
  public String getIterator() {
    return iterator;
  }

  public void setIterator(String iterator) {
    this.iterator = iterator;
  }


  public ListResponseApplicationOut prevIterator(String prevIterator) {
    this.prevIterator = prevIterator;
    return this;
  }

  /**
   * Get prevIterator
   * @return prevIterator
   */
  @javax.annotation.Nullable
  public String getPrevIterator() {
    return prevIterator;
  }

  public void setPrevIterator(String prevIterator) {
    this.prevIterator = prevIterator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponseApplicationOut listResponseApplicationOut = (ListResponseApplicationOut) o;
    return Objects.equals(this.data, listResponseApplicationOut.data) &&
        Objects.equals(this.done, listResponseApplicationOut.done) &&
        Objects.equals(this.iterator, listResponseApplicationOut.iterator) &&
        Objects.equals(this.prevIterator, listResponseApplicationOut.prevIterator);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, done, iterator, prevIterator);
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
    sb.append("class ListResponseApplicationOut {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    iterator: ").append(toIndentedString(iterator)).append("\n");
    sb.append("    prevIterator: ").append(toIndentedString(prevIterator)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("done");
    openapiFields.add("iterator");
    openapiFields.add("prevIterator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("done");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListResponseApplicationOut
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListResponseApplicationOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListResponseApplicationOut is not found in the empty JSON string", ListResponseApplicationOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListResponseApplicationOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListResponseApplicationOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListResponseApplicationOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        ApplicationOut.validateJsonElement(jsonArraydata.get(i));
      };
      if ((jsonObj.get("iterator") != null && !jsonObj.get("iterator").isJsonNull()) && !jsonObj.get("iterator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iterator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iterator").toString()));
      }
      if ((jsonObj.get("prevIterator") != null && !jsonObj.get("prevIterator").isJsonNull()) && !jsonObj.get("prevIterator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevIterator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevIterator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListResponseApplicationOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListResponseApplicationOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListResponseApplicationOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListResponseApplicationOut.class));

       return (TypeAdapter<T>) new TypeAdapter<ListResponseApplicationOut>() {
           @Override
           public void write(JsonWriter out, ListResponseApplicationOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListResponseApplicationOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListResponseApplicationOut given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListResponseApplicationOut
   * @throws IOException if the JSON string is invalid with respect to ListResponseApplicationOut
   */
  public static ListResponseApplicationOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListResponseApplicationOut.class);
  }

  /**
   * Convert an instance of ListResponseApplicationOut to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

