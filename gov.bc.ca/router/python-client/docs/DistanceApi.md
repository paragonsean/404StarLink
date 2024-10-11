# openapi_client.DistanceApi

All URIs are relative to *https://router.api.gov.bc.ca*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distance_between_pairs_output_format_get**](DistanceApi.md#distance_between_pairs_output_format_get) | **GET** /distance/betweenPairs.{outputFormat} | Get distance and travel time between each pair of geographic points
[**distance_between_pairs_output_format_post**](DistanceApi.md#distance_between_pairs_output_format_post) | **POST** /distance/betweenPairs.{outputFormat} | Get distance and travel time between each pair of geographic points
[**distance_output_format_get**](DistanceApi.md#distance_output_format_get) | **GET** /distance.{outputFormat} | Get distance and travel time between two geographic points
[**distance_output_format_post**](DistanceApi.md#distance_output_format_post) | **POST** /distance.{outputFormat} | Get distance and travel time between two geographic points
[**truck_distance_between_pairs_output_format_get**](DistanceApi.md#truck_distance_between_pairs_output_format_get) | **GET** /truck/distance/betweenPairs.{outputFormat} | Get distance and travel time between each pair of geographic points for a commercial vehicle
[**truck_distance_between_pairs_output_format_post**](DistanceApi.md#truck_distance_between_pairs_output_format_post) | **POST** /truck/distance/betweenPairs.{outputFormat} | Get distance and travel time between each pair of geographic points
[**truck_distance_output_format_get**](DistanceApi.md#truck_distance_output_format_get) | **GET** /truck/distance.{outputFormat} | Get distance and travel time between two geographic points for a commercial vehicle
[**truck_distance_output_format_post**](DistanceApi.md#truck_distance_output_format_post) | **POST** /truck/distance.{outputFormat} | Get distance and travel time between two geographic points


# **distance_between_pairs_output_format_get**
> distance_between_pairs_output_format_get(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)

Get distance and travel time between each pair of geographic points

Represents the distance and time of the shortest or fastest paths between all pairs of fromPoints and toPoints. The number of fromPoints times the number of toPoints should not exceed 100 or the request will time out.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    from_points = '-123.70794,48.77869,-123.53785,48.38200' # str | A comma-separated list of origin points.  See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target='_blank'>fromPoints</a>
    to_points = '-124.972951,49.715181,-123.139464,49.704015' # str | A comma-separated list of destination points. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target='_blank'>toPoints</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')
    max_pairs = 56 # int | The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs=1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs=3 means return the 3 nearest toPoints to each fromPoint. (optional)

    try:
        # Get distance and travel time between each pair of geographic points
        api_instance.distance_between_pairs_output_format_get(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)
    except Exception as e:
        print("Exception when calling DistanceApi->distance_between_pairs_output_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **from_points** | **str**| A comma-separated list of origin points.  See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target&#x3D;&#39;_blank&#39;&gt;fromPoints&lt;/a&gt; | 
 **to_points** | **str**| A comma-separated list of destination points. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target&#x3D;&#39;_blank&#39;&gt;toPoints&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]
 **max_pairs** | **int**| The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs&#x3D;1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs&#x3D;3 means return the 3 nearest toPoints to each fromPoint. | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of routes and their route distances/times. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **distance_between_pairs_output_format_post**
> distance_between_pairs_output_format_post(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)

Get distance and travel time between each pair of geographic points

Represents the distance and time of the shortest or fastest paths between all pairs of fromPoints and toPoints. The number of fromPoints times the number of toPoints should not exceed 100 or the request will time out.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    from_points = '-123.70794,48.77869,-123.53785,48.38200' # str | A comma-separated list of origin points.  See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target='_blank'>fromPoints</a>
    to_points = '-124.972951,49.715181,-123.139464,49.704015' # str | A comma-separated list of destination points. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target='_blank'>toPoints</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')
    max_pairs = 56 # int | The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs=1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs=3 means return the 3 nearest toPoints to each fromPoint. (optional)

    try:
        # Get distance and travel time between each pair of geographic points
        api_instance.distance_between_pairs_output_format_post(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)
    except Exception as e:
        print("Exception when calling DistanceApi->distance_between_pairs_output_format_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **from_points** | **str**| A comma-separated list of origin points.  See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target&#x3D;&#39;_blank&#39;&gt;fromPoints&lt;/a&gt; | 
 **to_points** | **str**| A comma-separated list of destination points. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target&#x3D;&#39;_blank&#39;&gt;toPoints&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]
 **max_pairs** | **int**| The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs&#x3D;1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs&#x3D;3 means return the 3 nearest toPoints to each fromPoint. | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of routes and their route distances/times. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **distance_output_format_get**
> distance_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get distance and travel time between two geographic points

Represents the distance and time of the shortest or fastest path between given start and end points.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get distance and travel time between two geographic points
        api_instance.distance_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DistanceApi->distance_output_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **points** | **str**| A list of any number of route points in start to end order. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target&#x3D;&#39;_blank&#39;&gt;points&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **round_trip** | **bool**| If true, route ends at start point. Default is false. | [optional] [default to False]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Distance and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **distance_output_format_post**
> distance_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get distance and travel time between two geographic points

Represents the distance and time of the shortest or fastest path between given start and end points.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get distance and travel time between two geographic points
        api_instance.distance_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DistanceApi->distance_output_format_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **points** | **str**| A list of any number of route points in start to end order. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target&#x3D;&#39;_blank&#39;&gt;points&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **round_trip** | **bool**| If true, route ends at start point. Default is false. | [optional] [default to False]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Distance and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_distance_between_pairs_output_format_get**
> truck_distance_between_pairs_output_format_get(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)

Get distance and travel time between each pair of geographic points for a commercial vehicle

Represents the distance and time of the shortest or fastest paths between all pairs of fromPoints and toPoints for a commercial vehicle. The number of fromPoints times the number of toPoints should not exceed 100 or the request will time out.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    from_points = '-123.70794,48.77869,-123.53785,48.38200' # str | A comma-separated list of origin points.  See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target='_blank'>fromPoints</a>
    to_points = '-124.972951,49.715181,-123.139464,49.704015' # str | A comma-separated list of destination points. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target='_blank'>toPoints</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')
    max_pairs = 56 # int | The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs=1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs=3 means return the 3 nearest toPoints to each fromPoint. (optional)

    try:
        # Get distance and travel time between each pair of geographic points for a commercial vehicle
        api_instance.truck_distance_between_pairs_output_format_get(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)
    except Exception as e:
        print("Exception when calling DistanceApi->truck_distance_between_pairs_output_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **from_points** | **str**| A comma-separated list of origin points.  See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target&#x3D;&#39;_blank&#39;&gt;fromPoints&lt;/a&gt; | 
 **to_points** | **str**| A comma-separated list of destination points. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target&#x3D;&#39;_blank&#39;&gt;toPoints&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]
 **max_pairs** | **int**| The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs&#x3D;1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs&#x3D;3 means return the 3 nearest toPoints to each fromPoint. | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of routes and their route distances/times. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_distance_between_pairs_output_format_post**
> truck_distance_between_pairs_output_format_post(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)

Get distance and travel time between each pair of geographic points

Represents the distance and time of the shortest or fastest paths between all pairs of fromPoints and toPoints. The number of fromPoints times the number of toPoints should not exceed 100 or the request will time out.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    from_points = '-123.70794,48.77869,-123.53785,48.38200' # str | A comma-separated list of origin points.  See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target='_blank'>fromPoints</a>
    to_points = '-124.972951,49.715181,-123.139464,49.704015' # str | A comma-separated list of destination points. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target='_blank'>toPoints</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')
    max_pairs = 56 # int | The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs=1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs=3 means return the 3 nearest toPoints to each fromPoint. (optional)

    try:
        # Get distance and travel time between each pair of geographic points
        api_instance.truck_distance_between_pairs_output_format_post(output_format, from_points, to_points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description, max_pairs=max_pairs)
    except Exception as e:
        print("Exception when calling DistanceApi->truck_distance_between_pairs_output_format_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **from_points** | **str**| A comma-separated list of origin points.  See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#fromPoints target&#x3D;&#39;_blank&#39;&gt;fromPoints&lt;/a&gt; | 
 **to_points** | **str**| A comma-separated list of destination points. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#toPoints target&#x3D;&#39;_blank&#39;&gt;toPoints&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]
 **max_pairs** | **int**| The maximum number of pairs to return for each toPoint.  Pairs are ordered by distance/time from fromPoint. For example, given 1 fromPoint, and 10 toPoints, and maxPairs&#x3D;1 , return the nearest toPoint to the fromPoint. Given 3 fromPoints and 10 toPoints, maxPairs&#x3D;3 means return the 3 nearest toPoints to each fromPoint. | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of routes and their route distances/times. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_distance_output_format_get**
> truck_distance_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, disable=disable, route_description=route_description)

Get distance and travel time between two geographic points for a commercial vehicle

Represents the distance and time of the shortest or fastest path between given start and end points.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    truck_route_multiplier = 9 # int | The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. (optional) (default to 9)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get distance and travel time between two geographic points for a commercial vehicle
        api_instance.truck_distance_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DistanceApi->truck_distance_output_format_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **points** | **str**| A list of any number of route points in start to end order. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target&#x3D;&#39;_blank&#39;&gt;points&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **round_trip** | **bool**| If true, route ends at start point. Default is false. | [optional] [default to False]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **truck_route_multiplier** | **int**| The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. | [optional] [default to 9]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Distance and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_distance_output_format_post**
> truck_distance_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get distance and travel time between two geographic points

Represents the distance and time of the shortest or fastest path between given start and end points.

### Example

* Api Key Authentication (apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://router.api.gov.bc.ca
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://router.api.gov.bc.ca"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DistanceApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get distance and travel time between two geographic points
        api_instance.truck_distance_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DistanceApi->truck_distance_output_format_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **output_format** | **str**| Format of representation | [default to json]
 **points** | **str**| A list of any number of route points in start to end order. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target&#x3D;&#39;_blank&#39;&gt;points&lt;/a&gt; | 
 **output_srs** | **int**| The EPSG code of the spatial reference system (SRS) to use for output geometries. See &lt;a href&#x3D;https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target&#x3D;\&quot;_blank\&quot;&gt;outputSRS&lt;/a&gt; | [optional] [default to 4326]
 **criteria** | **str**| Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. | [optional] [default to shortest]
 **distance_unit** | **str**| distance unit of measure (e.g., km, mi). Default is km. | [optional] [default to km]
 **round_trip** | **bool**| If true, route ends at start point. Default is false. | [optional] [default to False]
 **departure** | **datetime**| departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);&lt;br&gt; Ignored if time-dependency modules are disabled | [optional] 
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start and end points.Default is false. | [optional] [default to False]
 **disable** | **str**| A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).&lt;br&gt;&lt;br&gt;Module names include:&lt;br&gt; sc – ferry schedules; disabled by default; disabled by default and only suitable for demos&lt;br&gt;tf – historic traffic congestion; disabled by default and only suitable for demos&lt;br&gt;ev – road events; disabled by default and only suitable for demos&lt;br&gt;td – time-dependency; disabling this disables sc, tf, and ev modules&lt;br&gt;tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored&lt;br&gt;tc - turn costs (e.g., left turns take longer than right turns) | [optional] [default to &#39;sc,tf,ev,td&#39;]
 **route_description** | **str**| Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) | [optional] [default to &#39;Routing results&#39;]

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Distance and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

