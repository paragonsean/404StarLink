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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BookingFieldListItemViewModel;
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
 * BookingFieldViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:31.714197-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BookingFieldViewModel {
  public static final String SERIALIZED_NAME_BUSINESS_ID = "businessId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private String businessId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_FIELD_LABEL = "fieldLabel";
  @SerializedName(SERIALIZED_NAME_FIELD_LABEL)
  private String fieldLabel;

  public static final String SERIALIZED_NAME_FIELD_LENGTH = "fieldLength";
  @SerializedName(SERIALIZED_NAME_FIELD_LENGTH)
  private Integer fieldLength;

  public static final String SERIALIZED_NAME_FIELD_LIST_ITEMS = "fieldListItems";
  @SerializedName(SERIALIZED_NAME_FIELD_LIST_ITEMS)
  private List<BookingFieldListItemViewModel> fieldListItems;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_REQUIRED = "fieldRequired";
  @SerializedName(SERIALIZED_NAME_FIELD_REQUIRED)
  private Boolean fieldRequired;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "fieldType";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private String fieldType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LEAD_QUESTION = "leadQuestion";
  @SerializedName(SERIALIZED_NAME_LEAD_QUESTION)
  private Boolean leadQuestion;

  public static final String SERIALIZED_NAME_LEAD_QUESTION_WEIGHT = "leadQuestionWeight";
  @SerializedName(SERIALIZED_NAME_LEAD_QUESTION_WEIGHT)
  private Double leadQuestionWeight;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_SORT_KEY = "sortKey";
  @SerializedName(SERIALIZED_NAME_SORT_KEY)
  private Integer sortKey;

  public BookingFieldViewModel() {
  }

  public BookingFieldViewModel businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Get businessId
   * @return businessId
   */
  @javax.annotation.Nullable
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public BookingFieldViewModel companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public BookingFieldViewModel fieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
    return this;
  }

  /**
   * Get fieldLabel
   * @return fieldLabel
   */
  @javax.annotation.Nullable
  public String getFieldLabel() {
    return fieldLabel;
  }

  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }


  public BookingFieldViewModel fieldLength(Integer fieldLength) {
    this.fieldLength = fieldLength;
    return this;
  }

  /**
   * Get fieldLength
   * @return fieldLength
   */
  @javax.annotation.Nullable
  public Integer getFieldLength() {
    return fieldLength;
  }

  public void setFieldLength(Integer fieldLength) {
    this.fieldLength = fieldLength;
  }


  public BookingFieldViewModel fieldListItems(List<BookingFieldListItemViewModel> fieldListItems) {
    this.fieldListItems = fieldListItems;
    return this;
  }

  public BookingFieldViewModel addFieldListItemsItem(BookingFieldListItemViewModel fieldListItemsItem) {
    if (this.fieldListItems == null) {
      this.fieldListItems = new ArrayList<>();
    }
    this.fieldListItems.add(fieldListItemsItem);
    return this;
  }

  /**
   * Get fieldListItems
   * @return fieldListItems
   */
  @javax.annotation.Nullable
  public List<BookingFieldListItemViewModel> getFieldListItems() {
    return fieldListItems;
  }

  public void setFieldListItems(List<BookingFieldListItemViewModel> fieldListItems) {
    this.fieldListItems = fieldListItems;
  }


  public BookingFieldViewModel fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public BookingFieldViewModel fieldRequired(Boolean fieldRequired) {
    this.fieldRequired = fieldRequired;
    return this;
  }

  /**
   * Get fieldRequired
   * @return fieldRequired
   */
  @javax.annotation.Nullable
  public Boolean getFieldRequired() {
    return fieldRequired;
  }

  public void setFieldRequired(Boolean fieldRequired) {
    this.fieldRequired = fieldRequired;
  }


  public BookingFieldViewModel fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   * @return fieldType
   */
  @javax.annotation.Nullable
  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public BookingFieldViewModel id(String id) {
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


  public BookingFieldViewModel leadQuestion(Boolean leadQuestion) {
    this.leadQuestion = leadQuestion;
    return this;
  }

  /**
   * Get leadQuestion
   * @return leadQuestion
   */
  @javax.annotation.Nullable
  public Boolean getLeadQuestion() {
    return leadQuestion;
  }

  public void setLeadQuestion(Boolean leadQuestion) {
    this.leadQuestion = leadQuestion;
  }


  public BookingFieldViewModel leadQuestionWeight(Double leadQuestionWeight) {
    this.leadQuestionWeight = leadQuestionWeight;
    return this;
  }

  /**
   * Get leadQuestionWeight
   * @return leadQuestionWeight
   */
  @javax.annotation.Nullable
  public Double getLeadQuestionWeight() {
    return leadQuestionWeight;
  }

  public void setLeadQuestionWeight(Double leadQuestionWeight) {
    this.leadQuestionWeight = leadQuestionWeight;
  }


  public BookingFieldViewModel _object(String _object) {
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


  public BookingFieldViewModel sortKey(Integer sortKey) {
    this.sortKey = sortKey;
    return this;
  }

  /**
   * Get sortKey
   * @return sortKey
   */
  @javax.annotation.Nullable
  public Integer getSortKey() {
    return sortKey;
  }

  public void setSortKey(Integer sortKey) {
    this.sortKey = sortKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingFieldViewModel bookingFieldViewModel = (BookingFieldViewModel) o;
    return Objects.equals(this.businessId, bookingFieldViewModel.businessId) &&
        Objects.equals(this.companyId, bookingFieldViewModel.companyId) &&
        Objects.equals(this.fieldLabel, bookingFieldViewModel.fieldLabel) &&
        Objects.equals(this.fieldLength, bookingFieldViewModel.fieldLength) &&
        Objects.equals(this.fieldListItems, bookingFieldViewModel.fieldListItems) &&
        Objects.equals(this.fieldName, bookingFieldViewModel.fieldName) &&
        Objects.equals(this.fieldRequired, bookingFieldViewModel.fieldRequired) &&
        Objects.equals(this.fieldType, bookingFieldViewModel.fieldType) &&
        Objects.equals(this.id, bookingFieldViewModel.id) &&
        Objects.equals(this.leadQuestion, bookingFieldViewModel.leadQuestion) &&
        Objects.equals(this.leadQuestionWeight, bookingFieldViewModel.leadQuestionWeight) &&
        Objects.equals(this._object, bookingFieldViewModel._object) &&
        Objects.equals(this.sortKey, bookingFieldViewModel.sortKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, companyId, fieldLabel, fieldLength, fieldListItems, fieldName, fieldRequired, fieldType, id, leadQuestion, leadQuestionWeight, _object, sortKey);
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
    sb.append("class BookingFieldViewModel {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    fieldLabel: ").append(toIndentedString(fieldLabel)).append("\n");
    sb.append("    fieldLength: ").append(toIndentedString(fieldLength)).append("\n");
    sb.append("    fieldListItems: ").append(toIndentedString(fieldListItems)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldRequired: ").append(toIndentedString(fieldRequired)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadQuestion: ").append(toIndentedString(leadQuestion)).append("\n");
    sb.append("    leadQuestionWeight: ").append(toIndentedString(leadQuestionWeight)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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
    openapiFields.add("businessId");
    openapiFields.add("companyId");
    openapiFields.add("fieldLabel");
    openapiFields.add("fieldLength");
    openapiFields.add("fieldListItems");
    openapiFields.add("fieldName");
    openapiFields.add("fieldRequired");
    openapiFields.add("fieldType");
    openapiFields.add("id");
    openapiFields.add("leadQuestion");
    openapiFields.add("leadQuestionWeight");
    openapiFields.add("object");
    openapiFields.add("sortKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BookingFieldViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BookingFieldViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookingFieldViewModel is not found in the empty JSON string", BookingFieldViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BookingFieldViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookingFieldViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("businessId") != null && !jsonObj.get("businessId").isJsonNull()) && !jsonObj.get("businessId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("fieldLabel") != null && !jsonObj.get("fieldLabel").isJsonNull()) && !jsonObj.get("fieldLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldLabel").toString()));
      }
      if (jsonObj.get("fieldListItems") != null && !jsonObj.get("fieldListItems").isJsonNull()) {
        JsonArray jsonArrayfieldListItems = jsonObj.getAsJsonArray("fieldListItems");
        if (jsonArrayfieldListItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldListItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldListItems` to be an array in the JSON string but got `%s`", jsonObj.get("fieldListItems").toString()));
          }

          // validate the optional field `fieldListItems` (array)
          for (int i = 0; i < jsonArrayfieldListItems.size(); i++) {
            BookingFieldListItemViewModel.validateJsonElement(jsonArrayfieldListItems.get(i));
          };
        }
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      if ((jsonObj.get("fieldType") != null && !jsonObj.get("fieldType").isJsonNull()) && !jsonObj.get("fieldType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldType").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookingFieldViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookingFieldViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookingFieldViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookingFieldViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BookingFieldViewModel>() {
           @Override
           public void write(JsonWriter out, BookingFieldViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookingFieldViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BookingFieldViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BookingFieldViewModel
   * @throws IOException if the JSON string is invalid with respect to BookingFieldViewModel
   */
  public static BookingFieldViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookingFieldViewModel.class);
  }

  /**
   * Convert an instance of BookingFieldViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

