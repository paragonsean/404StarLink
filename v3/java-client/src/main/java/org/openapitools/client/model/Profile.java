/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ProfileChildLink;
import org.openapitools.client.model.ProfileParentLink;
import org.openapitools.client.model.ProfilePermissions;

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
 * JSON template for an Analytics view (profile).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Profile {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BOT_FILTERING_ENABLED = "botFilteringEnabled";
  @SerializedName(SERIALIZED_NAME_BOT_FILTERING_ENABLED)
  private Boolean botFilteringEnabled;

  public static final String SERIALIZED_NAME_CHILD_LINK = "childLink";
  @SerializedName(SERIALIZED_NAME_CHILD_LINK)
  private ProfileChildLink childLink;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DEFAULT_PAGE = "defaultPage";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAGE)
  private String defaultPage;

  public static final String SERIALIZED_NAME_E_COMMERCE_TRACKING = "eCommerceTracking";
  @SerializedName(SERIALIZED_NAME_E_COMMERCE_TRACKING)
  private Boolean eCommerceTracking;

  public static final String SERIALIZED_NAME_ENHANCED_E_COMMERCE_TRACKING = "enhancedECommerceTracking";
  @SerializedName(SERIALIZED_NAME_ENHANCED_E_COMMERCE_TRACKING)
  private Boolean enhancedECommerceTracking;

  public static final String SERIALIZED_NAME_EXCLUDE_QUERY_PARAMETERS = "excludeQueryParameters";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_QUERY_PARAMETERS)
  private String excludeQueryParameters;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL_WEB_PROPERTY_ID = "internalWebPropertyId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_WEB_PROPERTY_ID)
  private String internalWebPropertyId;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "analytics#profile";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_LINK = "parentLink";
  @SerializedName(SERIALIZED_NAME_PARENT_LINK)
  private ProfileParentLink parentLink;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private ProfilePermissions permissions;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public static final String SERIALIZED_NAME_SITE_SEARCH_CATEGORY_PARAMETERS = "siteSearchCategoryParameters";
  @SerializedName(SERIALIZED_NAME_SITE_SEARCH_CATEGORY_PARAMETERS)
  private String siteSearchCategoryParameters;

  public static final String SERIALIZED_NAME_SITE_SEARCH_QUERY_PARAMETERS = "siteSearchQueryParameters";
  @SerializedName(SERIALIZED_NAME_SITE_SEARCH_QUERY_PARAMETERS)
  private String siteSearchQueryParameters;

  public static final String SERIALIZED_NAME_STARRED = "starred";
  @SerializedName(SERIALIZED_NAME_STARRED)
  private Boolean starred;

  public static final String SERIALIZED_NAME_STRIP_SITE_SEARCH_CATEGORY_PARAMETERS = "stripSiteSearchCategoryParameters";
  @SerializedName(SERIALIZED_NAME_STRIP_SITE_SEARCH_CATEGORY_PARAMETERS)
  private Boolean stripSiteSearchCategoryParameters;

  public static final String SERIALIZED_NAME_STRIP_SITE_SEARCH_QUERY_PARAMETERS = "stripSiteSearchQueryParameters";
  @SerializedName(SERIALIZED_NAME_STRIP_SITE_SEARCH_QUERY_PARAMETERS)
  private Boolean stripSiteSearchQueryParameters;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_WEB_PROPERTY_ID = "webPropertyId";
  @SerializedName(SERIALIZED_NAME_WEB_PROPERTY_ID)
  private String webPropertyId;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public Profile() {
  }

  public Profile(
     OffsetDateTime created, 
     String internalWebPropertyId, 
     String kind, 
     String selfLink, 
     OffsetDateTime updated, 
     String webPropertyId
  ) {
    this();
    this.created = created;
    this.internalWebPropertyId = internalWebPropertyId;
    this.kind = kind;
    this.selfLink = selfLink;
    this.updated = updated;
    this.webPropertyId = webPropertyId;
  }

  public Profile accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account ID to which this view (profile) belongs.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Profile botFilteringEnabled(Boolean botFilteringEnabled) {
    this.botFilteringEnabled = botFilteringEnabled;
    return this;
  }

  /**
   * Indicates whether bot filtering is enabled for this view (profile).
   * @return botFilteringEnabled
   */
  @javax.annotation.Nullable
  public Boolean getBotFilteringEnabled() {
    return botFilteringEnabled;
  }

  public void setBotFilteringEnabled(Boolean botFilteringEnabled) {
    this.botFilteringEnabled = botFilteringEnabled;
  }


  public Profile childLink(ProfileChildLink childLink) {
    this.childLink = childLink;
    return this;
  }

  /**
   * Get childLink
   * @return childLink
   */
  @javax.annotation.Nullable
  public ProfileChildLink getChildLink() {
    return childLink;
  }

  public void setChildLink(ProfileChildLink childLink) {
    this.childLink = childLink;
  }


  /**
   * Time this view (profile) was created.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }



  public Profile currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency type associated with this view (profile), defaults to USD. The supported values are: USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL, ZAR, UAH, AED, BOB, CLP, COP, EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Profile defaultPage(String defaultPage) {
    this.defaultPage = defaultPage;
    return this;
  }

  /**
   * Default page for this view (profile).
   * @return defaultPage
   */
  @javax.annotation.Nullable
  public String getDefaultPage() {
    return defaultPage;
  }

  public void setDefaultPage(String defaultPage) {
    this.defaultPage = defaultPage;
  }


  public Profile eCommerceTracking(Boolean eCommerceTracking) {
    this.eCommerceTracking = eCommerceTracking;
    return this;
  }

  /**
   * Indicates whether ecommerce tracking is enabled for this view (profile).
   * @return eCommerceTracking
   */
  @javax.annotation.Nullable
  public Boolean geteCommerceTracking() {
    return eCommerceTracking;
  }

  public void seteCommerceTracking(Boolean eCommerceTracking) {
    this.eCommerceTracking = eCommerceTracking;
  }


  public Profile enhancedECommerceTracking(Boolean enhancedECommerceTracking) {
    this.enhancedECommerceTracking = enhancedECommerceTracking;
    return this;
  }

  /**
   * Indicates whether enhanced ecommerce tracking is enabled for this view (profile). This property can only be enabled if ecommerce tracking is enabled.
   * @return enhancedECommerceTracking
   */
  @javax.annotation.Nullable
  public Boolean getEnhancedECommerceTracking() {
    return enhancedECommerceTracking;
  }

  public void setEnhancedECommerceTracking(Boolean enhancedECommerceTracking) {
    this.enhancedECommerceTracking = enhancedECommerceTracking;
  }


  public Profile excludeQueryParameters(String excludeQueryParameters) {
    this.excludeQueryParameters = excludeQueryParameters;
    return this;
  }

  /**
   * The query parameters that are excluded from this view (profile).
   * @return excludeQueryParameters
   */
  @javax.annotation.Nullable
  public String getExcludeQueryParameters() {
    return excludeQueryParameters;
  }

  public void setExcludeQueryParameters(String excludeQueryParameters) {
    this.excludeQueryParameters = excludeQueryParameters;
  }


  public Profile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * View (Profile) ID.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  /**
   * Internal ID for the web property to which this view (profile) belongs.
   * @return internalWebPropertyId
   */
  @javax.annotation.Nullable
  public String getInternalWebPropertyId() {
    return internalWebPropertyId;
  }



  /**
   * Resource type for Analytics view (profile).
   * @return kind
   */
  @javax.annotation.Nullable
  public String getKind() {
    return kind;
  }



  public Profile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of this view (profile).
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Profile parentLink(ProfileParentLink parentLink) {
    this.parentLink = parentLink;
    return this;
  }

  /**
   * Get parentLink
   * @return parentLink
   */
  @javax.annotation.Nullable
  public ProfileParentLink getParentLink() {
    return parentLink;
  }

  public void setParentLink(ProfileParentLink parentLink) {
    this.parentLink = parentLink;
  }


  public Profile permissions(ProfilePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  public ProfilePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ProfilePermissions permissions) {
    this.permissions = permissions;
  }


  /**
   * Link for this view (profile).
   * @return selfLink
   */
  @javax.annotation.Nullable
  public String getSelfLink() {
    return selfLink;
  }



  public Profile siteSearchCategoryParameters(String siteSearchCategoryParameters) {
    this.siteSearchCategoryParameters = siteSearchCategoryParameters;
    return this;
  }

  /**
   * Site search category parameters for this view (profile).
   * @return siteSearchCategoryParameters
   */
  @javax.annotation.Nullable
  public String getSiteSearchCategoryParameters() {
    return siteSearchCategoryParameters;
  }

  public void setSiteSearchCategoryParameters(String siteSearchCategoryParameters) {
    this.siteSearchCategoryParameters = siteSearchCategoryParameters;
  }


  public Profile siteSearchQueryParameters(String siteSearchQueryParameters) {
    this.siteSearchQueryParameters = siteSearchQueryParameters;
    return this;
  }

  /**
   * The site search query parameters for this view (profile).
   * @return siteSearchQueryParameters
   */
  @javax.annotation.Nullable
  public String getSiteSearchQueryParameters() {
    return siteSearchQueryParameters;
  }

  public void setSiteSearchQueryParameters(String siteSearchQueryParameters) {
    this.siteSearchQueryParameters = siteSearchQueryParameters;
  }


  public Profile starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

  /**
   * Indicates whether this view (profile) is starred or not.
   * @return starred
   */
  @javax.annotation.Nullable
  public Boolean getStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }


  public Profile stripSiteSearchCategoryParameters(Boolean stripSiteSearchCategoryParameters) {
    this.stripSiteSearchCategoryParameters = stripSiteSearchCategoryParameters;
    return this;
  }

  /**
   * Whether or not Analytics will strip search category parameters from the URLs in your reports.
   * @return stripSiteSearchCategoryParameters
   */
  @javax.annotation.Nullable
  public Boolean getStripSiteSearchCategoryParameters() {
    return stripSiteSearchCategoryParameters;
  }

  public void setStripSiteSearchCategoryParameters(Boolean stripSiteSearchCategoryParameters) {
    this.stripSiteSearchCategoryParameters = stripSiteSearchCategoryParameters;
  }


  public Profile stripSiteSearchQueryParameters(Boolean stripSiteSearchQueryParameters) {
    this.stripSiteSearchQueryParameters = stripSiteSearchQueryParameters;
    return this;
  }

  /**
   * Whether or not Analytics will strip search query parameters from the URLs in your reports.
   * @return stripSiteSearchQueryParameters
   */
  @javax.annotation.Nullable
  public Boolean getStripSiteSearchQueryParameters() {
    return stripSiteSearchQueryParameters;
  }

  public void setStripSiteSearchQueryParameters(Boolean stripSiteSearchQueryParameters) {
    this.stripSiteSearchQueryParameters = stripSiteSearchQueryParameters;
  }


  public Profile timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Time zone for which this view (profile) has been configured. Time zones are identified by strings from the TZ database.
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public Profile type(String type) {
    this.type = type;
    return this;
  }

  /**
   * View (Profile) type. Supported types: WEB or APP.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  /**
   * Time this view (profile) was last modified.
   * @return updated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdated() {
    return updated;
  }



  /**
   * Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs.
   * @return webPropertyId
   */
  @javax.annotation.Nullable
  public String getWebPropertyId() {
    return webPropertyId;
  }



  public Profile websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Website URL for this view (profile).
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.accountId, profile.accountId) &&
        Objects.equals(this.botFilteringEnabled, profile.botFilteringEnabled) &&
        Objects.equals(this.childLink, profile.childLink) &&
        Objects.equals(this.created, profile.created) &&
        Objects.equals(this.currency, profile.currency) &&
        Objects.equals(this.defaultPage, profile.defaultPage) &&
        Objects.equals(this.eCommerceTracking, profile.eCommerceTracking) &&
        Objects.equals(this.enhancedECommerceTracking, profile.enhancedECommerceTracking) &&
        Objects.equals(this.excludeQueryParameters, profile.excludeQueryParameters) &&
        Objects.equals(this.id, profile.id) &&
        Objects.equals(this.internalWebPropertyId, profile.internalWebPropertyId) &&
        Objects.equals(this.kind, profile.kind) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.parentLink, profile.parentLink) &&
        Objects.equals(this.permissions, profile.permissions) &&
        Objects.equals(this.selfLink, profile.selfLink) &&
        Objects.equals(this.siteSearchCategoryParameters, profile.siteSearchCategoryParameters) &&
        Objects.equals(this.siteSearchQueryParameters, profile.siteSearchQueryParameters) &&
        Objects.equals(this.starred, profile.starred) &&
        Objects.equals(this.stripSiteSearchCategoryParameters, profile.stripSiteSearchCategoryParameters) &&
        Objects.equals(this.stripSiteSearchQueryParameters, profile.stripSiteSearchQueryParameters) &&
        Objects.equals(this.timezone, profile.timezone) &&
        Objects.equals(this.type, profile.type) &&
        Objects.equals(this.updated, profile.updated) &&
        Objects.equals(this.webPropertyId, profile.webPropertyId) &&
        Objects.equals(this.websiteUrl, profile.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, botFilteringEnabled, childLink, created, currency, defaultPage, eCommerceTracking, enhancedECommerceTracking, excludeQueryParameters, id, internalWebPropertyId, kind, name, parentLink, permissions, selfLink, siteSearchCategoryParameters, siteSearchQueryParameters, starred, stripSiteSearchCategoryParameters, stripSiteSearchQueryParameters, timezone, type, updated, webPropertyId, websiteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    botFilteringEnabled: ").append(toIndentedString(botFilteringEnabled)).append("\n");
    sb.append("    childLink: ").append(toIndentedString(childLink)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    defaultPage: ").append(toIndentedString(defaultPage)).append("\n");
    sb.append("    eCommerceTracking: ").append(toIndentedString(eCommerceTracking)).append("\n");
    sb.append("    enhancedECommerceTracking: ").append(toIndentedString(enhancedECommerceTracking)).append("\n");
    sb.append("    excludeQueryParameters: ").append(toIndentedString(excludeQueryParameters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalWebPropertyId: ").append(toIndentedString(internalWebPropertyId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentLink: ").append(toIndentedString(parentLink)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    siteSearchCategoryParameters: ").append(toIndentedString(siteSearchCategoryParameters)).append("\n");
    sb.append("    siteSearchQueryParameters: ").append(toIndentedString(siteSearchQueryParameters)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    stripSiteSearchCategoryParameters: ").append(toIndentedString(stripSiteSearchCategoryParameters)).append("\n");
    sb.append("    stripSiteSearchQueryParameters: ").append(toIndentedString(stripSiteSearchQueryParameters)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    webPropertyId: ").append(toIndentedString(webPropertyId)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("botFilteringEnabled");
    openapiFields.add("childLink");
    openapiFields.add("created");
    openapiFields.add("currency");
    openapiFields.add("defaultPage");
    openapiFields.add("eCommerceTracking");
    openapiFields.add("enhancedECommerceTracking");
    openapiFields.add("excludeQueryParameters");
    openapiFields.add("id");
    openapiFields.add("internalWebPropertyId");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("parentLink");
    openapiFields.add("permissions");
    openapiFields.add("selfLink");
    openapiFields.add("siteSearchCategoryParameters");
    openapiFields.add("siteSearchQueryParameters");
    openapiFields.add("starred");
    openapiFields.add("stripSiteSearchCategoryParameters");
    openapiFields.add("stripSiteSearchQueryParameters");
    openapiFields.add("timezone");
    openapiFields.add("type");
    openapiFields.add("updated");
    openapiFields.add("webPropertyId");
    openapiFields.add("websiteUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Profile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Profile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Profile is not found in the empty JSON string", Profile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Profile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Profile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // validate the optional field `childLink`
      if (jsonObj.get("childLink") != null && !jsonObj.get("childLink").isJsonNull()) {
        ProfileChildLink.validateJsonElement(jsonObj.get("childLink"));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("defaultPage") != null && !jsonObj.get("defaultPage").isJsonNull()) && !jsonObj.get("defaultPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultPage").toString()));
      }
      if ((jsonObj.get("excludeQueryParameters") != null && !jsonObj.get("excludeQueryParameters").isJsonNull()) && !jsonObj.get("excludeQueryParameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeQueryParameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excludeQueryParameters").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("internalWebPropertyId") != null && !jsonObj.get("internalWebPropertyId").isJsonNull()) && !jsonObj.get("internalWebPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalWebPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalWebPropertyId").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `parentLink`
      if (jsonObj.get("parentLink") != null && !jsonObj.get("parentLink").isJsonNull()) {
        ProfileParentLink.validateJsonElement(jsonObj.get("parentLink"));
      }
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        ProfilePermissions.validateJsonElement(jsonObj.get("permissions"));
      }
      if ((jsonObj.get("selfLink") != null && !jsonObj.get("selfLink").isJsonNull()) && !jsonObj.get("selfLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selfLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selfLink").toString()));
      }
      if ((jsonObj.get("siteSearchCategoryParameters") != null && !jsonObj.get("siteSearchCategoryParameters").isJsonNull()) && !jsonObj.get("siteSearchCategoryParameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteSearchCategoryParameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteSearchCategoryParameters").toString()));
      }
      if ((jsonObj.get("siteSearchQueryParameters") != null && !jsonObj.get("siteSearchQueryParameters").isJsonNull()) && !jsonObj.get("siteSearchQueryParameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteSearchQueryParameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteSearchQueryParameters").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("webPropertyId") != null && !jsonObj.get("webPropertyId").isJsonNull()) && !jsonObj.get("webPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webPropertyId").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Profile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Profile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Profile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Profile.class));

       return (TypeAdapter<T>) new TypeAdapter<Profile>() {
           @Override
           public void write(JsonWriter out, Profile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Profile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Profile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Profile
   * @throws IOException if the JSON string is invalid with respect to Profile
   */
  public static Profile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Profile.class);
  }

  /**
   * Convert an instance of Profile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

