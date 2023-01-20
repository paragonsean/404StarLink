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
import java.util.List;
import java.util.Map;

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
 * &lt;p&gt;Represents the data for an attribute.&lt;/p&gt; &lt;p&gt;Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes\&quot;&gt;Data Types&lt;/a&gt; in the &lt;i&gt;Amazon DynamoDB Developer Guide&lt;/i&gt;.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:36.213583-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AttributeValue {
  public static final String SERIALIZED_NAME_S = "S";
  @SerializedName(SERIALIZED_NAME_S)
  private String S;

  public static final String SERIALIZED_NAME_N = "N";
  @SerializedName(SERIALIZED_NAME_N)
  private String N;

  public static final String SERIALIZED_NAME_B = "B";
  @SerializedName(SERIALIZED_NAME_B)
  private String B;

  public static final String SERIALIZED_NAME_S_S = "SS";
  @SerializedName(SERIALIZED_NAME_S_S)
  private List SS;

  public static final String SERIALIZED_NAME_N_S = "NS";
  @SerializedName(SERIALIZED_NAME_N_S)
  private List NS;

  public static final String SERIALIZED_NAME_B_S = "BS";
  @SerializedName(SERIALIZED_NAME_B_S)
  private List BS;

  public static final String SERIALIZED_NAME_M = "M";
  @SerializedName(SERIALIZED_NAME_M)
  private Map M;

  public static final String SERIALIZED_NAME_L = "L";
  @SerializedName(SERIALIZED_NAME_L)
  private List L;

  public static final String SERIALIZED_NAME_N_U_L_L = "NULL";
  @SerializedName(SERIALIZED_NAME_N_U_L_L)
  private Boolean NULL;

  public static final String SERIALIZED_NAME_B_O_O_L = "BOOL";
  @SerializedName(SERIALIZED_NAME_B_O_O_L)
  private Boolean BOOL;

  public AttributeValue() {
  }

  public AttributeValue S(String S) {
    this.S = S;
    return this;
  }

  /**
   * Get S
   * @return S
   */
  @javax.annotation.Nullable
  public String getS() {
    return S;
  }

  public void setS(String S) {
    this.S = S;
  }


  public AttributeValue N(String N) {
    this.N = N;
    return this;
  }

  /**
   * Get N
   * @return N
   */
  @javax.annotation.Nullable
  public String getN() {
    return N;
  }

  public void setN(String N) {
    this.N = N;
  }


  public AttributeValue B(String B) {
    this.B = B;
    return this;
  }

  /**
   * Get B
   * @return B
   */
  @javax.annotation.Nullable
  public String getB() {
    return B;
  }

  public void setB(String B) {
    this.B = B;
  }


  public AttributeValue SS(List SS) {
    this.SS = SS;
    return this;
  }

  /**
   * Get SS
   * @return SS
   */
  @javax.annotation.Nullable
  public List getSS() {
    return SS;
  }

  public void setSS(List SS) {
    this.SS = SS;
  }


  public AttributeValue NS(List NS) {
    this.NS = NS;
    return this;
  }

  /**
   * Get NS
   * @return NS
   */
  @javax.annotation.Nullable
  public List getNS() {
    return NS;
  }

  public void setNS(List NS) {
    this.NS = NS;
  }


  public AttributeValue BS(List BS) {
    this.BS = BS;
    return this;
  }

  /**
   * Get BS
   * @return BS
   */
  @javax.annotation.Nullable
  public List getBS() {
    return BS;
  }

  public void setBS(List BS) {
    this.BS = BS;
  }


  public AttributeValue M(Map M) {
    this.M = M;
    return this;
  }

  /**
   * Get M
   * @return M
   */
  @javax.annotation.Nullable
  public Map getM() {
    return M;
  }

  public void setM(Map M) {
    this.M = M;
  }


  public AttributeValue L(List L) {
    this.L = L;
    return this;
  }

  /**
   * Get L
   * @return L
   */
  @javax.annotation.Nullable
  public List getL() {
    return L;
  }

  public void setL(List L) {
    this.L = L;
  }


  public AttributeValue NULL(Boolean NULL) {
    this.NULL = NULL;
    return this;
  }

  /**
   * Get NULL
   * @return NULL
   */
  @javax.annotation.Nullable
  public Boolean getNULL() {
    return NULL;
  }

  public void setNULL(Boolean NULL) {
    this.NULL = NULL;
  }


  public AttributeValue BOOL(Boolean BOOL) {
    this.BOOL = BOOL;
    return this;
  }

  /**
   * Get BOOL
   * @return BOOL
   */
  @javax.annotation.Nullable
  public Boolean getBOOL() {
    return BOOL;
  }

  public void setBOOL(Boolean BOOL) {
    this.BOOL = BOOL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeValue attributeValue = (AttributeValue) o;
    return Objects.equals(this.S, attributeValue.S) &&
        Objects.equals(this.N, attributeValue.N) &&
        Objects.equals(this.B, attributeValue.B) &&
        Objects.equals(this.SS, attributeValue.SS) &&
        Objects.equals(this.NS, attributeValue.NS) &&
        Objects.equals(this.BS, attributeValue.BS) &&
        Objects.equals(this.M, attributeValue.M) &&
        Objects.equals(this.L, attributeValue.L) &&
        Objects.equals(this.NULL, attributeValue.NULL) &&
        Objects.equals(this.BOOL, attributeValue.BOOL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(S, N, B, SS, NS, BS, M, L, NULL, BOOL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeValue {\n");
    sb.append("    S: ").append(toIndentedString(S)).append("\n");
    sb.append("    N: ").append(toIndentedString(N)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    SS: ").append(toIndentedString(SS)).append("\n");
    sb.append("    NS: ").append(toIndentedString(NS)).append("\n");
    sb.append("    BS: ").append(toIndentedString(BS)).append("\n");
    sb.append("    M: ").append(toIndentedString(M)).append("\n");
    sb.append("    L: ").append(toIndentedString(L)).append("\n");
    sb.append("    NULL: ").append(toIndentedString(NULL)).append("\n");
    sb.append("    BOOL: ").append(toIndentedString(BOOL)).append("\n");
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
    openapiFields.add("S");
    openapiFields.add("N");
    openapiFields.add("B");
    openapiFields.add("SS");
    openapiFields.add("NS");
    openapiFields.add("BS");
    openapiFields.add("M");
    openapiFields.add("L");
    openapiFields.add("NULL");
    openapiFields.add("BOOL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttributeValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttributeValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttributeValue is not found in the empty JSON string", AttributeValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttributeValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttributeValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `S`
      if (jsonObj.get("S") != null && !jsonObj.get("S").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S"));
      }
      // validate the optional field `N`
      if (jsonObj.get("N") != null && !jsonObj.get("N").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("N"));
      }
      // validate the optional field `B`
      if (jsonObj.get("B") != null && !jsonObj.get("B").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("B"));
      }
      // validate the optional field `SS`
      if (jsonObj.get("SS") != null && !jsonObj.get("SS").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SS"));
      }
      // validate the optional field `NS`
      if (jsonObj.get("NS") != null && !jsonObj.get("NS").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NS"));
      }
      // validate the optional field `BS`
      if (jsonObj.get("BS") != null && !jsonObj.get("BS").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("BS"));
      }
      // validate the optional field `M`
      if (jsonObj.get("M") != null && !jsonObj.get("M").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("M"));
      }
      // validate the optional field `L`
      if (jsonObj.get("L") != null && !jsonObj.get("L").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("L"));
      }
      // validate the optional field `NULL`
      if (jsonObj.get("NULL") != null && !jsonObj.get("NULL").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("NULL"));
      }
      // validate the optional field `BOOL`
      if (jsonObj.get("BOOL") != null && !jsonObj.get("BOOL").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("BOOL"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttributeValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttributeValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttributeValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttributeValue.class));

       return (TypeAdapter<T>) new TypeAdapter<AttributeValue>() {
           @Override
           public void write(JsonWriter out, AttributeValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttributeValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AttributeValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttributeValue
   * @throws IOException if the JSON string is invalid with respect to AttributeValue
   */
  public static AttributeValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttributeValue.class);
  }

  /**
   * Convert an instance of AttributeValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

