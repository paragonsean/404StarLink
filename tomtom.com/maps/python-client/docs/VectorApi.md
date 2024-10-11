# openapi_client.VectorApi

All URIs are relative to *https://api.tomtom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**map_version_number_tile_layer_style_zoom_xy_pbf_get**](VectorApi.md#map_version_number_tile_layer_style_zoom_xy_pbf_get) | **GET** /map/{versionNumber}/tile/{layer}/{style}/{zoom}/{X}/{Y}.pbf | Tile


# **map_version_number_tile_layer_style_zoom_xy_pbf_get**
> map_version_number_tile_layer_style_zoom_xy_pbf_get(version_number, layer, style, zoom, x, y, view=view, language=language)

Tile

The Maps API Vector Service delivers vector tiles, which are representations of square sections of map data.

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
    api_instance = openapi_client.VectorApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    layer = 'basic' # str | Layer of tile to be rendered
    style = 'main' # str | Style of tile to be rendered
    zoom = 0 # int | Zoom level of tile to be rendered
    x = 0 # int | x coordinate of tile on zoom grid
    y = 0 # int | y coordinate of tile on zoom grid
    view = 'Unified' # str | Geopolitical view. Determines rendering of disputed areas. See the <a href=\"/maps-api/maps-api-documentation-vector/tile\">documentation</a> for an explanation of how this works in live services. (optional)
    language = 'NGT' # str | Language to be used for labels in the response. The default is NGT: Neutral Ground Truth, which uses each place's local official language and script (where available). See the <a href=\"/maps-api/maps-api-documentation-vector/tile\">documentation</a> for a full list of options. (optional) (default to 'NGT')

    try:
        # Tile
        api_instance.map_version_number_tile_layer_style_zoom_xy_pbf_get(version_number, layer, style, zoom, x, y, view=view, language=language)
    except Exception as e:
        print("Exception when calling VectorApi->map_version_number_tile_layer_style_zoom_xy_pbf_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **layer** | **str**| Layer of tile to be rendered | 
 **style** | **str**| Style of tile to be rendered | 
 **zoom** | **int**| Zoom level of tile to be rendered | 
 **x** | **int**| x coordinate of tile on zoom grid | 
 **y** | **int**| y coordinate of tile on zoom grid | 
 **view** | **str**| Geopolitical view. Determines rendering of disputed areas. See the &lt;a href&#x3D;\&quot;/maps-api/maps-api-documentation-vector/tile\&quot;&gt;documentation&lt;/a&gt; for an explanation of how this works in live services. | [optional] 
 **language** | **str**| Language to be used for labels in the response. The default is NGT: Neutral Ground Truth, which uses each place&#39;s local official language and script (where available). See the &lt;a href&#x3D;\&quot;/maps-api/maps-api-documentation-vector/tile\&quot;&gt;documentation&lt;/a&gt; for a full list of options. | [optional] [default to &#39;NGT&#39;]

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
**400** | &lt;b&gt;Bad request&lt;/b&gt;: Usually the result of malformed syntax:   - the given combination of layer, style, and query parameters is not supported   - zoom n is out of range 0 &lt;&#x3D; zoom &lt;&#x3D; 22: the requested zoom level is out of the possible range   - x n is out of range [0,m]: the requested x coordinate is out of the possible range (the value of m will vary depending on zoom level)   - y n is out of range [0,m]: the requested y coordinate is out of the possible range (the value of m will vary depending on zoom level)   - the requested view is not supported |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;:    - the supplied API key is not valid for this request   - the requested view is not available in your country |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Maps API Vector Tile service |  -  |
**503** | &lt;b&gt;Service currently unavailable&lt;/b&gt;. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

