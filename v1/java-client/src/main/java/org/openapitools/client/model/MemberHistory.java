/*
 * Members API
 * An API which retrieves Members data.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
import org.openapitools.client.model.HouseMembership;
import org.openapitools.client.model.MemberName;
import org.openapitools.client.model.MemberParty;
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
 * MemberHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:59.455402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MemberHistory {
  public static final String SERIALIZED_NAME_HOUSE_MEMBERSHIP_HISTORY = "houseMembershipHistory";
  @SerializedName(SERIALIZED_NAME_HOUSE_MEMBERSHIP_HISTORY)
  private List<HouseMembership> houseMembershipHistory;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME_HISTORY = "nameHistory";
  @SerializedName(SERIALIZED_NAME_NAME_HISTORY)
  private List<MemberName> nameHistory;

  public static final String SERIALIZED_NAME_PARTY_HISTORY = "partyHistory";
  @SerializedName(SERIALIZED_NAME_PARTY_HISTORY)
  private List<MemberParty> partyHistory;

  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnailUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public MemberHistory() {
  }

  public MemberHistory houseMembershipHistory(List<HouseMembership> houseMembershipHistory) {
    this.houseMembershipHistory = houseMembershipHistory;
    return this;
  }

  public MemberHistory addHouseMembershipHistoryItem(HouseMembership houseMembershipHistoryItem) {
    if (this.houseMembershipHistory == null) {
      this.houseMembershipHistory = new ArrayList<>();
    }
    this.houseMembershipHistory.add(houseMembershipHistoryItem);
    return this;
  }

  /**
   * Get houseMembershipHistory
   * @return houseMembershipHistory
   */
  @javax.annotation.Nullable
  public List<HouseMembership> getHouseMembershipHistory() {
    return houseMembershipHistory;
  }

  public void setHouseMembershipHistory(List<HouseMembership> houseMembershipHistory) {
    this.houseMembershipHistory = houseMembershipHistory;
  }


  public MemberHistory id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public MemberHistory nameHistory(List<MemberName> nameHistory) {
    this.nameHistory = nameHistory;
    return this;
  }

  public MemberHistory addNameHistoryItem(MemberName nameHistoryItem) {
    if (this.nameHistory == null) {
      this.nameHistory = new ArrayList<>();
    }
    this.nameHistory.add(nameHistoryItem);
    return this;
  }

  /**
   * Get nameHistory
   * @return nameHistory
   */
  @javax.annotation.Nullable
  public List<MemberName> getNameHistory() {
    return nameHistory;
  }

  public void setNameHistory(List<MemberName> nameHistory) {
    this.nameHistory = nameHistory;
  }


  public MemberHistory partyHistory(List<MemberParty> partyHistory) {
    this.partyHistory = partyHistory;
    return this;
  }

  public MemberHistory addPartyHistoryItem(MemberParty partyHistoryItem) {
    if (this.partyHistory == null) {
      this.partyHistory = new ArrayList<>();
    }
    this.partyHistory.add(partyHistoryItem);
    return this;
  }

  /**
   * Get partyHistory
   * @return partyHistory
   */
  @javax.annotation.Nullable
  public List<MemberParty> getPartyHistory() {
    return partyHistory;
  }

  public void setPartyHistory(List<MemberParty> partyHistory) {
    this.partyHistory = partyHistory;
  }


  public MemberHistory thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * Get thumbnailUrl
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberHistory memberHistory = (MemberHistory) o;
    return Objects.equals(this.houseMembershipHistory, memberHistory.houseMembershipHistory) &&
        Objects.equals(this.id, memberHistory.id) &&
        Objects.equals(this.nameHistory, memberHistory.nameHistory) &&
        Objects.equals(this.partyHistory, memberHistory.partyHistory) &&
        Objects.equals(this.thumbnailUrl, memberHistory.thumbnailUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseMembershipHistory, id, nameHistory, partyHistory, thumbnailUrl);
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
    sb.append("class MemberHistory {\n");
    sb.append("    houseMembershipHistory: ").append(toIndentedString(houseMembershipHistory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nameHistory: ").append(toIndentedString(nameHistory)).append("\n");
    sb.append("    partyHistory: ").append(toIndentedString(partyHistory)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
    openapiFields.add("houseMembershipHistory");
    openapiFields.add("id");
    openapiFields.add("nameHistory");
    openapiFields.add("partyHistory");
    openapiFields.add("thumbnailUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MemberHistory
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MemberHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MemberHistory is not found in the empty JSON string", MemberHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MemberHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MemberHistory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("houseMembershipHistory") != null && !jsonObj.get("houseMembershipHistory").isJsonNull()) {
        JsonArray jsonArrayhouseMembershipHistory = jsonObj.getAsJsonArray("houseMembershipHistory");
        if (jsonArrayhouseMembershipHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("houseMembershipHistory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `houseMembershipHistory` to be an array in the JSON string but got `%s`", jsonObj.get("houseMembershipHistory").toString()));
          }

          // validate the optional field `houseMembershipHistory` (array)
          for (int i = 0; i < jsonArrayhouseMembershipHistory.size(); i++) {
            HouseMembership.validateJsonElement(jsonArrayhouseMembershipHistory.get(i));
          };
        }
      }
      if (jsonObj.get("nameHistory") != null && !jsonObj.get("nameHistory").isJsonNull()) {
        JsonArray jsonArraynameHistory = jsonObj.getAsJsonArray("nameHistory");
        if (jsonArraynameHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nameHistory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nameHistory` to be an array in the JSON string but got `%s`", jsonObj.get("nameHistory").toString()));
          }

          // validate the optional field `nameHistory` (array)
          for (int i = 0; i < jsonArraynameHistory.size(); i++) {
            MemberName.validateJsonElement(jsonArraynameHistory.get(i));
          };
        }
      }
      if (jsonObj.get("partyHistory") != null && !jsonObj.get("partyHistory").isJsonNull()) {
        JsonArray jsonArraypartyHistory = jsonObj.getAsJsonArray("partyHistory");
        if (jsonArraypartyHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("partyHistory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `partyHistory` to be an array in the JSON string but got `%s`", jsonObj.get("partyHistory").toString()));
          }

          // validate the optional field `partyHistory` (array)
          for (int i = 0; i < jsonArraypartyHistory.size(); i++) {
            MemberParty.validateJsonElement(jsonArraypartyHistory.get(i));
          };
        }
      }
      if ((jsonObj.get("thumbnailUrl") != null && !jsonObj.get("thumbnailUrl").isJsonNull()) && !jsonObj.get("thumbnailUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MemberHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MemberHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MemberHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MemberHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<MemberHistory>() {
           @Override
           public void write(JsonWriter out, MemberHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MemberHistory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MemberHistory given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MemberHistory
   * @throws IOException if the JSON string is invalid with respect to MemberHistory
   */
  public static MemberHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MemberHistory.class);
  }

  /**
   * Convert an instance of MemberHistory to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

