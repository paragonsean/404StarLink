/*
 * Maps
 * The Maps API web services suite offers the following APIs:   - Raster   The Maps Raster API renders map data that is divided into gridded sections called tiles. Tiles are square images (png or jpg format) in various sizes which are available at 19 different zoom levels, ranging from 0 to 20. For zoom level 0, the entire earth is displayed on one single tile, while at zoom level 20, the world is divided into 2<sup>40</sup> tiles.   - Vector   Similar to Maps Raster API, the Maps Vector API serves data on different zoom level ranging from 0 to 22. For zoom level 0, the entire earth is displayed on one single tile, while at zoom level 22, the world is divided into 2<sup>44</sup> tiles.   The Maps Vector Service delivers geographic map data packaged in a vector representation of squared sections called vector tiles. Each tile includes pre-defined collections of map features (points, lines, road shapes, water polygons, building footprints, ect.) delivered in one of the specified vector formats. Format of the tile is formally described using protobuf schema.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 */
public class ApiResponse<T> {
    final private int statusCode;
    final private Map<String, List<String>> headers;
    final private T data;

    /**
     * <p>Constructor for ApiResponse.</p>
     *
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     */
    public ApiResponse(int statusCode, Map<String, List<String>> headers) {
        this(statusCode, headers, null);
    }

    /**
     * <p>Constructor for ApiResponse.</p>
     *
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     * @param data The object deserialized from response bod
     */
    public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.data = data;
    }

    /**
     * <p>Get the <code>status code</code>.</p>
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * <p>Get the <code>headers</code>.</p>
     *
     * @return a {@link java.util.Map} of headers 
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    /**
     * <p>Get the <code>data</code>.</p>
     *
     * @return the data
     */
    public T getData() {
        return data;
    }
}
