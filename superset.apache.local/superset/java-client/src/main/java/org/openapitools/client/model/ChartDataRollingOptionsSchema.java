/*
 * Superset
 * Superset
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
 * ChartDataRollingOptionsSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ChartDataRollingOptionsSchema {
  public static final String SERIALIZED_NAME_CENTER = "center";
  @SerializedName(SERIALIZED_NAME_CENTER)
  private Boolean center;

  public static final String SERIALIZED_NAME_MIN_PERIODS = "min_periods";
  @SerializedName(SERIALIZED_NAME_MIN_PERIODS)
  private Integer minPeriods;

  /**
   * Type of rolling window. Any numpy function will work.
   */
  @JsonAdapter(RollingTypeEnum.Adapter.class)
  public enum RollingTypeEnum {
    AVERAGE("average"),
    
    ARGMIN("argmin"),
    
    ARGMAX("argmax"),
    
    CUMSUM("cumsum"),
    
    CUMPROD("cumprod"),
    
    MAX("max"),
    
    MEAN("mean"),
    
    MEDIAN("median"),
    
    NANSUM("nansum"),
    
    NANMIN("nanmin"),
    
    NANMAX("nanmax"),
    
    NANMEAN("nanmean"),
    
    NANMEDIAN("nanmedian"),
    
    NANPERCENTILE("nanpercentile"),
    
    MIN("min"),
    
    PERCENTILE("percentile"),
    
    PROD("prod"),
    
    PRODUCT("product"),
    
    STD("std"),
    
    SUM("sum"),
    
    VAR("var");

    private String value;

    RollingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RollingTypeEnum fromValue(String value) {
      for (RollingTypeEnum b : RollingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RollingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RollingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RollingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RollingTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RollingTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROLLING_TYPE = "rolling_type";
  @SerializedName(SERIALIZED_NAME_ROLLING_TYPE)
  private RollingTypeEnum rollingType;

  public static final String SERIALIZED_NAME_ROLLING_TYPE_OPTIONS = "rolling_type_options";
  @SerializedName(SERIALIZED_NAME_ROLLING_TYPE_OPTIONS)
  private Object rollingTypeOptions;

  /**
   * Type of window function. See [SciPy window functions](https://docs.scipy.org/doc/scipy/reference/signal.windows.html#module-scipy.signal.windows) for more details. Some window functions require passing additional parameters to &#x60;rolling_type_options&#x60;. For instance, to use &#x60;gaussian&#x60;, the parameter &#x60;std&#x60; needs to be provided.
   */
  @JsonAdapter(WinTypeEnum.Adapter.class)
  public enum WinTypeEnum {
    BOXCAR("boxcar"),
    
    TRIANG("triang"),
    
    BLACKMAN("blackman"),
    
    HAMMING("hamming"),
    
    BARTLETT("bartlett"),
    
    PARZEN("parzen"),
    
    BOHMAN("bohman"),
    
    BLACKMANHARRIS("blackmanharris"),
    
    NUTTALL("nuttall"),
    
    BARTHANN("barthann"),
    
    KAISER("kaiser"),
    
    GAUSSIAN("gaussian"),
    
    GENERAL_GAUSSIAN("general_gaussian"),
    
    SLEPIAN("slepian"),
    
    EXPONENTIAL("exponential");

    private String value;

    WinTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WinTypeEnum fromValue(String value) {
      for (WinTypeEnum b : WinTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WinTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WinTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WinTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WinTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WinTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WIN_TYPE = "win_type";
  @SerializedName(SERIALIZED_NAME_WIN_TYPE)
  private WinTypeEnum winType;

  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private Integer window;

  public ChartDataRollingOptionsSchema() {
  }

  public ChartDataRollingOptionsSchema center(Boolean center) {
    this.center = center;
    return this;
  }

  /**
   * Should the label be at the center of the window. Default: &#x60;false&#x60;
   * @return center
   */
  @javax.annotation.Nullable
  public Boolean getCenter() {
    return center;
  }

  public void setCenter(Boolean center) {
    this.center = center;
  }


  public ChartDataRollingOptionsSchema minPeriods(Integer minPeriods) {
    this.minPeriods = minPeriods;
    return this;
  }

  /**
   * The minimum amount of periods required for a row to be included in the result set.
   * @return minPeriods
   */
  @javax.annotation.Nullable
  public Integer getMinPeriods() {
    return minPeriods;
  }

  public void setMinPeriods(Integer minPeriods) {
    this.minPeriods = minPeriods;
  }


  public ChartDataRollingOptionsSchema rollingType(RollingTypeEnum rollingType) {
    this.rollingType = rollingType;
    return this;
  }

  /**
   * Type of rolling window. Any numpy function will work.
   * @return rollingType
   */
  @javax.annotation.Nonnull
  public RollingTypeEnum getRollingType() {
    return rollingType;
  }

  public void setRollingType(RollingTypeEnum rollingType) {
    this.rollingType = rollingType;
  }


  public ChartDataRollingOptionsSchema rollingTypeOptions(Object rollingTypeOptions) {
    this.rollingTypeOptions = rollingTypeOptions;
    return this;
  }

  /**
   * Get rollingTypeOptions
   * @return rollingTypeOptions
   */
  @javax.annotation.Nullable
  public Object getRollingTypeOptions() {
    return rollingTypeOptions;
  }

  public void setRollingTypeOptions(Object rollingTypeOptions) {
    this.rollingTypeOptions = rollingTypeOptions;
  }


  public ChartDataRollingOptionsSchema winType(WinTypeEnum winType) {
    this.winType = winType;
    return this;
  }

  /**
   * Type of window function. See [SciPy window functions](https://docs.scipy.org/doc/scipy/reference/signal.windows.html#module-scipy.signal.windows) for more details. Some window functions require passing additional parameters to &#x60;rolling_type_options&#x60;. For instance, to use &#x60;gaussian&#x60;, the parameter &#x60;std&#x60; needs to be provided.
   * @return winType
   */
  @javax.annotation.Nullable
  public WinTypeEnum getWinType() {
    return winType;
  }

  public void setWinType(WinTypeEnum winType) {
    this.winType = winType;
  }


  public ChartDataRollingOptionsSchema window(Integer window) {
    this.window = window;
    return this;
  }

  /**
   * Size of the rolling window in days.
   * @return window
   */
  @javax.annotation.Nonnull
  public Integer getWindow() {
    return window;
  }

  public void setWindow(Integer window) {
    this.window = window;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataRollingOptionsSchema chartDataRollingOptionsSchema = (ChartDataRollingOptionsSchema) o;
    return Objects.equals(this.center, chartDataRollingOptionsSchema.center) &&
        Objects.equals(this.minPeriods, chartDataRollingOptionsSchema.minPeriods) &&
        Objects.equals(this.rollingType, chartDataRollingOptionsSchema.rollingType) &&
        Objects.equals(this.rollingTypeOptions, chartDataRollingOptionsSchema.rollingTypeOptions) &&
        Objects.equals(this.winType, chartDataRollingOptionsSchema.winType) &&
        Objects.equals(this.window, chartDataRollingOptionsSchema.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, minPeriods, rollingType, rollingTypeOptions, winType, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataRollingOptionsSchema {\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    minPeriods: ").append(toIndentedString(minPeriods)).append("\n");
    sb.append("    rollingType: ").append(toIndentedString(rollingType)).append("\n");
    sb.append("    rollingTypeOptions: ").append(toIndentedString(rollingTypeOptions)).append("\n");
    sb.append("    winType: ").append(toIndentedString(winType)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
    openapiFields.add("center");
    openapiFields.add("min_periods");
    openapiFields.add("rolling_type");
    openapiFields.add("rolling_type_options");
    openapiFields.add("win_type");
    openapiFields.add("window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rolling_type");
    openapiRequiredFields.add("window");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChartDataRollingOptionsSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChartDataRollingOptionsSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChartDataRollingOptionsSchema is not found in the empty JSON string", ChartDataRollingOptionsSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChartDataRollingOptionsSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChartDataRollingOptionsSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChartDataRollingOptionsSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("rolling_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rolling_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rolling_type").toString()));
      }
      // validate the required field `rolling_type`
      RollingTypeEnum.validateJsonElement(jsonObj.get("rolling_type"));
      if ((jsonObj.get("win_type") != null && !jsonObj.get("win_type").isJsonNull()) && !jsonObj.get("win_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `win_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("win_type").toString()));
      }
      // validate the optional field `win_type`
      if (jsonObj.get("win_type") != null && !jsonObj.get("win_type").isJsonNull()) {
        WinTypeEnum.validateJsonElement(jsonObj.get("win_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChartDataRollingOptionsSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChartDataRollingOptionsSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChartDataRollingOptionsSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChartDataRollingOptionsSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ChartDataRollingOptionsSchema>() {
           @Override
           public void write(JsonWriter out, ChartDataRollingOptionsSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChartDataRollingOptionsSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChartDataRollingOptionsSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChartDataRollingOptionsSchema
   * @throws IOException if the JSON string is invalid with respect to ChartDataRollingOptionsSchema
   */
  public static ChartDataRollingOptionsSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChartDataRollingOptionsSchema.class);
  }

  /**
   * Convert an instance of ChartDataRollingOptionsSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

