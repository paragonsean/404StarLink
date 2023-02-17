/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
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
 * An attestation wrapper with a PGP-compatible signature. This message only supports &#x60;ATTACHED&#x60; signatures, where the payload that is signed is included alongside the signature itself in the same file.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PgpSignedAttestation {
  /**
   * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    CONTENT_TYPE_UNSPECIFIED("CONTENT_TYPE_UNSPECIFIED"),
    
    SIMPLE_SIGNING_JSON("SIMPLE_SIGNING_JSON");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ContentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private ContentTypeEnum contentType;

  public static final String SERIALIZED_NAME_PGP_KEY_ID = "pgpKeyId";
  @SerializedName(SERIALIZED_NAME_PGP_KEY_ID)
  private String pgpKeyId;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public PgpSignedAttestation() {
  }

  public PgpSignedAttestation contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
   * @return contentType
   */
  @javax.annotation.Nullable
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  public PgpSignedAttestation pgpKeyId(String pgpKeyId) {
    this.pgpKeyId = pgpKeyId;
    return this;
  }

  /**
   * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. &#x60;gpg --list-keys&#x60;. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexadecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge \&quot;LONG\&quot;, \&quot;SHORT\&quot;, or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the &#x60;fpr&#x60; field returned when calling --list-keys with --with-colons. For example: &#x60;&#x60;&#x60; gpg --with-colons --with-fingerprint --force-v4-certs \\ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: &#x60;&#x60;&#x60; Above, the fingerprint is &#x60;24FF6481B76AC91E66A00AC657A93A81EF3AE6FB&#x60;.
   * @return pgpKeyId
   */
  @javax.annotation.Nullable
  public String getPgpKeyId() {
    return pgpKeyId;
  }

  public void setPgpKeyId(String pgpKeyId) {
    this.pgpKeyId = pgpKeyId;
  }


  public PgpSignedAttestation signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Required. The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (&#x60;--armor&#x60; to gpg), non-clearsigned (&#x60;--sign&#x60; rather than &#x60;--clearsign&#x60; to gpg) are supported. Concretely, &#x60;gpg --sign --armor --output&#x3D;signature.gpg payload.json&#x60; will create the signature content expected in this field in &#x60;signature.gpg&#x60; for the &#x60;payload.json&#x60; attestation payload.
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgpSignedAttestation pgpSignedAttestation = (PgpSignedAttestation) o;
    return Objects.equals(this.contentType, pgpSignedAttestation.contentType) &&
        Objects.equals(this.pgpKeyId, pgpSignedAttestation.pgpKeyId) &&
        Objects.equals(this.signature, pgpSignedAttestation.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, pgpKeyId, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgpSignedAttestation {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    pgpKeyId: ").append(toIndentedString(pgpKeyId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("contentType");
    openapiFields.add("pgpKeyId");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PgpSignedAttestation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PgpSignedAttestation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PgpSignedAttestation is not found in the empty JSON string", PgpSignedAttestation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PgpSignedAttestation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PgpSignedAttestation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      // validate the optional field `contentType`
      if (jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) {
        ContentTypeEnum.validateJsonElement(jsonObj.get("contentType"));
      }
      if ((jsonObj.get("pgpKeyId") != null && !jsonObj.get("pgpKeyId").isJsonNull()) && !jsonObj.get("pgpKeyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pgpKeyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pgpKeyId").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PgpSignedAttestation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PgpSignedAttestation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PgpSignedAttestation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PgpSignedAttestation.class));

       return (TypeAdapter<T>) new TypeAdapter<PgpSignedAttestation>() {
           @Override
           public void write(JsonWriter out, PgpSignedAttestation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PgpSignedAttestation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PgpSignedAttestation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PgpSignedAttestation
   * @throws IOException if the JSON string is invalid with respect to PgpSignedAttestation
   */
  public static PgpSignedAttestation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PgpSignedAttestation.class);
  }

  /**
   * Convert an instance of PgpSignedAttestation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

