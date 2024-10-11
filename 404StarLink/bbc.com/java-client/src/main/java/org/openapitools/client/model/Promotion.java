/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Context;
import org.openapitools.client.model.Identifiers;
import org.openapitools.client.model.PidReference;
import org.openapitools.client.model.RelatedLinks;
import org.openapitools.client.model.Synopses;

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
 * Promotion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Promotion {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Context context;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Identifiers identifiers;

  public static final String SERIALIZED_NAME_PARTNER = "partner";
  @SerializedName(SERIALIZED_NAME_PARTNER)
  private String partner;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PROMOTED_BY = "promoted_by";
  @SerializedName(SERIALIZED_NAME_PROMOTED_BY)
  private String promotedBy;

  public static final String SERIALIZED_NAME_PROMOTED_FOR = "promoted_for";
  @SerializedName(SERIALIZED_NAME_PROMOTED_FOR)
  private String promotedFor;

  public static final String SERIALIZED_NAME_PROMOTION_OF = "promotion_of";
  @SerializedName(SERIALIZED_NAME_PROMOTION_OF)
  private PidReference promotionOf;

  public static final String SERIALIZED_NAME_RELATED_LINKS = "related_links";
  @SerializedName(SERIALIZED_NAME_RELATED_LINKS)
  private RelatedLinks relatedLinks;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SYNOPSES = "synopses";
  @SerializedName(SERIALIZED_NAME_SYNOPSES)
  private Synopses synopses;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "updated_time";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private OffsetDateTime updatedTime;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public Promotion() {
  }

  public Promotion context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nullable
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }


  public Promotion endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Promotion identifiers(Identifiers identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
   */
  @javax.annotation.Nullable
  public Identifiers getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(Identifiers identifiers) {
    this.identifiers = identifiers;
  }


  public Promotion partner(String partner) {
    this.partner = partner;
    return this;
  }

  /**
   * Get partner
   * @return partner
   */
  @javax.annotation.Nonnull
  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }


  public Promotion pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @javax.annotation.Nonnull
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }


  public Promotion priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Promotion promotedBy(String promotedBy) {
    this.promotedBy = promotedBy;
    return this;
  }

  /**
   * Get promotedBy
   * @return promotedBy
   */
  @javax.annotation.Nullable
  public String getPromotedBy() {
    return promotedBy;
  }

  public void setPromotedBy(String promotedBy) {
    this.promotedBy = promotedBy;
  }


  public Promotion promotedFor(String promotedFor) {
    this.promotedFor = promotedFor;
    return this;
  }

  /**
   * Get promotedFor
   * @return promotedFor
   */
  @javax.annotation.Nullable
  public String getPromotedFor() {
    return promotedFor;
  }

  public void setPromotedFor(String promotedFor) {
    this.promotedFor = promotedFor;
  }


  public Promotion promotionOf(PidReference promotionOf) {
    this.promotionOf = promotionOf;
    return this;
  }

  /**
   * Get promotionOf
   * @return promotionOf
   */
  @javax.annotation.Nullable
  public PidReference getPromotionOf() {
    return promotionOf;
  }

  public void setPromotionOf(PidReference promotionOf) {
    this.promotionOf = promotionOf;
  }


  public Promotion relatedLinks(RelatedLinks relatedLinks) {
    this.relatedLinks = relatedLinks;
    return this;
  }

  /**
   * Get relatedLinks
   * @return relatedLinks
   */
  @javax.annotation.Nullable
  public RelatedLinks getRelatedLinks() {
    return relatedLinks;
  }

  public void setRelatedLinks(RelatedLinks relatedLinks) {
    this.relatedLinks = relatedLinks;
  }


  public Promotion startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Promotion status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Promotion synopses(Synopses synopses) {
    this.synopses = synopses;
    return this;
  }

  /**
   * Get synopses
   * @return synopses
   */
  @javax.annotation.Nullable
  public Synopses getSynopses() {
    return synopses;
  }

  public void setSynopses(Synopses synopses) {
    this.synopses = synopses;
  }


  public Promotion title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Promotion updatedTime(OffsetDateTime updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(OffsetDateTime updatedTime) {
    this.updatedTime = updatedTime;
  }


  public Promotion uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   */
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  public Promotion url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.context, promotion.context) &&
        Objects.equals(this.endTime, promotion.endTime) &&
        Objects.equals(this.identifiers, promotion.identifiers) &&
        Objects.equals(this.partner, promotion.partner) &&
        Objects.equals(this.pid, promotion.pid) &&
        Objects.equals(this.priority, promotion.priority) &&
        Objects.equals(this.promotedBy, promotion.promotedBy) &&
        Objects.equals(this.promotedFor, promotion.promotedFor) &&
        Objects.equals(this.promotionOf, promotion.promotionOf) &&
        Objects.equals(this.relatedLinks, promotion.relatedLinks) &&
        Objects.equals(this.startTime, promotion.startTime) &&
        Objects.equals(this.status, promotion.status) &&
        Objects.equals(this.synopses, promotion.synopses) &&
        Objects.equals(this.title, promotion.title) &&
        Objects.equals(this.updatedTime, promotion.updatedTime) &&
        Objects.equals(this.uri, promotion.uri) &&
        Objects.equals(this.url, promotion.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, endTime, identifiers, partner, pid, priority, promotedBy, promotedFor, promotionOf, relatedLinks, startTime, status, synopses, title, updatedTime, uri, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    promotedBy: ").append(toIndentedString(promotedBy)).append("\n");
    sb.append("    promotedFor: ").append(toIndentedString(promotedFor)).append("\n");
    sb.append("    promotionOf: ").append(toIndentedString(promotionOf)).append("\n");
    sb.append("    relatedLinks: ").append(toIndentedString(relatedLinks)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    synopses: ").append(toIndentedString(synopses)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("end_time");
    openapiFields.add("identifiers");
    openapiFields.add("partner");
    openapiFields.add("pid");
    openapiFields.add("priority");
    openapiFields.add("promoted_by");
    openapiFields.add("promoted_for");
    openapiFields.add("promotion_of");
    openapiFields.add("related_links");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("synopses");
    openapiFields.add("title");
    openapiFields.add("updated_time");
    openapiFields.add("uri");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("partner");
    openapiRequiredFields.add("pid");
    openapiRequiredFields.add("updated_time");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Promotion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Promotion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Promotion is not found in the empty JSON string", Promotion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Promotion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Promotion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Promotion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `context`
      if (jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) {
        Context.validateJsonElement(jsonObj.get("context"));
      }
      // validate the optional field `identifiers`
      if (jsonObj.get("identifiers") != null && !jsonObj.get("identifiers").isJsonNull()) {
        Identifiers.validateJsonElement(jsonObj.get("identifiers"));
      }
      if (!jsonObj.get("partner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner").toString()));
      }
      if (!jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if ((jsonObj.get("promoted_by") != null && !jsonObj.get("promoted_by").isJsonNull()) && !jsonObj.get("promoted_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoted_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoted_by").toString()));
      }
      if ((jsonObj.get("promoted_for") != null && !jsonObj.get("promoted_for").isJsonNull()) && !jsonObj.get("promoted_for").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoted_for` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoted_for").toString()));
      }
      // validate the optional field `promotion_of`
      if (jsonObj.get("promotion_of") != null && !jsonObj.get("promotion_of").isJsonNull()) {
        PidReference.validateJsonElement(jsonObj.get("promotion_of"));
      }
      // validate the optional field `related_links`
      if (jsonObj.get("related_links") != null && !jsonObj.get("related_links").isJsonNull()) {
        RelatedLinks.validateJsonElement(jsonObj.get("related_links"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `synopses`
      if (jsonObj.get("synopses") != null && !jsonObj.get("synopses").isJsonNull()) {
        Synopses.validateJsonElement(jsonObj.get("synopses"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Promotion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Promotion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Promotion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Promotion.class));

       return (TypeAdapter<T>) new TypeAdapter<Promotion>() {
           @Override
           public void write(JsonWriter out, Promotion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Promotion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Promotion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Promotion
   * @throws IOException if the JSON string is invalid with respect to Promotion
   */
  public static Promotion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Promotion.class);
  }

  /**
   * Convert an instance of Promotion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

