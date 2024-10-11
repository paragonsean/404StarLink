# openapi_client.CopyrightsApi

All URIs are relative to *https://api.tomtom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**map_version_number_copyrights_caption_format_get**](CopyrightsApi.md#map_version_number_copyrights_caption_format_get) | **GET** /map/{versionNumber}/copyrights/caption.{format} | Captions
[**map_version_number_copyrights_format_get**](CopyrightsApi.md#map_version_number_copyrights_format_get) | **GET** /map/{versionNumber}/copyrights.{format} | Copyrights whole world
[**map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get**](CopyrightsApi.md#map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get) | **GET** /map/{versionNumber}/copyrights/{minLon}/{minLat}/{maxLon}/{maxLat}.{format} | Copyrights bounding box
[**map_version_number_copyrights_zoom_xy_format_get**](CopyrightsApi.md#map_version_number_copyrights_zoom_xy_format_get) | **GET** /map/{versionNumber}/copyrights/{zoom}/{X}/{Y}.{format} | Copyrights tile


# **map_version_number_copyrights_caption_format_get**
> map_version_number_copyrights_caption_format_get(version_number, format, param_callback=param_callback)

Captions

This API returns copyright captions for the map service.

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
    api_instance = openapi_client.CopyrightsApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1.
    format = xml # str | Format of the response (default to xml)
    param_callback = 'param_callback_example' # str | Specifies the jsonp callback method. Only used when format is jsonp (optional)

    try:
        # Captions
        api_instance.map_version_number_copyrights_caption_format_get(version_number, format, param_callback=param_callback)
    except Exception as e:
        print("Exception when calling CopyrightsApi->map_version_number_copyrights_caption_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1. | 
 **format** | **str**| Format of the response | [default to xml]
 **param_callback** | **str**| Specifies the jsonp callback method. Only used when format is jsonp | [optional] 

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
**304** | &lt;b&gt;Not Modified&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Malformed request&lt;/b&gt;: malformed syntax. Possible causes include:   - requested syntax is not available |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;: Supplied API key is not valid for this request |  -  |
**410** | &lt;b&gt;Gone&lt;/b&gt;: Request for unsupported format |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Copyrights API service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **map_version_number_copyrights_format_get**
> map_version_number_copyrights_format_get(version_number, format, param_callback=param_callback)

Copyrights whole world

The Copyrights API returns copyright information for the Maps API Raster Tile Service in JSON, JSONP, or XML format. This call returns copyright information for the whole world.

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
    api_instance = openapi_client.CopyrightsApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    format = xml # str | Format of the response (default to xml)
    param_callback = 'param_callback_example' # str | Specifies the jsonp callback method. Only used when format is jsonp (optional)

    try:
        # Copyrights whole world
        api_instance.map_version_number_copyrights_format_get(version_number, format, param_callback=param_callback)
    except Exception as e:
        print("Exception when calling CopyrightsApi->map_version_number_copyrights_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **format** | **str**| Format of the response | [default to xml]
 **param_callback** | **str**| Specifies the jsonp callback method. Only used when format is jsonp | [optional] 

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
**304** | &lt;b&gt;Not Modified&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Malformed request&lt;/b&gt;: malformed syntax. Possible causes include:   - requested syntax is not available |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;: Supplied API key is not valid for this request |  -  |
**410** | &lt;b&gt;Gone&lt;/b&gt;: Request for unsupported format |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Copyrights API service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get**
> map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get(version_number, format, min_lon, min_lat, max_lon, max_lat, param_callback=param_callback)

Copyrights bounding box

The Copyrights API returns copyright information for the Maps API Raster Tile Service in JSON, JSONP, or XML format. This call returns copyright information for a specific bounding box.

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
    api_instance = openapi_client.CopyrightsApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    format = xml # str | Format of the response (default to xml)
    min_lon = -179.1506 # float | Minimum longitude coordinate of bounding box defined in terms of latitude/longitude.
    min_lat = 18.9117 # float | Minimum latitude coordinate of bounding box defined in terms of latitude/longitude.
    max_lon = -66.9406 # float | Maximum longitude coordinate of bounding box defined in terms of latitude/longitude.
    max_lat = 71.441 # float | Maximum latitude coordinate of bounding box defined in terms of latitude/longitude.
    param_callback = 'param_callback_example' # str | Specifies the jsonp callback method. Only used when format is jsonp. (optional)

    try:
        # Copyrights bounding box
        api_instance.map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get(version_number, format, min_lon, min_lat, max_lon, max_lat, param_callback=param_callback)
    except Exception as e:
        print("Exception when calling CopyrightsApi->map_version_number_copyrights_min_lon_min_lat_max_lon_max_lat_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **format** | **str**| Format of the response | [default to xml]
 **min_lon** | **float**| Minimum longitude coordinate of bounding box defined in terms of latitude/longitude. | 
 **min_lat** | **float**| Minimum latitude coordinate of bounding box defined in terms of latitude/longitude. | 
 **max_lon** | **float**| Maximum longitude coordinate of bounding box defined in terms of latitude/longitude. | 
 **max_lat** | **float**| Maximum latitude coordinate of bounding box defined in terms of latitude/longitude. | 
 **param_callback** | **str**| Specifies the jsonp callback method. Only used when format is jsonp. | [optional] 

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
**304** | &lt;b&gt;Not Modified&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Malformed request&lt;/b&gt;: malformed syntax. Possible causes include:   - requested syntax is not available |  -  |
**401** | &lt;b&gt;Bad request&lt;/b&gt;: Parameters out of range. Possible causes include:   - minLon n is out of range [-180,180]: the requested minimum longitude coordinate is out of possible range   - minLat n is out of range [-90,90]: the requested minimum latitude coordinate is out of possible range   - maxLon n is out of range [-180,180]: the requested maximum longitude coordinate is out of possible range   - maxLat n is out of range [-90,90]: the requested minimum latitude coordinate is out of possible range |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;: Supplied API key is not valid for this request |  -  |
**410** | &lt;b&gt;Gone&lt;/b&gt;: Request for unsupported format |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Copyrights API service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **map_version_number_copyrights_zoom_xy_format_get**
> map_version_number_copyrights_zoom_xy_format_get(version_number, format, zoom, x, y, param_callback=param_callback)

Copyrights tile

The Copyrights API returns copyright information for the Maps API Raster Tile Service in JSON, JSONP, or XML format. This call returns copyright information for the a specific map tile.

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
    api_instance = openapi_client.CopyrightsApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    format = xml # str | Format of the response (default to xml)
    zoom = 0 # int | Zoom level of tile to be rendered. Only used for tile-level copyright calls.
    x = 0 # int | X coordinate of the tile on zoom grid. Only used for tile-level copyright calls.
    y = 0 # int | Y coordinate of the tile on zoom grid. Only used for tile-level copyright calls.
    param_callback = 'param_callback_example' # str | Specifies the jsonp callback method. Only used when format is jsonp. (optional)

    try:
        # Copyrights tile
        api_instance.map_version_number_copyrights_zoom_xy_format_get(version_number, format, zoom, x, y, param_callback=param_callback)
    except Exception as e:
        print("Exception when calling CopyrightsApi->map_version_number_copyrights_zoom_xy_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **format** | **str**| Format of the response | [default to xml]
 **zoom** | **int**| Zoom level of tile to be rendered. Only used for tile-level copyright calls. | 
 **x** | **int**| X coordinate of the tile on zoom grid. Only used for tile-level copyright calls. | 
 **y** | **int**| Y coordinate of the tile on zoom grid. Only used for tile-level copyright calls. | 
 **param_callback** | **str**| Specifies the jsonp callback method. Only used when format is jsonp. | [optional] 

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
**304** | &lt;b&gt;Not Modified&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Malformed request&lt;/b&gt;: malformed syntax. Possible causes include:   - requested syntax is not available |  -  |
**401** | &lt;b&gt;Bad request&lt;/b&gt;: Parameters out of range. Possible causes include:   - zoom n is out of range 0 &lt;&#x3D; zoom &lt; 19: the requested zoom level is out of the possible range   - x n is out of range [0,m]: the requested x coordinate is out of the possible range (the value of m will vary depending on zoom level)   - y n is out of range [0,m]: the requested y coordinate is out of the possible range (the value of m will vary depending on zoom level) |  -  |
**403** | &lt;b&gt;Forbidden&lt;/b&gt;: Supplied API key is not valid for this request |  -  |
**410** | &lt;b&gt;Gone&lt;/b&gt;: Request for unsupported format |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom Copyrights API service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

