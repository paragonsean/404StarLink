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
import java.util.Arrays;
import org.openapitools.client.model.Availability;
import org.openapitools.client.model.Brand;
import org.openapitools.client.model.Broadcast;
import org.openapitools.client.model.Clip;
import org.openapitools.client.model.Contributor;
import org.openapitools.client.model.Episode;
import org.openapitools.client.model.GroupBody;
import org.openapitools.client.model.Image;
import org.openapitools.client.model.Item;
import org.openapitools.client.model.MasterBrand;
import org.openapitools.client.model.Promotion;
import org.openapitools.client.model.Series;
import org.openapitools.client.model.Service;
import org.openapitools.client.model.VersionGroup;
import org.openapitools.client.model.Window;

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
 * Results
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Results {
  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private Availability availability;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private Brand brand;

  public static final String SERIALIZED_NAME_BROADCAST = "broadcast";
  @SerializedName(SERIALIZED_NAME_BROADCAST)
  private Broadcast broadcast;

  public static final String SERIALIZED_NAME_CHAPTER = "chapter";
  @SerializedName(SERIALIZED_NAME_CHAPTER)
  private Item chapter;

  public static final String SERIALIZED_NAME_CLIP = "clip";
  @SerializedName(SERIALIZED_NAME_CLIP)
  private Clip clip;

  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private GroupBody collection;

  public static final String SERIALIZED_NAME_CONTRIBUTOR = "contributor";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTOR)
  private Contributor contributor;

  public static final String SERIALIZED_NAME_EPISODE = "episode";
  @SerializedName(SERIALIZED_NAME_EPISODE)
  private Episode episode;

  public static final String SERIALIZED_NAME_FRANCHISE = "franchise";
  @SerializedName(SERIALIZED_NAME_FRANCHISE)
  private GroupBody franchise;

  public static final String SERIALIZED_NAME_GALLERY = "gallery";
  @SerializedName(SERIALIZED_NAME_GALLERY)
  private GroupBody gallery;

  public static final String SERIALIZED_NAME_HIGHLIGHT = "highlight";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT)
  private Item highlight;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private Image image;

  public static final String SERIALIZED_NAME_MASTER_BRAND = "master_brand";
  @SerializedName(SERIALIZED_NAME_MASTER_BRAND)
  private MasterBrand masterBrand;

  public static final String SERIALIZED_NAME_MORE_THAN = "more_than";
  @SerializedName(SERIALIZED_NAME_MORE_THAN)
  private Integer moreThan;

  public static final String SERIALIZED_NAME_MUSIC = "music";
  @SerializedName(SERIALIZED_NAME_MUSIC)
  private Item music;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Item other;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PROMOTION = "promotion";
  @SerializedName(SERIALIZED_NAME_PROMOTION)
  private Promotion promotion;

  public static final String SERIALIZED_NAME_SEASON = "season";
  @SerializedName(SERIALIZED_NAME_SEASON)
  private GroupBody season;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private Series series;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private Service service;

  public static final String SERIALIZED_NAME_SPEECH = "speech";
  @SerializedName(SERIALIZED_NAME_SPEECH)
  private Item speech;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_VERSION_GROUP = "version_group";
  @SerializedName(SERIALIZED_NAME_VERSION_GROUP)
  private VersionGroup versionGroup;

  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private Window window;

  public Results() {
  }

  public Results availability(Availability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @javax.annotation.Nullable
  public Availability getAvailability() {
    return availability;
  }

  public void setAvailability(Availability availability) {
    this.availability = availability;
  }


  public Results brand(Brand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  @javax.annotation.Nullable
  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }


  public Results broadcast(Broadcast broadcast) {
    this.broadcast = broadcast;
    return this;
  }

  /**
   * Get broadcast
   * @return broadcast
   */
  @javax.annotation.Nullable
  public Broadcast getBroadcast() {
    return broadcast;
  }

  public void setBroadcast(Broadcast broadcast) {
    this.broadcast = broadcast;
  }


  public Results chapter(Item chapter) {
    this.chapter = chapter;
    return this;
  }

  /**
   * Get chapter
   * @return chapter
   */
  @javax.annotation.Nullable
  public Item getChapter() {
    return chapter;
  }

  public void setChapter(Item chapter) {
    this.chapter = chapter;
  }


  public Results clip(Clip clip) {
    this.clip = clip;
    return this;
  }

  /**
   * Get clip
   * @return clip
   */
  @javax.annotation.Nullable
  public Clip getClip() {
    return clip;
  }

  public void setClip(Clip clip) {
    this.clip = clip;
  }


  public Results collection(GroupBody collection) {
    this.collection = collection;
    return this;
  }

  /**
   * Get collection
   * @return collection
   */
  @javax.annotation.Nullable
  public GroupBody getCollection() {
    return collection;
  }

  public void setCollection(GroupBody collection) {
    this.collection = collection;
  }


  public Results contributor(Contributor contributor) {
    this.contributor = contributor;
    return this;
  }

  /**
   * Get contributor
   * @return contributor
   */
  @javax.annotation.Nullable
  public Contributor getContributor() {
    return contributor;
  }

  public void setContributor(Contributor contributor) {
    this.contributor = contributor;
  }


  public Results episode(Episode episode) {
    this.episode = episode;
    return this;
  }

  /**
   * Get episode
   * @return episode
   */
  @javax.annotation.Nullable
  public Episode getEpisode() {
    return episode;
  }

  public void setEpisode(Episode episode) {
    this.episode = episode;
  }


  public Results franchise(GroupBody franchise) {
    this.franchise = franchise;
    return this;
  }

  /**
   * Get franchise
   * @return franchise
   */
  @javax.annotation.Nullable
  public GroupBody getFranchise() {
    return franchise;
  }

  public void setFranchise(GroupBody franchise) {
    this.franchise = franchise;
  }


  public Results gallery(GroupBody gallery) {
    this.gallery = gallery;
    return this;
  }

  /**
   * Get gallery
   * @return gallery
   */
  @javax.annotation.Nullable
  public GroupBody getGallery() {
    return gallery;
  }

  public void setGallery(GroupBody gallery) {
    this.gallery = gallery;
  }


  public Results highlight(Item highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Get highlight
   * @return highlight
   */
  @javax.annotation.Nullable
  public Item getHighlight() {
    return highlight;
  }

  public void setHighlight(Item highlight) {
    this.highlight = highlight;
  }


  public Results image(Image image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }


  public Results masterBrand(MasterBrand masterBrand) {
    this.masterBrand = masterBrand;
    return this;
  }

  /**
   * Get masterBrand
   * @return masterBrand
   */
  @javax.annotation.Nullable
  public MasterBrand getMasterBrand() {
    return masterBrand;
  }

  public void setMasterBrand(MasterBrand masterBrand) {
    this.masterBrand = masterBrand;
  }


  public Results moreThan(Integer moreThan) {
    this.moreThan = moreThan;
    return this;
  }

  /**
   * Get moreThan
   * @return moreThan
   */
  @javax.annotation.Nullable
  public Integer getMoreThan() {
    return moreThan;
  }

  public void setMoreThan(Integer moreThan) {
    this.moreThan = moreThan;
  }


  public Results music(Item music) {
    this.music = music;
    return this;
  }

  /**
   * Get music
   * @return music
   */
  @javax.annotation.Nullable
  public Item getMusic() {
    return music;
  }

  public void setMusic(Item music) {
    this.music = music;
  }


  public Results other(Item other) {
    this.other = other;
    return this;
  }

  /**
   * Get other
   * @return other
   */
  @javax.annotation.Nullable
  public Item getOther() {
    return other;
  }

  public void setOther(Item other) {
    this.other = other;
  }


  public Results page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public Results pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public Results promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }

  /**
   * Get promotion
   * @return promotion
   */
  @javax.annotation.Nullable
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }


  public Results season(GroupBody season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  @javax.annotation.Nullable
  public GroupBody getSeason() {
    return season;
  }

  public void setSeason(GroupBody season) {
    this.season = season;
  }


  public Results series(Series series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @javax.annotation.Nullable
  public Series getSeries() {
    return series;
  }

  public void setSeries(Series series) {
    this.series = series;
  }


  public Results service(Service service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @javax.annotation.Nullable
  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }


  public Results speech(Item speech) {
    this.speech = speech;
    return this;
  }

  /**
   * Get speech
   * @return speech
   */
  @javax.annotation.Nullable
  public Item getSpeech() {
    return speech;
  }

  public void setSpeech(Item speech) {
    this.speech = speech;
  }


  public Results total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public Results versionGroup(VersionGroup versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * Get versionGroup
   * @return versionGroup
   */
  @javax.annotation.Nullable
  public VersionGroup getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroup versionGroup) {
    this.versionGroup = versionGroup;
  }


  public Results window(Window window) {
    this.window = window;
    return this;
  }

  /**
   * Get window
   * @return window
   */
  @javax.annotation.Nullable
  public Window getWindow() {
    return window;
  }

  public void setWindow(Window window) {
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
    Results results = (Results) o;
    return Objects.equals(this.availability, results.availability) &&
        Objects.equals(this.brand, results.brand) &&
        Objects.equals(this.broadcast, results.broadcast) &&
        Objects.equals(this.chapter, results.chapter) &&
        Objects.equals(this.clip, results.clip) &&
        Objects.equals(this.collection, results.collection) &&
        Objects.equals(this.contributor, results.contributor) &&
        Objects.equals(this.episode, results.episode) &&
        Objects.equals(this.franchise, results.franchise) &&
        Objects.equals(this.gallery, results.gallery) &&
        Objects.equals(this.highlight, results.highlight) &&
        Objects.equals(this.image, results.image) &&
        Objects.equals(this.masterBrand, results.masterBrand) &&
        Objects.equals(this.moreThan, results.moreThan) &&
        Objects.equals(this.music, results.music) &&
        Objects.equals(this.other, results.other) &&
        Objects.equals(this.page, results.page) &&
        Objects.equals(this.pageSize, results.pageSize) &&
        Objects.equals(this.promotion, results.promotion) &&
        Objects.equals(this.season, results.season) &&
        Objects.equals(this.series, results.series) &&
        Objects.equals(this.service, results.service) &&
        Objects.equals(this.speech, results.speech) &&
        Objects.equals(this.total, results.total) &&
        Objects.equals(this.versionGroup, results.versionGroup) &&
        Objects.equals(this.window, results.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, brand, broadcast, chapter, clip, collection, contributor, episode, franchise, gallery, highlight, image, masterBrand, moreThan, music, other, page, pageSize, promotion, season, series, service, speech, total, versionGroup, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Results {\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
    sb.append("    chapter: ").append(toIndentedString(chapter)).append("\n");
    sb.append("    clip: ").append(toIndentedString(clip)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    contributor: ").append(toIndentedString(contributor)).append("\n");
    sb.append("    episode: ").append(toIndentedString(episode)).append("\n");
    sb.append("    franchise: ").append(toIndentedString(franchise)).append("\n");
    sb.append("    gallery: ").append(toIndentedString(gallery)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    masterBrand: ").append(toIndentedString(masterBrand)).append("\n");
    sb.append("    moreThan: ").append(toIndentedString(moreThan)).append("\n");
    sb.append("    music: ").append(toIndentedString(music)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    speech: ").append(toIndentedString(speech)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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
    openapiFields.add("availability");
    openapiFields.add("brand");
    openapiFields.add("broadcast");
    openapiFields.add("chapter");
    openapiFields.add("clip");
    openapiFields.add("collection");
    openapiFields.add("contributor");
    openapiFields.add("episode");
    openapiFields.add("franchise");
    openapiFields.add("gallery");
    openapiFields.add("highlight");
    openapiFields.add("image");
    openapiFields.add("master_brand");
    openapiFields.add("more_than");
    openapiFields.add("music");
    openapiFields.add("other");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("promotion");
    openapiFields.add("season");
    openapiFields.add("series");
    openapiFields.add("service");
    openapiFields.add("speech");
    openapiFields.add("total");
    openapiFields.add("version_group");
    openapiFields.add("window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Results
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Results.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Results is not found in the empty JSON string", Results.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Results.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Results` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Results.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `availability`
      if (jsonObj.get("availability") != null && !jsonObj.get("availability").isJsonNull()) {
        Availability.validateJsonElement(jsonObj.get("availability"));
      }
      // validate the optional field `brand`
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) {
        Brand.validateJsonElement(jsonObj.get("brand"));
      }
      // validate the optional field `broadcast`
      if (jsonObj.get("broadcast") != null && !jsonObj.get("broadcast").isJsonNull()) {
        Broadcast.validateJsonElement(jsonObj.get("broadcast"));
      }
      // validate the optional field `chapter`
      if (jsonObj.get("chapter") != null && !jsonObj.get("chapter").isJsonNull()) {
        Item.validateJsonElement(jsonObj.get("chapter"));
      }
      // validate the optional field `clip`
      if (jsonObj.get("clip") != null && !jsonObj.get("clip").isJsonNull()) {
        Clip.validateJsonElement(jsonObj.get("clip"));
      }
      // validate the optional field `collection`
      if (jsonObj.get("collection") != null && !jsonObj.get("collection").isJsonNull()) {
        GroupBody.validateJsonElement(jsonObj.get("collection"));
      }
      // validate the optional field `contributor`
      if (jsonObj.get("contributor") != null && !jsonObj.get("contributor").isJsonNull()) {
        Contributor.validateJsonElement(jsonObj.get("contributor"));
      }
      // validate the optional field `episode`
      if (jsonObj.get("episode") != null && !jsonObj.get("episode").isJsonNull()) {
        Episode.validateJsonElement(jsonObj.get("episode"));
      }
      // validate the optional field `franchise`
      if (jsonObj.get("franchise") != null && !jsonObj.get("franchise").isJsonNull()) {
        GroupBody.validateJsonElement(jsonObj.get("franchise"));
      }
      // validate the optional field `gallery`
      if (jsonObj.get("gallery") != null && !jsonObj.get("gallery").isJsonNull()) {
        GroupBody.validateJsonElement(jsonObj.get("gallery"));
      }
      // validate the optional field `highlight`
      if (jsonObj.get("highlight") != null && !jsonObj.get("highlight").isJsonNull()) {
        Item.validateJsonElement(jsonObj.get("highlight"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        Image.validateJsonElement(jsonObj.get("image"));
      }
      // validate the optional field `master_brand`
      if (jsonObj.get("master_brand") != null && !jsonObj.get("master_brand").isJsonNull()) {
        MasterBrand.validateJsonElement(jsonObj.get("master_brand"));
      }
      // validate the optional field `music`
      if (jsonObj.get("music") != null && !jsonObj.get("music").isJsonNull()) {
        Item.validateJsonElement(jsonObj.get("music"));
      }
      // validate the optional field `other`
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonNull()) {
        Item.validateJsonElement(jsonObj.get("other"));
      }
      // validate the optional field `promotion`
      if (jsonObj.get("promotion") != null && !jsonObj.get("promotion").isJsonNull()) {
        Promotion.validateJsonElement(jsonObj.get("promotion"));
      }
      // validate the optional field `season`
      if (jsonObj.get("season") != null && !jsonObj.get("season").isJsonNull()) {
        GroupBody.validateJsonElement(jsonObj.get("season"));
      }
      // validate the optional field `series`
      if (jsonObj.get("series") != null && !jsonObj.get("series").isJsonNull()) {
        Series.validateJsonElement(jsonObj.get("series"));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        Service.validateJsonElement(jsonObj.get("service"));
      }
      // validate the optional field `speech`
      if (jsonObj.get("speech") != null && !jsonObj.get("speech").isJsonNull()) {
        Item.validateJsonElement(jsonObj.get("speech"));
      }
      // validate the optional field `version_group`
      if (jsonObj.get("version_group") != null && !jsonObj.get("version_group").isJsonNull()) {
        VersionGroup.validateJsonElement(jsonObj.get("version_group"));
      }
      // validate the optional field `window`
      if (jsonObj.get("window") != null && !jsonObj.get("window").isJsonNull()) {
        Window.validateJsonElement(jsonObj.get("window"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Results.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Results' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Results> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Results.class));

       return (TypeAdapter<T>) new TypeAdapter<Results>() {
           @Override
           public void write(JsonWriter out, Results value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Results read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Results given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Results
   * @throws IOException if the JSON string is invalid with respect to Results
   */
  public static Results fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Results.class);
  }

  /**
   * Convert an instance of Results to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

