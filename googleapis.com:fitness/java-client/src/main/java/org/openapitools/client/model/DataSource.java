/*
 * Fitness API
 * The Fitness API for managing users' fitness tracking data.
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
import org.openapitools.client.model.Application;
import org.openapitools.client.model.DataType;
import org.openapitools.client.model.Device;

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
 * Definition of a unique source of sensor data. Data sources can expose raw data coming from hardware sensors on local or companion devices. They can also expose derived data, created by transforming or merging other data sources. Multiple data sources can exist for the same data type. Every data point inserted into or read from this service has an associated data source. The data source contains enough information to uniquely identify its data, including the hardware device and the application that collected and/or transformed the data. It also holds useful metadata, such as the hardware and application versions, and the device type. Each data source produces a unique stream of data, with a unique identifier. Not all changes to data source affect the stream identifier, so that data collected by updated versions of the same application/device can still be considered to belong to the same data stream.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:05.813979-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DataSource {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private Application application;

  /**
   * Gets or Sets dataQualityStandard
   */
  @JsonAdapter(DataQualityStandardEnum.Adapter.class)
  public enum DataQualityStandardEnum {
    DATA_QUALITY_UNKNOWN("dataQualityUnknown"),
    
    DATA_QUALITY_BLOOD_PRESSURE_ESH2002("dataQualityBloodPressureEsh2002"),
    
    DATA_QUALITY_BLOOD_PRESSURE_ESH2010("dataQualityBloodPressureEsh2010"),
    
    DATA_QUALITY_BLOOD_PRESSURE_AAMI("dataQualityBloodPressureAami"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_AA("dataQualityBloodPressureBhsAA"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_AB("dataQualityBloodPressureBhsAB"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_BA("dataQualityBloodPressureBhsBA"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_BB("dataQualityBloodPressureBhsBB"),
    
    DATA_QUALITY_BLOOD_GLUCOSE_ISO151972003("dataQualityBloodGlucoseIso151972003"),
    
    DATA_QUALITY_BLOOD_GLUCOSE_ISO151972013("dataQualityBloodGlucoseIso151972013");

    private String value;

    DataQualityStandardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataQualityStandardEnum fromValue(String value) {
      for (DataQualityStandardEnum b : DataQualityStandardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataQualityStandardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataQualityStandardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataQualityStandardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataQualityStandardEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DataQualityStandardEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATA_QUALITY_STANDARD = "dataQualityStandard";
  @SerializedName(SERIALIZED_NAME_DATA_QUALITY_STANDARD)
  private List<DataQualityStandardEnum> dataQualityStandard = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_STREAM_ID = "dataStreamId";
  @SerializedName(SERIALIZED_NAME_DATA_STREAM_ID)
  private String dataStreamId;

  public static final String SERIALIZED_NAME_DATA_STREAM_NAME = "dataStreamName";
  @SerializedName(SERIALIZED_NAME_DATA_STREAM_NAME)
  private String dataStreamName;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataType dataType;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Device device;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * A constant describing the type of this data source. Indicates whether this data source produces raw or derived data.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RAW("raw"),
    
    DERIVED("derived");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
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
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public DataSource() {
  }

  public DataSource application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @javax.annotation.Nullable
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }


  public DataSource dataQualityStandard(List<DataQualityStandardEnum> dataQualityStandard) {
    this.dataQualityStandard = dataQualityStandard;
    return this;
  }

  public DataSource addDataQualityStandardItem(DataQualityStandardEnum dataQualityStandardItem) {
    if (this.dataQualityStandard == null) {
      this.dataQualityStandard = new ArrayList<>();
    }
    this.dataQualityStandard.add(dataQualityStandardItem);
    return this;
  }

  /**
   * DO NOT POPULATE THIS FIELD. It is never populated in responses from the platform, and is ignored in queries. It will be removed in a future version entirely.
   * @return dataQualityStandard
   */
  @javax.annotation.Nullable
  public List<DataQualityStandardEnum> getDataQualityStandard() {
    return dataQualityStandard;
  }

  public void setDataQualityStandard(List<DataQualityStandardEnum> dataQualityStandard) {
    this.dataQualityStandard = dataQualityStandard;
  }


  public DataSource dataStreamId(String dataStreamId) {
    this.dataStreamId = dataStreamId;
    return this;
  }

  /**
   * A unique identifier for the data stream produced by this data source. The identifier includes: - The physical device&#39;s manufacturer, model, and serial number (UID). - The application&#39;s package name or name. Package name is used when the data source was created by an Android application. The developer project number is used when the data source was created by a REST client. - The data source&#39;s type. - The data source&#39;s stream name. Note that not all attributes of the data source are used as part of the stream identifier. In particular, the version of the hardware/the application isn&#39;t used. This allows us to preserve the same stream through version updates. This also means that two DataSource objects may represent the same data stream even if they&#39;re not equal. The exact format of the data stream ID created by an Android application is: type:dataType.name:application.packageName:device.manufacturer:device.model:device.uid:dataStreamName The exact format of the data stream ID created by a REST client is: type:dataType.name:developer project number:device.manufacturer:device.model:device.uid:dataStreamName When any of the optional fields that make up the data stream ID are absent, they will be omitted from the data stream ID. The minimum viable data stream ID would be: type:dataType.name:developer project number Finally, the developer project number and device UID are obfuscated when read by any REST or Android client that did not create the data source. Only the data source creator will see the developer project number in clear and normal form. This means a client will see a different set of data_stream_ids than another client with different credentials.
   * @return dataStreamId
   */
  @javax.annotation.Nullable
  public String getDataStreamId() {
    return dataStreamId;
  }

  public void setDataStreamId(String dataStreamId) {
    this.dataStreamId = dataStreamId;
  }


  public DataSource dataStreamName(String dataStreamName) {
    this.dataStreamName = dataStreamName;
    return this;
  }

  /**
   * The stream name uniquely identifies this particular data source among other data sources of the same type from the same underlying producer. Setting the stream name is optional, but should be done whenever an application exposes two streams for the same data type, or when a device has two equivalent sensors.
   * @return dataStreamName
   */
  @javax.annotation.Nullable
  public String getDataStreamName() {
    return dataStreamName;
  }

  public void setDataStreamName(String dataStreamName) {
    this.dataStreamName = dataStreamName;
  }


  public DataSource dataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @javax.annotation.Nullable
  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }


  public DataSource device(Device device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @javax.annotation.Nullable
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }


  public DataSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An end-user visible name for this data source.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DataSource type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * A constant describing the type of this data source. Indicates whether this data source produces raw or derived data.
   * @return type
   */
  @javax.annotation.Nullable
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
    DataSource dataSource = (DataSource) o;
    return Objects.equals(this.application, dataSource.application) &&
        Objects.equals(this.dataQualityStandard, dataSource.dataQualityStandard) &&
        Objects.equals(this.dataStreamId, dataSource.dataStreamId) &&
        Objects.equals(this.dataStreamName, dataSource.dataStreamName) &&
        Objects.equals(this.dataType, dataSource.dataType) &&
        Objects.equals(this.device, dataSource.device) &&
        Objects.equals(this.name, dataSource.name) &&
        Objects.equals(this.type, dataSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, dataQualityStandard, dataStreamId, dataStreamName, dataType, device, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSource {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    dataQualityStandard: ").append(toIndentedString(dataQualityStandard)).append("\n");
    sb.append("    dataStreamId: ").append(toIndentedString(dataStreamId)).append("\n");
    sb.append("    dataStreamName: ").append(toIndentedString(dataStreamName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("dataQualityStandard");
    openapiFields.add("dataStreamId");
    openapiFields.add("dataStreamName");
    openapiFields.add("dataType");
    openapiFields.add("device");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataSource is not found in the empty JSON string", DataSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `application`
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()) {
        Application.validateJsonElement(jsonObj.get("application"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dataQualityStandard") != null && !jsonObj.get("dataQualityStandard").isJsonNull() && !jsonObj.get("dataQualityStandard").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataQualityStandard` to be an array in the JSON string but got `%s`", jsonObj.get("dataQualityStandard").toString()));
      }
      if ((jsonObj.get("dataStreamId") != null && !jsonObj.get("dataStreamId").isJsonNull()) && !jsonObj.get("dataStreamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStreamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStreamId").toString()));
      }
      if ((jsonObj.get("dataStreamName") != null && !jsonObj.get("dataStreamName").isJsonNull()) && !jsonObj.get("dataStreamName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStreamName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStreamName").toString()));
      }
      // validate the optional field `dataType`
      if (jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) {
        DataType.validateJsonElement(jsonObj.get("dataType"));
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        Device.validateJsonElement(jsonObj.get("device"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataSource.class));

       return (TypeAdapter<T>) new TypeAdapter<DataSource>() {
           @Override
           public void write(JsonWriter out, DataSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataSource
   * @throws IOException if the JSON string is invalid with respect to DataSource
   */
  public static DataSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataSource.class);
  }

  /**
   * Convert an instance of DataSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

