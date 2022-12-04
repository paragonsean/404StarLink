# openapi_client.WMSWMTSApi

All URIs are relative to *https://api.tomtom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_capabilities**](WMSWMTSApi.md#get_capabilities) | **GET** /map/{versionNumber}/wms// | GetCapabilities
[**get_map**](WMSWMTSApi.md#get_map) | **GET** /map/{versionNumber}/wms/ | GetMap
[**map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get**](WMSWMTSApi.md#map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get) | **GET** /map/{versionNumber}/wmts/{key}/{wmtsVersion}/WMTSCapabilities.xml | WMTS


# **get_capabilities**
> get_capabilities(version_number, service, request, version=version)

GetCapabilities

The GetCapabilities call is part of TomTom's implementation of version 1.1.1 the Web Map Service (WMS). It provides descriptions of the other calls that are available in the implementation.

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
    api_instance = openapi_client.WMSWMTSApi(api_client)
    version_number = 56 # int | 
    service = 'service_example' # str | 
    request = 'request_example' # str | 
    version = 'version_example' # str | WMS service version (optional)

    try:
        # GetCapabilities
        api_instance.get_capabilities(version_number, service, request, version=version)
    except Exception as e:
        print("Exception when calling WMSWMTSApi->get_capabilities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**|  | 
 **service** | **str**|  | 
 **request** | **str**|  | 
 **version** | **str**| WMS service version | [optional] 

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
**202** | &lt;b&gt;Accepted&lt;/b&gt;: Received by the interface, but there is a WMS exception in processing it. Possible causes include:   - one or more required parameters is missing   - unsupported or unrecognized parameter value   - malformed bounding box requested   - invalid map dimensions requested                                   This code is returned if the parameters of the request were malformed. The response includes a detailed explanation in the Service Exception Report. |  -  |
**401** | &lt;b&gt;Unauthorized&lt;/b&gt;: Supplied API key is not valid for the request |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom WMS service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_map**
> get_map(version_number, request, srs, bbox, width, height, format, layers, version, styles=styles, service=service)

GetMap

The GetMap call implements the Web Map Service 1.1.1 standard to access TomTom raster map tiles. This service is described in the response to the GetCapabilities API call.

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
    api_instance = openapi_client.WMSWMTSApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    request = 'request_example' # str | Request type
    srs = 'EPSG:4326' # str | Projection used in describing the <b>bbox</b> EPSG:3857 is recommended, particularly at higher zoom levels. (Note that EPSG:3857 is functionally equivalent to EPSG:900913/EPSG:3785)
    bbox = '-0.489,51.28,0.236,51.686' # str | Bounding box in the projection stated in <b>srs</b> (minLon,minLat,maxLon,maxLat)
    width = 512 # int | Width of the resulting image, in pixels Maximum value is 2048
    height = 512 # int | Height of the resulting image, in pixels Maximum value is 2048
    format = 'image/png' # str | Image format to be returned
    layers = 'layers_example' # str | Map layers requested Currently only the basic layer is available
    version = 'version_example' # str | WMS service version
    styles = 'styles_example' # str | Map styles to be returned. Currently, no styles are available. This parameter is present for forward compatibility; it must be used and left blank. (optional)
    service = 'service_example' # str | Service type (optional)

    try:
        # GetMap
        api_instance.get_map(version_number, request, srs, bbox, width, height, format, layers, version, styles=styles, service=service)
    except Exception as e:
        print("Exception when calling WMSWMTSApi->get_map: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **request** | **str**| Request type | 
 **srs** | **str**| Projection used in describing the &lt;b&gt;bbox&lt;/b&gt; EPSG:3857 is recommended, particularly at higher zoom levels. (Note that EPSG:3857 is functionally equivalent to EPSG:900913/EPSG:3785) | 
 **bbox** | **str**| Bounding box in the projection stated in &lt;b&gt;srs&lt;/b&gt; (minLon,minLat,maxLon,maxLat) | 
 **width** | **int**| Width of the resulting image, in pixels Maximum value is 2048 | 
 **height** | **int**| Height of the resulting image, in pixels Maximum value is 2048 | 
 **format** | **str**| Image format to be returned | 
 **layers** | **str**| Map layers requested Currently only the basic layer is available | 
 **version** | **str**| WMS service version | 
 **styles** | **str**| Map styles to be returned. Currently, no styles are available. This parameter is present for forward compatibility; it must be used and left blank. | [optional] 
 **service** | **str**| Service type | [optional] 

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
**202** | &lt;b&gt;Accepted&lt;/b&gt;: Received by the interface, but there is a WMS exception in processing it. Possible causes include:   - one or more required parameters is missing   - unsupported or unrecognized parameter value   - malformed bounding box requested   - invalid map dimensions requested                                   This code is returned if the parameters of the request were malformed. The response includes a detailed explanation in the Service Exception Report. |  -  |
**401** | &lt;b&gt;Unauthorized&lt;/b&gt;: Supplied API key is not valid for the request |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom WMS service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get**
> map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get(version_number, key, wmts_version)

WMTS

The WMTS GetCapabilities call implements version 1.0.0 of the <a href=\"http://www.opengeospatial.org/standards/wmts\">Web Map Tile Service</a> (WMTS) standard. It returns metadata that allows compatible calling systems to construct calls to TomTom's raster map tile service. See the <a href=\"/maps-api/maps-api-documentation-raster/wmts\">documentation</a> for more information on WMTS.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.tomtom.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.tomtom.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.WMSWMTSApi(api_client)
    version_number = 56 # int | Version of the service to call. The current version is 1
    key = 'key_example' # str | Your API key for calling this service.
    wmts_version = 'wmts_version_example' # str | 

    try:
        # WMTS
        api_instance.map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get(version_number, key, wmts_version)
    except Exception as e:
        print("Exception when calling WMSWMTSApi->map_version_number_wmts_key_wmts_version_wmts_capabilities_xml_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Version of the service to call. The current version is 1 | 
 **key** | **str**| Your API key for calling this service. | 
 **wmts_version** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | &lt;b&gt;OK&lt;/b&gt; |  -  |
**400** | &lt;b&gt;Bad request&lt;/b&gt;: Probably malformed syntax |  -  |
**401** | &lt;b&gt;Unauthorized&lt;/b&gt;: Supplied API key is not valid for this request |  -  |
**500** | &lt;b&gt;Internal Server Error&lt;/b&gt;: There is a problem with the TomTom WMTS service |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

