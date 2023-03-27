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
 * Verifiers (e.g. Kritis implementations) MUST verify signatures with respect to the trust anchors defined in policy (e.g. a Kritis policy). Typically this means that the verifier has been configured with a map from &#x60;public_key_id&#x60; to public key material (and any required parameters, e.g. signing algorithm). In particular, verification implementations MUST NOT treat the signature &#x60;public_key_id&#x60; as anything more than a key lookup hint. The &#x60;public_key_id&#x60; DOES NOT validate or authenticate a public key; it only provides a mechanism for quickly selecting a public key ALREADY CONFIGURED on the verifier through a trusted channel. Verification implementations MUST reject signatures in any of the following circumstances: * The &#x60;public_key_id&#x60; is not recognized by the verifier. * The public key that &#x60;public_key_id&#x60; refers to does not verify the signature with respect to the payload. The &#x60;signature&#x60; contents SHOULD NOT be \&quot;attached\&quot; (where the payload is included with the serialized &#x60;signature&#x60; bytes). Verifiers MUST ignore any \&quot;attached\&quot; payload and only verify signatures with respect to explicitly provided payload (e.g. a &#x60;payload&#x60; field on the proto message that holds this Signature, or the canonical serialization of the proto message that holds this signature).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:01.336252-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Signature {
  public static final String SERIALIZED_NAME_PUBLIC_KEY_ID = "publicKeyId";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_ID)
  private String publicKeyId;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private byte[] signature;

  public Signature() {
  }

  public Signature publicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
    return this;
  }

  /**
   * The identifier for the public key that verifies this signature. * The &#x60;public_key_id&#x60; is required. * The &#x60;public_key_id&#x60; SHOULD be an RFC3986 conformant URI. * When possible, the &#x60;public_key_id&#x60; SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid &#x60;public_key_id&#x60;s: OpenPGP V4 public key fingerprint: * \&quot;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA\&quot; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * \&quot;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU\&quot; * \&quot;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5\&quot;
   * @return publicKeyId
   */
  @javax.annotation.Nullable
  public String getPublicKeyId() {
    return publicKeyId;
  }

  public void setPublicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
  }


  public Signature signature(byte[] signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
   * @return signature
   */
  @javax.annotation.Nullable
  public byte[] getSignature() {
    return signature;
  }

  public void setSignature(byte[] signature) {
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
    Signature signature = (Signature) o;
    return Objects.equals(this.publicKeyId, signature.publicKeyId) &&
        Arrays.equals(this.signature, signature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKeyId, Arrays.hashCode(signature));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
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
    openapiFields.add("publicKeyId");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Signature
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Signature.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Signature is not found in the empty JSON string", Signature.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Signature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Signature` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("publicKeyId") != null && !jsonObj.get("publicKeyId").isJsonNull()) && !jsonObj.get("publicKeyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicKeyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicKeyId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Signature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Signature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Signature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Signature.class));

       return (TypeAdapter<T>) new TypeAdapter<Signature>() {
           @Override
           public void write(JsonWriter out, Signature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Signature read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Signature given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Signature
   * @throws IOException if the JSON string is invalid with respect to Signature
   */
  public static Signature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Signature.class);
  }

  /**
   * Convert an instance of Signature to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

