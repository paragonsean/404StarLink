# openapi_client.DirectionsApi

All URIs are relative to *https://router.api.gov.bc.ca*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directions_output_format_get**](DirectionsApi.md#directions_output_format_get) | **GET** /directions.{outputFormat} | Get the directions, path, distance and travel time between a series of geographic points
[**directions_output_format_post**](DirectionsApi.md#directions_output_format_post) | **POST** /directions.{outputFormat} | Get the directions, path, distance and travel time between a series of geographic points
[**optimal_directions_output_format_get**](DirectionsApi.md#optimal_directions_output_format_get) | **GET** /optimalDirections.{outputFormat} | Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time.
[**optimal_directions_output_format_post**](DirectionsApi.md#optimal_directions_output_format_post) | **POST** /optimalDirections.{outputFormat} | Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.
[**truck_directions_output_format_get**](DirectionsApi.md#truck_directions_output_format_get) | **GET** /truck/directions.{outputFormat} | Get the directions, path, distance and travel time between a series of geographic points for a commercial vehicle
[**truck_directions_output_format_post**](DirectionsApi.md#truck_directions_output_format_post) | **POST** /truck/directions.{outputFormat} | Get the directions, path, distance and travel time between a series of geographic points
[**truck_optimal_directions_output_format_get**](DirectionsApi.md#truck_optimal_directions_output_format_get) | **GET** /truck/optimalDirections.{outputFormat} | Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time for a commercial vehicle
[**truck_optimal_directions_output_format_post**](DirectionsApi.md#truck_optimal_directions_output_format_post) | **POST** /truck/optimalDirections.{outputFormat} | Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.


# **directions_output_format_get**
> directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get the directions, path, distance and travel time between a series of geographic points

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between given start and end points

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start/end point.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, path, distance and travel time between a series of geographic points
        api_instance.directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->directions_output_format_get: %s\n" % e)
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
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start/end point.Default is false. | [optional] [default to False]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **directions_output_format_post**
> directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get the directions, path, distance and travel time between a series of geographic points

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between given start and end points

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start/end point.Default is false. (optional) (default to False)
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, path, distance and travel time between a series of geographic points
        api_instance.directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->directions_output_format_post: %s\n" % e)
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
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start/end point.Default is false. | [optional] [default to False]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimal_directions_output_format_get**
> optimal_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time.

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between a start point and a series of end points which are reordered to minimize distance/time

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
    api_instance = openapi_client.DirectionsApi(api_client)
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
        # Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time.
        api_instance.optimal_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->optimal_directions_output_format_get: %s\n" % e)
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route. End points are reordered to minimize total distance or time. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimal_directions_output_format_post**
> optimal_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)

Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between a start point and one or more end points which are reordered to minimize distance or time.

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
    api_instance = openapi_client.DirectionsApi(api_client)
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
        # Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.
        api_instance.optimal_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->optimal_directions_output_format_post: %s\n" % e)
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route. End points are reordered to minimize total distance or time. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_directions_output_format_get**
> truck_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)

Get the directions, path, distance and travel time between a series of geographic points for a commercial vehicle

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between given start and end points for a commercial vehicle

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start/end point.Default is false. (optional) (default to False)
    truck_route_multiplier = 9 # int | The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. (optional) (default to 9)
    partition = '' # str | A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. <br><br>Partition values:<br> isTruckRoute – Distinguish between truck route sections and non-truck route sections <br> isFerry – Distinguish between ferry sections and non-ferry sections <br> locality – Include the locality name for the route partition (optional) (default to '')
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, path, distance and travel time between a series of geographic points for a commercial vehicle
        api_instance.truck_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->truck_directions_output_format_get: %s\n" % e)
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
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start/end point.Default is false. | [optional] [default to False]
 **truck_route_multiplier** | **int**| The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. | [optional] [default to 9]
 **partition** | **str**| A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. &lt;br&gt;&lt;br&gt;Partition values:&lt;br&gt; isTruckRoute – Distinguish between truck route sections and non-truck route sections &lt;br&gt; isFerry – Distinguish between ferry sections and non-ferry sections &lt;br&gt; locality – Include the locality name for the route partition | [optional] [default to &#39;&#39;]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_directions_output_format_post**
> truck_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)

Get the directions, path, distance and travel time between a series of geographic points

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between given start and end points

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start/end point.Default is false. (optional) (default to False)
    truck_route_multiplier = 9 # int | The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. (optional) (default to 9)
    partition = '' # str | A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. <br><br>Partition values:<br> isTruckRoute – Distinguish between truck route sections and non-truck route sections <br> isFerry – Distinguish between ferry sections and non-ferry sections <br> locality – Include the locality name for the route partition (optional) (default to '')
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, path, distance and travel time between a series of geographic points
        api_instance.truck_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->truck_directions_output_format_post: %s\n" % e)
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
 **correct_side** | **bool**| If true, route starts and ends on same side of road as start/end point.Default is false. | [optional] [default to False]
 **truck_route_multiplier** | **int**| The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. | [optional] [default to 9]
 **partition** | **str**| A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. &lt;br&gt;&lt;br&gt;Partition values:&lt;br&gt; isTruckRoute – Distinguish between truck route sections and non-truck route sections &lt;br&gt; isFerry – Distinguish between ferry sections and non-ferry sections &lt;br&gt; locality – Include the locality name for the route partition | [optional] [default to &#39;&#39;]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_optimal_directions_output_format_get**
> truck_optimal_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)

Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time for a commercial vehicle

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between a start point and a series of end points which are reordered to minimize distance/time for a commercial vehicle.

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    truck_route_multiplier = 9 # int | The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. (optional) (default to 9)
    partition = '' # str | A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. <br><br>Partition values:<br> isTruckRoute – Distinguish between truck route sections and non-truck route sections <br> isFerry – Distinguish between ferry sections and non-ferry sections <br> locality – Include the locality name for the route partition (optional) (default to '')
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, optimal path, distance and travel time between a start point and a series of end points which are reordered to minimize total distance or time for a commercial vehicle
        api_instance.truck_optimal_directions_output_format_get(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->truck_optimal_directions_output_format_get: %s\n" % e)
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
 **partition** | **str**| A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. &lt;br&gt;&lt;br&gt;Partition values:&lt;br&gt; isTruckRoute – Distinguish between truck route sections and non-truck route sections &lt;br&gt; isFerry – Distinguish between ferry sections and non-ferry sections &lt;br&gt; locality – Include the locality name for the route partition | [optional] [default to &#39;&#39;]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route. End points are reordered to minimize total distance or time. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truck_optimal_directions_output_format_post**
> truck_optimal_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)

Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.

Represents the turn-by-turn directions, geometry, distance, and time of the shortest path or fastest path between a start point and one or more end points which are reordered to minimize distance or time.

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
    api_instance = openapi_client.DirectionsApi(api_client)
    output_format = json # str | Format of representation (default to json)
    points = '-123.70794,48.77869,-123.53785,48.38200' # str | A list of any number of route points in start to end order. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#points target='_blank'>points</a>
    output_srs = 4326 # int | The EPSG code of the spatial reference system (SRS) to use for output geometries. See <a href=https://github.com/bcgov/ols-router/blob/gh-pages/glossary.md#outputSRS target=\"_blank\">outputSRS</a> (optional) (default to 4326)
    criteria = shortest # str | Routing criteria to optimize (e.g., shortest, fastest). Default is shortest. (optional) (default to shortest)
    distance_unit = km # str | distance unit of measure (e.g., km, mi). Default is km. (optional) (default to km)
    round_trip = False # bool | If true, route ends at start point. Default is false. (optional) (default to False)
    departure = '2013-10-20T19:20:30+01:00' # datetime | departure date and time in internet timestamp notation as defined in RFC 3339, section 5.6 (e.g., 2019-02-28T11:36:00-08:00);<br> Ignored if time-dependency modules are disabled (optional)
    correct_side = False # bool | If true, route starts and ends on same side of road as start and end points.Default is false. (optional) (default to False)
    truck_route_multiplier = 9 # int | The truck route multiplier value is used to multiply the cost of using roads that are not truck routes. (optional) (default to 9)
    partition = '' # str | A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. <br><br>Partition values:<br> isTruckRoute – Distinguish between truck route sections and non-truck route sections <br> isFerry – Distinguish between ferry sections and non-ferry sections <br> locality – Include the locality name for the route partition (optional) (default to '')
    disable = 'sc,tf,ev,td' # str | A comma-separated list of time-related modules to disable (e.g., sc,tf,ev,td).<br><br>Module names include:<br> sc – ferry schedules; disabled by default; disabled by default and only suitable for demos<br>tf – historic traffic congestion; disabled by default and only suitable for demos<br>ev – road events; disabled by default and only suitable for demos<br>td – time-dependency; disabling this disables sc, tf, and ev modules<br>tr – turn restrictions; if td is disabled, time-dependent turn restrictions are ignored<br>tc - turn costs (e.g., left turns take longer than right turns) (optional) (default to 'sc,tf,ev,td')
    route_description = 'Routing results' # str | Route description (e.g., Shortest route from 1002 Johnson St, Victoria to 1105 Royal Ave,New Westminster) (optional) (default to 'Routing results')

    try:
        # Get the directions, optimal path, distance and travel time between a start point and one or more end points which are reordered to minimize total distance or time.
        api_instance.truck_optimal_directions_output_format_post(output_format, points, output_srs=output_srs, criteria=criteria, distance_unit=distance_unit, round_trip=round_trip, departure=departure, correct_side=correct_side, truck_route_multiplier=truck_route_multiplier, partition=partition, disable=disable, route_description=route_description)
    except Exception as e:
        print("Exception when calling DirectionsApi->truck_optimal_directions_output_format_post: %s\n" % e)
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
 **partition** | **str**| A comma-separated list of values to identify sections of the route that correspond to truck route sections and non-truck route sections, ferry sections and non-ferry sections, and locality names.  The response includes a partitions attribute, which is an array of objects, each of which has an index (into the route coordinate array) and a value for each of the attributes requested in the partition parameter. Any or all of the following values can be used. &lt;br&gt;&lt;br&gt;Partition values:&lt;br&gt; isTruckRoute – Distinguish between truck route sections and non-truck route sections &lt;br&gt; isFerry – Distinguish between ferry sections and non-ferry sections &lt;br&gt; locality – Include the locality name for the route partition | [optional] [default to &#39;&#39;]
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
**200** | turn-by-turn directions, geometry, distance, and time of the shortest or fastest route. End points are reordered to minimize total distance or time. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

