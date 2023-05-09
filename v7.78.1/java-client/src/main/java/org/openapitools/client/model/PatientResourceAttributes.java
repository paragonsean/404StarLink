/*
 * Fitbit Plus API
 * # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 
 *
 * The version of the OpenAPI document: v7.78.1
 * Contact: apiteam@twinehealth.com
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.ArchiveHistory;
import org.openapitools.client.model.PatientIdentifier;
import org.openapitools.client.model.PatientResourceAttributesStatement;
import org.openapitools.client.model.PhoneNumber;

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
 * PatientResourceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:14.895652-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PatientResourceAttributes {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARCHIVE_HISTORY = "archive_history";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_HISTORY)
  private List<ArchiveHistory> archiveHistory = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ENROLLED_AT = "enrolled_at";
  @SerializedName(SERIALIZED_NAME_ENROLLED_AT)
  private String enrolledAt;

  public static final String SERIALIZED_NAME_FIRST_ACCESS_AT = "first_access_at";
  @SerializedName(SERIALIZED_NAME_FIRST_ACCESS_AT)
  private String firstAccessAt;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    OTHER("other");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      GenderEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<PatientIdentifier> identifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVITED_AT = "invited_at";
  @SerializedName(SERIALIZED_NAME_INVITED_AT)
  private String invitedAt;

  public static final String SERIALIZED_NAME_LAST_ACCESS_AT = "last_access_at";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESS_AT)
  private String lastAccessAt;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATEMENT = "statement";
  @SerializedName(SERIALIZED_NAME_STATEMENT)
  private PatientResourceAttributesStatement statement;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public PatientResourceAttributes() {
  }

  public PatientResourceAttributes(
     Boolean archived, 
     String enrolledAt, 
     String firstAccessAt, 
     String invitedAt, 
     String lastAccessAt, 
     String updatedAt
  ) {
    this();
    this.archived = archived;
    this.enrolledAt = enrolledAt;
    this.firstAccessAt = firstAccessAt;
    this.invitedAt = invitedAt;
    this.lastAccessAt = lastAccessAt;
    this.updatedAt = updatedAt;
  }

  public PatientResourceAttributes addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PatientResourceAttributes addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
   */
  @javax.annotation.Nullable
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public PatientResourceAttributes archiveHistory(List<ArchiveHistory> archiveHistory) {
    this.archiveHistory = archiveHistory;
    return this;
  }

  public PatientResourceAttributes addArchiveHistoryItem(ArchiveHistory archiveHistoryItem) {
    if (this.archiveHistory == null) {
      this.archiveHistory = new ArrayList<>();
    }
    this.archiveHistory.add(archiveHistoryItem);
    return this;
  }

  /**
   * Get archiveHistory
   * @return archiveHistory
   */
  @javax.annotation.Nullable
  public List<ArchiveHistory> getArchiveHistory() {
    return archiveHistory;
  }

  public void setArchiveHistory(List<ArchiveHistory> archiveHistory) {
    this.archiveHistory = archiveHistory;
  }


  /**
   * Get archived
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }



  public PatientResourceAttributes birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   */
  @javax.annotation.Nullable
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public PatientResourceAttributes emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Get enrolledAt
   * @return enrolledAt
   */
  @javax.annotation.Nullable
  public String getEnrolledAt() {
    return enrolledAt;
  }



  /**
   * Get firstAccessAt
   * @return firstAccessAt
   */
  @javax.annotation.Nullable
  public String getFirstAccessAt() {
    return firstAccessAt;
  }



  public PatientResourceAttributes firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PatientResourceAttributes gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public PatientResourceAttributes identifiers(List<PatientIdentifier> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public PatientResourceAttributes addIdentifiersItem(PatientIdentifier identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
   */
  @javax.annotation.Nullable
  public List<PatientIdentifier> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<PatientIdentifier> identifiers) {
    this.identifiers = identifiers;
  }


  /**
   * Get invitedAt
   * @return invitedAt
   */
  @javax.annotation.Nullable
  public String getInvitedAt() {
    return invitedAt;
  }



  /**
   * Get lastAccessAt
   * @return lastAccessAt
   */
  @javax.annotation.Nullable
  public String getLastAccessAt() {
    return lastAccessAt;
  }



  public PatientResourceAttributes lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PatientResourceAttributes note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Coach&#39;s note about the patient. Not visible to the patient.
   * @return note
   */
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public PatientResourceAttributes phoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PatientResourceAttributes addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Get phoneNumbers
   * @return phoneNumbers
   */
  @javax.annotation.Nullable
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PatientResourceAttributes statement(PatientResourceAttributesStatement statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Get statement
   * @return statement
   */
  @javax.annotation.Nullable
  public PatientResourceAttributesStatement getStatement() {
    return statement;
  }

  public void setStatement(PatientResourceAttributesStatement statement) {
    this.statement = statement;
  }


  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientResourceAttributes patientResourceAttributes = (PatientResourceAttributes) o;
    return Objects.equals(this.addresses, patientResourceAttributes.addresses) &&
        Objects.equals(this.archiveHistory, patientResourceAttributes.archiveHistory) &&
        Objects.equals(this.archived, patientResourceAttributes.archived) &&
        Objects.equals(this.birthDate, patientResourceAttributes.birthDate) &&
        Objects.equals(this.emailAddress, patientResourceAttributes.emailAddress) &&
        Objects.equals(this.enrolledAt, patientResourceAttributes.enrolledAt) &&
        Objects.equals(this.firstAccessAt, patientResourceAttributes.firstAccessAt) &&
        Objects.equals(this.firstName, patientResourceAttributes.firstName) &&
        Objects.equals(this.gender, patientResourceAttributes.gender) &&
        Objects.equals(this.identifiers, patientResourceAttributes.identifiers) &&
        Objects.equals(this.invitedAt, patientResourceAttributes.invitedAt) &&
        Objects.equals(this.lastAccessAt, patientResourceAttributes.lastAccessAt) &&
        Objects.equals(this.lastName, patientResourceAttributes.lastName) &&
        Objects.equals(this.note, patientResourceAttributes.note) &&
        Objects.equals(this.phoneNumbers, patientResourceAttributes.phoneNumbers) &&
        Objects.equals(this.statement, patientResourceAttributes.statement) &&
        Objects.equals(this.updatedAt, patientResourceAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, archiveHistory, archived, birthDate, emailAddress, enrolledAt, firstAccessAt, firstName, gender, identifiers, invitedAt, lastAccessAt, lastName, note, phoneNumbers, statement, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientResourceAttributes {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    archiveHistory: ").append(toIndentedString(archiveHistory)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    enrolledAt: ").append(toIndentedString(enrolledAt)).append("\n");
    sb.append("    firstAccessAt: ").append(toIndentedString(firstAccessAt)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    invitedAt: ").append(toIndentedString(invitedAt)).append("\n");
    sb.append("    lastAccessAt: ").append(toIndentedString(lastAccessAt)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("archive_history");
    openapiFields.add("archived");
    openapiFields.add("birth_date");
    openapiFields.add("email_address");
    openapiFields.add("enrolled_at");
    openapiFields.add("first_access_at");
    openapiFields.add("first_name");
    openapiFields.add("gender");
    openapiFields.add("identifiers");
    openapiFields.add("invited_at");
    openapiFields.add("last_access_at");
    openapiFields.add("last_name");
    openapiFields.add("note");
    openapiFields.add("phone_numbers");
    openapiFields.add("statement");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatientResourceAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatientResourceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatientResourceAttributes is not found in the empty JSON string", PatientResourceAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatientResourceAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatientResourceAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            Address.validateJsonElement(jsonArrayaddresses.get(i));
          };
        }
      }
      if (jsonObj.get("archive_history") != null && !jsonObj.get("archive_history").isJsonNull()) {
        JsonArray jsonArrayarchiveHistory = jsonObj.getAsJsonArray("archive_history");
        if (jsonArrayarchiveHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("archive_history").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `archive_history` to be an array in the JSON string but got `%s`", jsonObj.get("archive_history").toString()));
          }

          // validate the optional field `archive_history` (array)
          for (int i = 0; i < jsonArrayarchiveHistory.size(); i++) {
            ArchiveHistory.validateJsonElement(jsonArrayarchiveHistory.get(i));
          };
        }
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("enrolled_at") != null && !jsonObj.get("enrolled_at").isJsonNull()) && !jsonObj.get("enrolled_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolled_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolled_at").toString()));
      }
      if ((jsonObj.get("first_access_at") != null && !jsonObj.get("first_access_at").isJsonNull()) && !jsonObj.get("first_access_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_access_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_access_at").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      // validate the optional field `gender`
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) {
        GenderEnum.validateJsonElement(jsonObj.get("gender"));
      }
      if (jsonObj.get("identifiers") != null && !jsonObj.get("identifiers").isJsonNull()) {
        JsonArray jsonArrayidentifiers = jsonObj.getAsJsonArray("identifiers");
        if (jsonArrayidentifiers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identifiers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("identifiers").toString()));
          }

          // validate the optional field `identifiers` (array)
          for (int i = 0; i < jsonArrayidentifiers.size(); i++) {
            PatientIdentifier.validateJsonElement(jsonArrayidentifiers.get(i));
          };
        }
      }
      if ((jsonObj.get("invited_at") != null && !jsonObj.get("invited_at").isJsonNull()) && !jsonObj.get("invited_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invited_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invited_at").toString()));
      }
      if ((jsonObj.get("last_access_at") != null && !jsonObj.get("last_access_at").isJsonNull()) && !jsonObj.get("last_access_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_access_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_access_at").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (jsonObj.get("phone_numbers") != null && !jsonObj.get("phone_numbers").isJsonNull()) {
        JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phone_numbers");
        if (jsonArrayphoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phone_numbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phone_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("phone_numbers").toString()));
          }

          // validate the optional field `phone_numbers` (array)
          for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
            PhoneNumber.validateJsonElement(jsonArrayphoneNumbers.get(i));
          };
        }
      }
      // validate the optional field `statement`
      if (jsonObj.get("statement") != null && !jsonObj.get("statement").isJsonNull()) {
        PatientResourceAttributesStatement.validateJsonElement(jsonObj.get("statement"));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatientResourceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatientResourceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatientResourceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatientResourceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PatientResourceAttributes>() {
           @Override
           public void write(JsonWriter out, PatientResourceAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatientResourceAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatientResourceAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatientResourceAttributes
   * @throws IOException if the JSON string is invalid with respect to PatientResourceAttributes
   */
  public static PatientResourceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatientResourceAttributes.class);
  }

  /**
   * Convert an instance of PatientResourceAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

