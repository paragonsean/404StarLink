# openapi_client.RasterApi

All URIs are relative to *https://api.tomtom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**map_version_number_staticimage_get**](RasterApi.md#map_version_number_staticimage_get) | **GET** /map/{versionNumber}/staticimage | Static Image
[**map_version_number_tile_layer_style_zoom_xy_format_get**](RasterApi.md#map_version_number_tile_layer_style_zoom_xy_format_get) | **GET** /map/{versionNumber}/tile/{layer}/{style}/{zoom}/{X}/{Y}.{format} | Tile


# **map_version_number_staticimage_get**
> map_version_number_staticimage_get(version_number, layer=layer, style=style, format=format, zoom=zoom, center=center, width=width, height=height, bbox=bbox, view=view)

Static Image

The Static Image service renders a rectangular raster image in the style, size, and zoom level specified. The image can be requested using either a center point plus width and height or a bounding box.

### Example

* Api Key Authentication (api_key):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.tomtom.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.tomtom.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key
configuration.api_key['api_key'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.RasterApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1.
    layer = basic # str | Layer of image to be rendered. <em>Hybrid</em> and <em>labels</em> are intended for layering with other data and are only available in <em>png</em> format. (optional) (default to basic)
    style = main # str | Map style to be returned (optional) (default to main)
    format = png # str | Image format to be returned (optional) (default to png)
    zoom = 12 # int | Zoom level of map image to be returned. (optional) (default to 12)
    center = '4.899886, 52.379031' # str | Coordinates for the center point of the image. Must be used with the <strong>width</strong> and <strong>height</strong> parameters; cannot be used with <strong>bbox</strong>. Uses EPSG:3857 projection (functionally equivalent to EPSG:900910). (optional)
    width = 512 # int | Width of the resulting image in pixels. Width must be a positive integer between 1 and 8192. (optional) (default to 512)
    height = 512 # int | Height of the resulting image in pixels. Height must be a positive integer between 1 and 8192. (optional) (default to 512)
    bbox = 'bbox_example' # str | Bounding box for the image, using EPSG:3857 projection (functionally equivalent to EPSG:900910). Values <strong>must</strong> be in the order of minLon, minLat, maxLon, maxLat. MaxLat must be greater than minLat. Longitude values can be on both sides of the 180th meridian. Cannot be used with <strong>center</strong>, <strong>width</strong>, or <strong>height</strong> parameters. (optional)
    view = 'Unified' # str | Geopolitical view. Determines rendering of disputed areas. See the <a href=\"/maps-api/maps-api-documentation-raster/raster-tile\">documentation</a> for an explanation of how this works in live services. (optional)

    try:
        # Static Image
        api_instance.map_version_number_staticimage_get(version_number, layer=layer, style=style, format=format, zoom=zoom, center=center, width=width, height=height, bbox=bbox, view=view)
    except Exception as e:
        print("Exception when calling RasterApi->map_version_number_staticimage_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1. | 
 **layer** | **str**| Layer of image to be rendered. &lt;em&gt;Hybrid&lt;/em&gt; and &lt;em&gt;labels&lt;/em&gt; are intended for layering with other data and are only available in &lt;em&gt;png&lt;/em&gt; format. | [optional] [default to basic]
 **style** | **str**| Map style to be returned | [optional] [default to main]
 **format** | **str**| Image format to be returned | [optional] [default to png]
 **zoom** | **int**| Zoom level of map image to be returned. | [optional] [default to 12]
 **center** | **str**| Coordinates for the center point of the image. Must be used with the &lt;strong&gt;width&lt;/strong&gt; and &lt;strong&gt;height&lt;/strong&gt; parameters; cannot be used with &lt;strong&gt;bbox&lt;/strong&gt;. Uses EPSG:3857 projection (functionally equivalent to EPSG:900910). | [optional] 
 **width** | **int**| Width of the resulting image in pixels. Width must be a positive integer between 1 and 8192. | [optional] [default to 512]
 **height** | **int**| Height of the resulting image in pixels. Height must be a positive integer between 1 and 8192. | [optional] [default to 512]
 **bbox** | **str**| Bounding box for the image, using EPSG:3857 projection (functionally equivalent to EPSG:900910). Values &lt;strong&gt;must&lt;/strong&gt; be in the order of minLon, minLat, maxLon, maxLat. MaxLat must be greater than minLat. Longitude values can be on both sides of the 180th meridian. Cannot be used with &lt;strong&gt;center&lt;/strong&gt;, &lt;strong&gt;width&lt;/strong&gt;, or &lt;strong&gt;height&lt;/strong&gt; parameters. | [optional] 
 **view** | **str**| Geopolitical view. Determines rendering of disputed areas. See the &lt;a href&#x3D;\&quot;/maps-api/maps-api-documentation-raster/raster-tile\&quot;&gt;documentation&lt;/a&gt; for an explanation of how this works in live services. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | &lt;b&gt;OK&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Bad Request&lt;/b&gt;: Received by the interface, but there is an error in the request, such as:   - one or more of the required parameters is missing   - unsupported or unrecognized parameter value   - two or more mutually exclusive parameters are used in the same query (e.g. mixing center/width/height and bbox.)   - minimum latitude is greater than maximum latitude in a bbox call   - layer containing alpha channel is requested in format not supporting the alpha channel This code is returned if the required parameters of the request were malformed. A detailed exception explanation is returned in a response in form of Service Exception Report. |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;:   - supplied API key is not valid for the request   - the requested view is not available in the country where the request was sent from |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the Static Map Service. |  -  |
**503** | &lt;b&gt;Service currently unavailable.&lt;/b&gt; |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **map_version_number_tile_layer_style_zoom_xy_format_get**
> map_version_number_tile_layer_style_zoom_xy_format_get(version_number, layer, style, zoom, x, y, format, tile_size=tile_size, view=view)

Tile

The Maps API Raster Service delivers raster tiles, which are representations of square sections of map data.

### Example

* Api Key Authentication (api_key):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.tomtom.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.tomtom.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key
configuration.api_key['api_key'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.RasterApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1.
    layer = 'basic' # str | Layer of tile to be rendered. <em>Hybrid</em> and <em>labels</em> are intended for layering with other data and are only available in <em>png</em> format.
    style = 'main' # str | Style of tile to be rendered
    zoom = 0 # int | Zoom level of tile to be rendered
    x = 0 # int | x coordinate of tile on zoom grid
    y = 0 # int | y coordinate of tile on zoom grid
    format = 'png' # str | Format of the response.
    tile_size = 256 # int | Tile dimensions in pixels. <em>512</em> is only available for the <em>main</em> style and <em>basic</em> or <em>labels</em> layers. (optional) (default to 256)
    view = 'Unified' # str | Geopolitical view. Determines rendering of disputed areas. See the <a href=\"/maps-sdk-web/functional-examples#geopolitical-views\">documentation</a> for an explanation of how this works in live services. (optional)

    try:
        # Tile
        api_instance.map_version_number_tile_layer_style_zoom_xy_format_get(version_number, layer, style, zoom, x, y, format, tile_size=tile_size, view=view)
    except Exception as e:
        print("Exception when calling RasterApi->map_version_number_tile_layer_style_zoom_xy_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1. | 
 **layer** | **str**| Layer of tile to be rendered. &lt;em&gt;Hybrid&lt;/em&gt; and &lt;em&gt;labels&lt;/em&gt; are intended for layering with other data and are only available in &lt;em&gt;png&lt;/em&gt; format. | 
 **style** | **str**| Style of tile to be rendered | 
 **zoom** | **int**| Zoom level of tile to be rendered | 
 **x** | **int**| x coordinate of tile on zoom grid | 
 **y** | **int**| y coordinate of tile on zoom grid | 
 **format** | **str**| Format of the response. | 
 **tile_size** | **int**| Tile dimensions in pixels. &lt;em&gt;512&lt;/em&gt; is only available for the &lt;em&gt;main&lt;/em&gt; style and &lt;em&gt;basic&lt;/em&gt; or &lt;em&gt;labels&lt;/em&gt; layers. | [optional] [default to 256]
 **view** | **str**| Geopolitical view. Determines rendering of disputed areas. See the &lt;a href&#x3D;\&quot;/maps-sdk-web/functional-examples#geopolitical-views\&quot;&gt;documentation&lt;/a&gt; for an explanation of how this works in live services. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | &lt;b&gt;OK&lt;/b&gt; |  -  |
**302** | &lt;b&gt;Found&lt;/b&gt;: URL redirection |  -  |
**400** | &lt;b&gt;Bad request&lt;/b&gt;: Usually the result of malformed syntax:   - the given combination of layer, style, and query parameters is not supported   - zoom n is out of range 0 &lt;&#x3D; zoom &lt; 19: the requested zoom level is out of the possible range   - x n is out of range [0,m]: the requested x coordinate is out of the possible range (the value of m will vary depending on zoom level)   - y n is out of range [0,m]: the requested y coordinate is out of the possible range (the value of m will vary depending on zoom level)   - the requested view is not supported |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;:   - the supplied API key is not valid for this request   - the requested view is not available in the country where the request was sent from |  -  |
**410** | &lt;b&gt;Gone&lt;/b&gt;: Request for unsupported format |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Maps API Raster Tile service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

