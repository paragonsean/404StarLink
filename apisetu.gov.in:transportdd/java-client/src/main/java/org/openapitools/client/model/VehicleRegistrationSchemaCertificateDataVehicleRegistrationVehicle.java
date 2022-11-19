/*
 * Transport Department, Daman & Diu
 * Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.
 *
 * The version of the OpenAPI document: 3.0.0
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
 * VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:32.694934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle {
  public static final String SERIALIZED_NAME_CHASIS_NO = "chasisNo";
  @SerializedName(SERIALIZED_NAME_CHASIS_NO)
  private String chasisNo;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private Object propertyClass;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_CUBIC_CAPACITY = "cubicCapacity";
  @SerializedName(SERIALIZED_NAME_CUBIC_CAPACITY)
  private Object cubicCapacity;

  public static final String SERIALIZED_NAME_CYLINDER = "cylinder";
  @SerializedName(SERIALIZED_NAME_CYLINDER)
  private Object cylinder;

  public static final String SERIALIZED_NAME_ENGINE_NO = "engineNo";
  @SerializedName(SERIALIZED_NAME_ENGINE_NO)
  private String engineNo;

  public static final String SERIALIZED_NAME_FIT_TILL = "fitTill";
  @SerializedName(SERIALIZED_NAME_FIT_TILL)
  private Object fitTill;

  public static final String SERIALIZED_NAME_FUEL_DESC = "fuelDesc";
  @SerializedName(SERIALIZED_NAME_FUEL_DESC)
  private Object fuelDesc;

  public static final String SERIALIZED_NAME_MAKE = "make";
  @SerializedName(SERIALIZED_NAME_MAKE)
  private Object make;

  public static final String SERIALIZED_NAME_MFG_DATE = "mfgDate";
  @SerializedName(SERIALIZED_NAME_MFG_DATE)
  private Object mfgDate;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_SEAT_CAPACITY = "seatCapacity";
  @SerializedName(SERIALIZED_NAME_SEAT_CAPACITY)
  private String seatCapacity;

  public static final String SERIALIZED_NAME_SLEEPER_CAPACITY = "sleeperCapacity";
  @SerializedName(SERIALIZED_NAME_SLEEPER_CAPACITY)
  private String sleeperCapacity;

  public static final String SERIALIZED_NAME_STANDING_CAPACITY = "standingCapacity";
  @SerializedName(SERIALIZED_NAME_STANDING_CAPACITY)
  private Object standingCapacity;

  public static final String SERIALIZED_NAME_UNLADEN_WEIGHT = "unladenWeight";
  @SerializedName(SERIALIZED_NAME_UNLADEN_WEIGHT)
  private String unladenWeight;

  public static final String SERIALIZED_NAME_WHEELBASE = "wheelbase";
  @SerializedName(SERIALIZED_NAME_WHEELBASE)
  private Object wheelbase;

  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle() {
  }

  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle chasisNo(String chasisNo) {
    this.chasisNo = chasisNo;
    return this;
  }

  /**
   * Get chasisNo
   * @return chasisNo
   */
  @javax.annotation.Nullable
  public String getChasisNo() {
    return chasisNo;
  }

  public void setChasisNo(String chasisNo) {
    this.chasisNo = chasisNo;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle propertyClass(Object propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   */
  @javax.annotation.Nullable
  public Object getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(Object propertyClass) {
    this.propertyClass = propertyClass;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle cubicCapacity(Object cubicCapacity) {
    this.cubicCapacity = cubicCapacity;
    return this;
  }

  /**
   * Get cubicCapacity
   * @return cubicCapacity
   */
  @javax.annotation.Nullable
  public Object getCubicCapacity() {
    return cubicCapacity;
  }

  public void setCubicCapacity(Object cubicCapacity) {
    this.cubicCapacity = cubicCapacity;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle cylinder(Object cylinder) {
    this.cylinder = cylinder;
    return this;
  }

  /**
   * Get cylinder
   * @return cylinder
   */
  @javax.annotation.Nullable
  public Object getCylinder() {
    return cylinder;
  }

  public void setCylinder(Object cylinder) {
    this.cylinder = cylinder;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle engineNo(String engineNo) {
    this.engineNo = engineNo;
    return this;
  }

  /**
   * Get engineNo
   * @return engineNo
   */
  @javax.annotation.Nullable
  public String getEngineNo() {
    return engineNo;
  }

  public void setEngineNo(String engineNo) {
    this.engineNo = engineNo;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle fitTill(Object fitTill) {
    this.fitTill = fitTill;
    return this;
  }

  /**
   * Get fitTill
   * @return fitTill
   */
  @javax.annotation.Nullable
  public Object getFitTill() {
    return fitTill;
  }

  public void setFitTill(Object fitTill) {
    this.fitTill = fitTill;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle fuelDesc(Object fuelDesc) {
    this.fuelDesc = fuelDesc;
    return this;
  }

  /**
   * Get fuelDesc
   * @return fuelDesc
   */
  @javax.annotation.Nullable
  public Object getFuelDesc() {
    return fuelDesc;
  }

  public void setFuelDesc(Object fuelDesc) {
    this.fuelDesc = fuelDesc;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle make(Object make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
   */
  @javax.annotation.Nullable
  public Object getMake() {
    return make;
  }

  public void setMake(Object make) {
    this.make = make;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle mfgDate(Object mfgDate) {
    this.mfgDate = mfgDate;
    return this;
  }

  /**
   * Get mfgDate
   * @return mfgDate
   */
  @javax.annotation.Nullable
  public Object getMfgDate() {
    return mfgDate;
  }

  public void setMfgDate(Object mfgDate) {
    this.mfgDate = mfgDate;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle seatCapacity(String seatCapacity) {
    this.seatCapacity = seatCapacity;
    return this;
  }

  /**
   * Get seatCapacity
   * @return seatCapacity
   */
  @javax.annotation.Nullable
  public String getSeatCapacity() {
    return seatCapacity;
  }

  public void setSeatCapacity(String seatCapacity) {
    this.seatCapacity = seatCapacity;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle sleeperCapacity(String sleeperCapacity) {
    this.sleeperCapacity = sleeperCapacity;
    return this;
  }

  /**
   * Get sleeperCapacity
   * @return sleeperCapacity
   */
  @javax.annotation.Nullable
  public String getSleeperCapacity() {
    return sleeperCapacity;
  }

  public void setSleeperCapacity(String sleeperCapacity) {
    this.sleeperCapacity = sleeperCapacity;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle standingCapacity(Object standingCapacity) {
    this.standingCapacity = standingCapacity;
    return this;
  }

  /**
   * Get standingCapacity
   * @return standingCapacity
   */
  @javax.annotation.Nullable
  public Object getStandingCapacity() {
    return standingCapacity;
  }

  public void setStandingCapacity(Object standingCapacity) {
    this.standingCapacity = standingCapacity;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle unladenWeight(String unladenWeight) {
    this.unladenWeight = unladenWeight;
    return this;
  }

  /**
   * Get unladenWeight
   * @return unladenWeight
   */
  @javax.annotation.Nullable
  public String getUnladenWeight() {
    return unladenWeight;
  }

  public void setUnladenWeight(String unladenWeight) {
    this.unladenWeight = unladenWeight;
  }


  public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle wheelbase(Object wheelbase) {
    this.wheelbase = wheelbase;
    return this;
  }

  /**
   * Get wheelbase
   * @return wheelbase
   */
  @javax.annotation.Nullable
  public Object getWheelbase() {
    return wheelbase;
  }

  public void setWheelbase(Object wheelbase) {
    this.wheelbase = wheelbase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle = (VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle) o;
    return Objects.equals(this.chasisNo, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.chasisNo) &&
        Objects.equals(this.propertyClass, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.propertyClass) &&
        Objects.equals(this.color, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.color) &&
        Objects.equals(this.cubicCapacity, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.cubicCapacity) &&
        Objects.equals(this.cylinder, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.cylinder) &&
        Objects.equals(this.engineNo, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.engineNo) &&
        Objects.equals(this.fitTill, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.fitTill) &&
        Objects.equals(this.fuelDesc, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.fuelDesc) &&
        Objects.equals(this.make, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.make) &&
        Objects.equals(this.mfgDate, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.mfgDate) &&
        Objects.equals(this.model, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.model) &&
        Objects.equals(this.seatCapacity, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.seatCapacity) &&
        Objects.equals(this.sleeperCapacity, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.sleeperCapacity) &&
        Objects.equals(this.standingCapacity, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.standingCapacity) &&
        Objects.equals(this.unladenWeight, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.unladenWeight) &&
        Objects.equals(this.wheelbase, vehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.wheelbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chasisNo, propertyClass, color, cubicCapacity, cylinder, engineNo, fitTill, fuelDesc, make, mfgDate, model, seatCapacity, sleeperCapacity, standingCapacity, unladenWeight, wheelbase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle {\n");
    sb.append("    chasisNo: ").append(toIndentedString(chasisNo)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cubicCapacity: ").append(toIndentedString(cubicCapacity)).append("\n");
    sb.append("    cylinder: ").append(toIndentedString(cylinder)).append("\n");
    sb.append("    engineNo: ").append(toIndentedString(engineNo)).append("\n");
    sb.append("    fitTill: ").append(toIndentedString(fitTill)).append("\n");
    sb.append("    fuelDesc: ").append(toIndentedString(fuelDesc)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    mfgDate: ").append(toIndentedString(mfgDate)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    seatCapacity: ").append(toIndentedString(seatCapacity)).append("\n");
    sb.append("    sleeperCapacity: ").append(toIndentedString(sleeperCapacity)).append("\n");
    sb.append("    standingCapacity: ").append(toIndentedString(standingCapacity)).append("\n");
    sb.append("    unladenWeight: ").append(toIndentedString(unladenWeight)).append("\n");
    sb.append("    wheelbase: ").append(toIndentedString(wheelbase)).append("\n");
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
    openapiFields.add("chasisNo");
    openapiFields.add("class");
    openapiFields.add("color");
    openapiFields.add("cubicCapacity");
    openapiFields.add("cylinder");
    openapiFields.add("engineNo");
    openapiFields.add("fitTill");
    openapiFields.add("fuelDesc");
    openapiFields.add("make");
    openapiFields.add("mfgDate");
    openapiFields.add("model");
    openapiFields.add("seatCapacity");
    openapiFields.add("sleeperCapacity");
    openapiFields.add("standingCapacity");
    openapiFields.add("unladenWeight");
    openapiFields.add("wheelbase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle is not found in the empty JSON string", VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chasisNo") != null && !jsonObj.get("chasisNo").isJsonNull()) && !jsonObj.get("chasisNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chasisNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chasisNo").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("engineNo") != null && !jsonObj.get("engineNo").isJsonNull()) && !jsonObj.get("engineNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engineNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engineNo").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("seatCapacity") != null && !jsonObj.get("seatCapacity").isJsonNull()) && !jsonObj.get("seatCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatCapacity").toString()));
      }
      if ((jsonObj.get("sleeperCapacity") != null && !jsonObj.get("sleeperCapacity").isJsonNull()) && !jsonObj.get("sleeperCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sleeperCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sleeperCapacity").toString()));
      }
      if ((jsonObj.get("unladenWeight") != null && !jsonObj.get("unladenWeight").isJsonNull()) && !jsonObj.get("unladenWeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unladenWeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unladenWeight").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.class));

       return (TypeAdapter<T>) new TypeAdapter<VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle>() {
           @Override
           public void write(JsonWriter out, VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle
   * @throws IOException if the JSON string is invalid with respect to VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle
   */
  public static VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle.class);
  }

  /**
   * Convert an instance of VehicleRegistrationSchemaCertificateDataVehicleRegistrationVehicle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

