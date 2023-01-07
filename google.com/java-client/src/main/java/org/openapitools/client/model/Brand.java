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
import org.openapitools.client.model.DisplayNameDisapprovalReason;
import org.openapitools.client.model.LocalizedText;

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
 * Brand-level icon and display name configuration. Once approved, the icon and display name appear in the search results for properties that the partner has assigned to this brand.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Brand {
  public static final String SERIALIZED_NAME_ACTIVE_DISPLAY_NAMES = "activeDisplayNames";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DISPLAY_NAMES)
  private List<LocalizedText> activeDisplayNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVE_ICON = "activeIcon";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ICON)
  private String activeIcon;

  public static final String SERIALIZED_NAME_ACTIVE_ICON_URI = "activeIconUri";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ICON_URI)
  private String activeIconUri;

  public static final String SERIALIZED_NAME_DISPLAY_NAME_DISAPPROVAL_REASON = "displayNameDisapprovalReason";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_DISAPPROVAL_REASON)
  private List<DisplayNameDisapprovalReason> displayNameDisapprovalReason = new ArrayList<>();

  /**
   * Output only. The brand&#39;s display names review state, which applies to all display name language entries. If there are both submitted and active display names, this refers to the submitted display names.
   */
  @JsonAdapter(DisplayNameStateEnum.Adapter.class)
  public enum DisplayNameStateEnum {
    REVIEW_STATE_UNSPECIFIED("REVIEW_STATE_UNSPECIFIED"),
    
    REVIEW_STATE_NEW("REVIEW_STATE_NEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    DisplayNameStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayNameStateEnum fromValue(String value) {
      for (DisplayNameStateEnum b : DisplayNameStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisplayNameStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayNameStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayNameStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisplayNameStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DisplayNameStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DISPLAY_NAME_STATE = "displayNameState";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_STATE)
  private DisplayNameStateEnum displayNameState;

  public static final String SERIALIZED_NAME_DISPLAY_NAMES = "displayNames";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAMES)
  private List<LocalizedText> displayNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  /**
   * Gets or Sets iconDisapprovalReasons
   */
  @JsonAdapter(IconDisapprovalReasonsEnum.Adapter.class)
  public enum IconDisapprovalReasonsEnum {
    IMAGE_DISAPPROVAL_REASON_UNSPECIFIED("IMAGE_DISAPPROVAL_REASON_UNSPECIFIED"),
    
    NOT_LIKE_SITE("NOT_LIKE_SITE"),
    
    OFFENSIVE("OFFENSIVE"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    ANIMATED("ANIMATED"),
    
    BAD_BACKGROUND("BAD_BACKGROUND"),
    
    TEXT_TOO_SMALL("TEXT_TOO_SMALL");

    private String value;

    IconDisapprovalReasonsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconDisapprovalReasonsEnum fromValue(String value) {
      for (IconDisapprovalReasonsEnum b : IconDisapprovalReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IconDisapprovalReasonsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconDisapprovalReasonsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconDisapprovalReasonsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IconDisapprovalReasonsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IconDisapprovalReasonsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ICON_DISAPPROVAL_REASONS = "iconDisapprovalReasons";
  @SerializedName(SERIALIZED_NAME_ICON_DISAPPROVAL_REASONS)
  private List<IconDisapprovalReasonsEnum> iconDisapprovalReasons = new ArrayList<>();

  /**
   * Output only. The brand&#39;s icon&#39;s review state. If there are both submitted and active icons, this refers to the submitted icon.
   */
  @JsonAdapter(IconStateEnum.Adapter.class)
  public enum IconStateEnum {
    REVIEW_STATE_UNSPECIFIED("REVIEW_STATE_UNSPECIFIED"),
    
    REVIEW_STATE_NEW("REVIEW_STATE_NEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    IconStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconStateEnum fromValue(String value) {
      for (IconStateEnum b : IconStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IconStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IconStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IconStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ICON_STATE = "iconState";
  @SerializedName(SERIALIZED_NAME_ICON_STATE)
  private IconStateEnum iconState;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_COUNT = "propertyCount";
  @SerializedName(SERIALIZED_NAME_PROPERTY_COUNT)
  private String propertyCount;

  public static final String SERIALIZED_NAME_SUBMITTED_DISPLAY_NAMES = "submittedDisplayNames";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DISPLAY_NAMES)
  private List<LocalizedText> submittedDisplayNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBMITTED_ICON = "submittedIcon";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ICON)
  private String submittedIcon;

  public Brand() {
  }

  public Brand(
     List<LocalizedText> activeDisplayNames, 
     String activeIcon, 
     String activeIconUri, 
     List<DisplayNameDisapprovalReason> displayNameDisapprovalReason, 
     DisplayNameStateEnum displayNameState, 
     List<IconDisapprovalReasonsEnum> iconDisapprovalReasons, 
     IconStateEnum iconState, 
     String name, 
     String propertyCount, 
     List<LocalizedText> submittedDisplayNames, 
     String submittedIcon
  ) {
    this();
    this.activeDisplayNames = activeDisplayNames;
    this.activeIcon = activeIcon;
    this.activeIconUri = activeIconUri;
    this.displayNameDisapprovalReason = displayNameDisapprovalReason;
    this.displayNameState = displayNameState;
    this.iconDisapprovalReasons = iconDisapprovalReasons;
    this.iconState = iconState;
    this.name = name;
    this.propertyCount = propertyCount;
    this.submittedDisplayNames = submittedDisplayNames;
    this.submittedIcon = submittedIcon;
  }

  /**
   * Output only. The brand&#39;s active display names in all provided languages, only present if the display name is approved for all provided languages.
   * @return activeDisplayNames
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getActiveDisplayNames() {
    return activeDisplayNames;
  }



  /**
   * Output only. The brand&#39;s active [accounts.icon](/hotels/hotel-prices/api-reference/rest/v3/accounts.icons#resource:-iconresource). The value refers to the icons&#39;s resource name in the format &#x60;accounts/{account_id}/icons/{icon_id}&#x60;. An active icon is one that has been approved.
   * @return activeIcon
   */
  @javax.annotation.Nullable
  public String getActiveIcon() {
    return activeIcon;
  }



  /**
   * Output only. URL of the active icon, only present when the icon has been approved.
   * @return activeIconUri
   */
  @javax.annotation.Nullable
  public String getActiveIconUri() {
    return activeIconUri;
  }



  /**
   * Output only. Display name&#39;s disapproval reason. Only applies to display names with the review state &#39;REJECTED&#39;.
   * @return displayNameDisapprovalReason
   */
  @javax.annotation.Nullable
  public List<DisplayNameDisapprovalReason> getDisplayNameDisapprovalReason() {
    return displayNameDisapprovalReason;
  }



  /**
   * Output only. The brand&#39;s display names review state, which applies to all display name language entries. If there are both submitted and active display names, this refers to the submitted display names.
   * @return displayNameState
   */
  @javax.annotation.Nullable
  public DisplayNameStateEnum getDisplayNameState() {
    return displayNameState;
  }



  public Brand displayNames(List<LocalizedText> displayNames) {
    this.displayNames = displayNames;
    return this;
  }

  public Brand addDisplayNamesItem(LocalizedText displayNamesItem) {
    if (this.displayNames == null) {
      this.displayNames = new ArrayList<>();
    }
    this.displayNames.add(displayNamesItem);
    return this;
  }

  /**
   * Input only. The name Google displays for the brand&#39;s properties. Setting the display names is only necessary if you want to override the landing page display name or account-level display name for the brand. Google reviews the display names for appropriate content. When there are multiple languages, Google will only show the display names once Google approves all the languages.
   * @return displayNames
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getDisplayNames() {
    return displayNames;
  }

  public void setDisplayNames(List<LocalizedText> displayNames) {
    this.displayNames = displayNames;
  }


  public Brand icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Input only. The brand&#39;s [accounts.icon](/hotels/hotel-prices/api-reference/rest/v3/accounts.icons#resource:-iconresource) identifying the brand&#39;s icon. The value refers to the icons&#39;s resource name in the format &#x60;accounts/{account_id}/icons/{icon_id}&#x60;.
   * @return icon
   */
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  /**
   * Output only. The icon&#39;s disapproval reason(s). Only applies to submitted icons with &#x60;REJECTED&#x60; state.
   * @return iconDisapprovalReasons
   */
  @javax.annotation.Nullable
  public List<IconDisapprovalReasonsEnum> getIconDisapprovalReasons() {
    return iconDisapprovalReasons;
  }



  /**
   * Output only. The brand&#39;s icon&#39;s review state. If there are both submitted and active icons, this refers to the submitted icon.
   * @return iconState
   */
  @javax.annotation.Nullable
  public IconStateEnum getIconState() {
    return iconState;
  }



  /**
   * Output only. The resource name for the brand in the format &#x60;accounts/{account_id}/brands/{brand_id}&#x60;. The &#x60;brand_id&#x60; corresponds to the partner&#39;s brand identifier used for landing page matching and the property-level brand identifier. A default brand is applied to properties that do not have a brand. The &#x60;brand_id&#x60; of the default brand is &#x60;NO_BRAND_ID&#x60;. It can be fetched and updated like any configured brand.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  /**
   * Output only. The number of properties with the corresponding brand ID.
   * @return propertyCount
   */
  @javax.annotation.Nullable
  public String getPropertyCount() {
    return propertyCount;
  }



  /**
   * Output only. The brand&#39;s submitted display names in all provided languages, only present if the display name is new or rejected for any language.
   * @return submittedDisplayNames
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getSubmittedDisplayNames() {
    return submittedDisplayNames;
  }



  /**
   * Output only. The brand&#39;s submitted [accounts.icon](/hotels/hotel-prices/api-reference/rest/v3/accounts.icons#resource:-iconresource). The value refers to the icons&#39;s resource name in the format &#x60;accounts/{account_id}/icons/{icon_id}&#x60;. A submitted icon is one that is new or rejected.
   * @return submittedIcon
   */
  @javax.annotation.Nullable
  public String getSubmittedIcon() {
    return submittedIcon;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.activeDisplayNames, brand.activeDisplayNames) &&
        Objects.equals(this.activeIcon, brand.activeIcon) &&
        Objects.equals(this.activeIconUri, brand.activeIconUri) &&
        Objects.equals(this.displayNameDisapprovalReason, brand.displayNameDisapprovalReason) &&
        Objects.equals(this.displayNameState, brand.displayNameState) &&
        Objects.equals(this.displayNames, brand.displayNames) &&
        Objects.equals(this.icon, brand.icon) &&
        Objects.equals(this.iconDisapprovalReasons, brand.iconDisapprovalReasons) &&
        Objects.equals(this.iconState, brand.iconState) &&
        Objects.equals(this.name, brand.name) &&
        Objects.equals(this.propertyCount, brand.propertyCount) &&
        Objects.equals(this.submittedDisplayNames, brand.submittedDisplayNames) &&
        Objects.equals(this.submittedIcon, brand.submittedIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDisplayNames, activeIcon, activeIconUri, displayNameDisapprovalReason, displayNameState, displayNames, icon, iconDisapprovalReasons, iconState, name, propertyCount, submittedDisplayNames, submittedIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    sb.append("    activeDisplayNames: ").append(toIndentedString(activeDisplayNames)).append("\n");
    sb.append("    activeIcon: ").append(toIndentedString(activeIcon)).append("\n");
    sb.append("    activeIconUri: ").append(toIndentedString(activeIconUri)).append("\n");
    sb.append("    displayNameDisapprovalReason: ").append(toIndentedString(displayNameDisapprovalReason)).append("\n");
    sb.append("    displayNameState: ").append(toIndentedString(displayNameState)).append("\n");
    sb.append("    displayNames: ").append(toIndentedString(displayNames)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    iconDisapprovalReasons: ").append(toIndentedString(iconDisapprovalReasons)).append("\n");
    sb.append("    iconState: ").append(toIndentedString(iconState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyCount: ").append(toIndentedString(propertyCount)).append("\n");
    sb.append("    submittedDisplayNames: ").append(toIndentedString(submittedDisplayNames)).append("\n");
    sb.append("    submittedIcon: ").append(toIndentedString(submittedIcon)).append("\n");
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
    openapiFields.add("activeDisplayNames");
    openapiFields.add("activeIcon");
    openapiFields.add("activeIconUri");
    openapiFields.add("displayNameDisapprovalReason");
    openapiFields.add("displayNameState");
    openapiFields.add("displayNames");
    openapiFields.add("icon");
    openapiFields.add("iconDisapprovalReasons");
    openapiFields.add("iconState");
    openapiFields.add("name");
    openapiFields.add("propertyCount");
    openapiFields.add("submittedDisplayNames");
    openapiFields.add("submittedIcon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Brand
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Brand.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Brand is not found in the empty JSON string", Brand.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Brand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Brand` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("activeDisplayNames") != null && !jsonObj.get("activeDisplayNames").isJsonNull()) {
        JsonArray jsonArrayactiveDisplayNames = jsonObj.getAsJsonArray("activeDisplayNames");
        if (jsonArrayactiveDisplayNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("activeDisplayNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `activeDisplayNames` to be an array in the JSON string but got `%s`", jsonObj.get("activeDisplayNames").toString()));
          }

          // validate the optional field `activeDisplayNames` (array)
          for (int i = 0; i < jsonArrayactiveDisplayNames.size(); i++) {
            LocalizedText.validateJsonElement(jsonArrayactiveDisplayNames.get(i));
          };
        }
      }
      if ((jsonObj.get("activeIcon") != null && !jsonObj.get("activeIcon").isJsonNull()) && !jsonObj.get("activeIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeIcon").toString()));
      }
      if ((jsonObj.get("activeIconUri") != null && !jsonObj.get("activeIconUri").isJsonNull()) && !jsonObj.get("activeIconUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeIconUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeIconUri").toString()));
      }
      if (jsonObj.get("displayNameDisapprovalReason") != null && !jsonObj.get("displayNameDisapprovalReason").isJsonNull()) {
        JsonArray jsonArraydisplayNameDisapprovalReason = jsonObj.getAsJsonArray("displayNameDisapprovalReason");
        if (jsonArraydisplayNameDisapprovalReason != null) {
          // ensure the json data is an array
          if (!jsonObj.get("displayNameDisapprovalReason").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `displayNameDisapprovalReason` to be an array in the JSON string but got `%s`", jsonObj.get("displayNameDisapprovalReason").toString()));
          }

          // validate the optional field `displayNameDisapprovalReason` (array)
          for (int i = 0; i < jsonArraydisplayNameDisapprovalReason.size(); i++) {
            DisplayNameDisapprovalReason.validateJsonElement(jsonArraydisplayNameDisapprovalReason.get(i));
          };
        }
      }
      if ((jsonObj.get("displayNameState") != null && !jsonObj.get("displayNameState").isJsonNull()) && !jsonObj.get("displayNameState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNameState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayNameState").toString()));
      }
      // validate the optional field `displayNameState`
      if (jsonObj.get("displayNameState") != null && !jsonObj.get("displayNameState").isJsonNull()) {
        DisplayNameStateEnum.validateJsonElement(jsonObj.get("displayNameState"));
      }
      if (jsonObj.get("displayNames") != null && !jsonObj.get("displayNames").isJsonNull()) {
        JsonArray jsonArraydisplayNames = jsonObj.getAsJsonArray("displayNames");
        if (jsonArraydisplayNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("displayNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `displayNames` to be an array in the JSON string but got `%s`", jsonObj.get("displayNames").toString()));
          }

          // validate the optional field `displayNames` (array)
          for (int i = 0; i < jsonArraydisplayNames.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraydisplayNames.get(i));
          };
        }
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("iconDisapprovalReasons") != null && !jsonObj.get("iconDisapprovalReasons").isJsonNull() && !jsonObj.get("iconDisapprovalReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconDisapprovalReasons` to be an array in the JSON string but got `%s`", jsonObj.get("iconDisapprovalReasons").toString()));
      }
      if ((jsonObj.get("iconState") != null && !jsonObj.get("iconState").isJsonNull()) && !jsonObj.get("iconState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconState").toString()));
      }
      // validate the optional field `iconState`
      if (jsonObj.get("iconState") != null && !jsonObj.get("iconState").isJsonNull()) {
        IconStateEnum.validateJsonElement(jsonObj.get("iconState"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("propertyCount") != null && !jsonObj.get("propertyCount").isJsonNull()) && !jsonObj.get("propertyCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyCount").toString()));
      }
      if (jsonObj.get("submittedDisplayNames") != null && !jsonObj.get("submittedDisplayNames").isJsonNull()) {
        JsonArray jsonArraysubmittedDisplayNames = jsonObj.getAsJsonArray("submittedDisplayNames");
        if (jsonArraysubmittedDisplayNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("submittedDisplayNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `submittedDisplayNames` to be an array in the JSON string but got `%s`", jsonObj.get("submittedDisplayNames").toString()));
          }

          // validate the optional field `submittedDisplayNames` (array)
          for (int i = 0; i < jsonArraysubmittedDisplayNames.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraysubmittedDisplayNames.get(i));
          };
        }
      }
      if ((jsonObj.get("submittedIcon") != null && !jsonObj.get("submittedIcon").isJsonNull()) && !jsonObj.get("submittedIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedIcon").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Brand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Brand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Brand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Brand.class));

       return (TypeAdapter<T>) new TypeAdapter<Brand>() {
           @Override
           public void write(JsonWriter out, Brand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Brand read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Brand given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Brand
   * @throws IOException if the JSON string is invalid with respect to Brand
   */
  public static Brand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Brand.class);
  }

  /**
   * Convert an instance of Brand to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

