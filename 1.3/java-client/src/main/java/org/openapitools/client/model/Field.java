/*
 * Dataflow Kit Web Scraper
 * Render Javascript driven pages, while we internally manage Headless Chrome and proxies for you.   - Build a custom web scraper with our Visual point-and-click toolkit. - Scrape the most popular Search engines result pages (SERP). - Convert web pages to PDF and capture screenshots. *** ### Authentication Dataflow Kit API require you to sign up for an API key in order to use the API.   The API key can be found in the [DFK Dashboard](https://account.dataflowkit.com) after _free registration_.  Pass a secret API Key to all API requests to the server as the `api_key` query parameter.  
 *
 * The version of the OpenAPI document: 1.3
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
import org.openapitools.client.model.FieldFiltersInner;
import org.openapitools.client.model.Parserequest;

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
 * Field
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:44.180158-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Field {
  /**
   * Gets or Sets attrs
   */
  @JsonAdapter(AttrsEnum.Adapter.class)
  public enum AttrsEnum {
    TEXT("text"),
    
    HREF("href"),
    
    SRC("src"),
    
    ALT("alt");

    private String value;

    AttrsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttrsEnum fromValue(String value) {
      for (AttrsEnum b : AttrsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttrsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttrsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttrsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttrsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AttrsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ATTRS = "attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private List<AttrsEnum> attrs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Parserequest details;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<FieldFiltersInner> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  /**
   * Selector type. ( 0 - image, 1 - text, 2 - link)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public Field() {
  }

  public Field attrs(List<AttrsEnum> attrs) {
    this.attrs = attrs;
    return this;
  }

  public Field addAttrsItem(AttrsEnum attrsItem) {
    if (this.attrs == null) {
      this.attrs = new ArrayList<>();
    }
    this.attrs.add(attrsItem);
    return this;
  }

  /**
   * A set of attributes to extract from a Field. Find more information about attributes
   * @return attrs
   */
  @javax.annotation.Nonnull
  public List<AttrsEnum> getAttrs() {
    return attrs;
  }

  public void setAttrs(List<AttrsEnum> attrs) {
    this.attrs = attrs;
  }


  public Field details(Parserequest details) {
    this.details = details;
    return this;
  }

  /**
   * Details themself represent independent Parse request that extracts data from linked pages.
   * @return details
   */
  @javax.annotation.Nullable
  public Parserequest getDetails() {
    return details;
  }

  public void setDetails(Parserequest details) {
    this.details = details;
  }


  public Field filters(List<FieldFiltersInner> filters) {
    this.filters = filters;
    return this;
  }

  public Field addFiltersItem(FieldFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters are used to pre-processing of text data when extracting.
   * @return filters
   */
  @javax.annotation.Nullable
  public List<FieldFiltersInner> getFilters() {
    return filters;
  }

  public void setFilters(List<FieldFiltersInner> filters) {
    this.filters = filters;
  }


  public Field name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Field name is used to aggregate results.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Field selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Selector represents a CSS selector for data extraction within the given block.
   * @return selector
   */
  @javax.annotation.Nonnull
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }


  public Field type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Selector type. ( 0 - image, 1 - text, 2 - link)
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.attrs, field.attrs) &&
        Objects.equals(this.details, field.details) &&
        Objects.equals(this.filters, field.filters) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.selector, field.selector) &&
        Objects.equals(this.type, field.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, details, filters, name, selector, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("attrs");
    openapiFields.add("details");
    openapiFields.add("filters");
    openapiFields.add("name");
    openapiFields.add("selector");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attrs");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("selector");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Field
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Field.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Field is not found in the empty JSON string", Field.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Field.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Field` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Field.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("attrs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("attrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attrs` to be an array in the JSON string but got `%s`", jsonObj.get("attrs").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Parserequest.validateJsonElement(jsonObj.get("details"));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            FieldFiltersInner.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Field.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Field' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Field> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Field.class));

       return (TypeAdapter<T>) new TypeAdapter<Field>() {
           @Override
           public void write(JsonWriter out, Field value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Field read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Field given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Field
   * @throws IOException if the JSON string is invalid with respect to Field
   */
  public static Field fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Field.class);
  }

  /**
   * Convert an instance of Field to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

