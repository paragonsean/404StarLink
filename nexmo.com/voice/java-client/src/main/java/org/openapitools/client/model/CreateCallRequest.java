/*
 * Voice API
 * The Voice API lets you create outbound calls, control in-progress calls and get information about historical calls. More information about the Voice API can be found at <https://developer.nexmo.com/voice/voice-api/overview>.
 *
 * The version of the OpenAPI document: 1.3.10
 * Contact: devrel@vonage.com
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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateCallRequestAnswerUrl;
import org.openapitools.client.model.CreateCallRequestBaseToInner;
import org.openapitools.client.model.CreateCallRequestNcco;
import org.openapitools.client.model.EndpointPhoneFrom;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:03.439896-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateCallRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCallRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCallRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCallRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateCallRequestNcco> adapterCreateCallRequestNcco = gson.getDelegateAdapter(this, TypeToken.get(CreateCallRequestNcco.class));
            final TypeAdapter<CreateCallRequestAnswerUrl> adapterCreateCallRequestAnswerUrl = gson.getDelegateAdapter(this, TypeToken.get(CreateCallRequestAnswerUrl.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateCallRequest>() {
                @Override
                public void write(JsonWriter out, CreateCallRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateCallRequestNcco`
                    if (value.getActualInstance() instanceof CreateCallRequestNcco) {
                        JsonElement element = adapterCreateCallRequestNcco.toJsonTree((CreateCallRequestNcco)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateCallRequestAnswerUrl`
                    if (value.getActualInstance() instanceof CreateCallRequestAnswerUrl) {
                        JsonElement element = adapterCreateCallRequestAnswerUrl.toJsonTree((CreateCallRequestAnswerUrl)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateCallRequestAnswerUrl, CreateCallRequestNcco");
                }

                @Override
                public CreateCallRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateCallRequestNcco
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateCallRequestNcco.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateCallRequestNcco;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateCallRequestNcco'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateCallRequestNcco failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateCallRequestNcco'", e);
                    }
                    // deserialize CreateCallRequestAnswerUrl
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateCallRequestAnswerUrl.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateCallRequestAnswerUrl;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateCallRequestAnswerUrl'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateCallRequestAnswerUrl failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateCallRequestAnswerUrl'", e);
                    }

                    if (match == 1) {
                        CreateCallRequest ret = new CreateCallRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateCallRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateCallRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCallRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateCallRequestNcco", CreateCallRequestNcco.class);
        schemas.put("CreateCallRequestAnswerUrl", CreateCallRequestAnswerUrl.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateCallRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateCallRequestAnswerUrl, CreateCallRequestNcco
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateCallRequestNcco) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateCallRequestAnswerUrl) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateCallRequestAnswerUrl, CreateCallRequestNcco");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateCallRequestAnswerUrl, CreateCallRequestNcco
     *
     * @return The actual instance (CreateCallRequestAnswerUrl, CreateCallRequestNcco)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateCallRequestNcco`. If the actual instance is not `CreateCallRequestNcco`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCallRequestNcco`
     * @throws ClassCastException if the instance is not `CreateCallRequestNcco`
     */
    public CreateCallRequestNcco getCreateCallRequestNcco() throws ClassCastException {
        return (CreateCallRequestNcco)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateCallRequestAnswerUrl`. If the actual instance is not `CreateCallRequestAnswerUrl`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCallRequestAnswerUrl`
     * @throws ClassCastException if the instance is not `CreateCallRequestAnswerUrl`
     */
    public CreateCallRequestAnswerUrl getCreateCallRequestAnswerUrl() throws ClassCastException {
        return (CreateCallRequestAnswerUrl)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateCallRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateCallRequestNcco
        try {
            CreateCallRequestNcco.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateCallRequestNcco failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateCallRequestAnswerUrl
        try {
            CreateCallRequestAnswerUrl.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateCallRequestAnswerUrl failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateCallRequest with oneOf schemas: CreateCallRequestAnswerUrl, CreateCallRequestNcco. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateCallRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateCallRequest
     * @throws IOException if the JSON string is invalid with respect to CreateCallRequest
     */
    public static CreateCallRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateCallRequest.class);
    }

    /**
     * Convert an instance of CreateCallRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

