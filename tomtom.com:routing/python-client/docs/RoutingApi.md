# openapi_client.RoutingApi

All URIs are relative to *https://api.tomtom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routing_version_number_calculate_reachable_range_origin_content_type_get**](RoutingApi.md#routing_version_number_calculate_reachable_range_origin_content_type_get) | **GET** /routing/{versionNumber}/calculateReachableRange/{origin}/{contentType} | Reachable Range
[**routing_version_number_calculate_reachable_range_origin_content_type_post**](RoutingApi.md#routing_version_number_calculate_reachable_range_origin_content_type_post) | **POST** /routing/{versionNumber}/calculateReachableRange/{origin}/{contentType} | Reachable Range
[**routing_version_number_calculate_route_locations_content_type_get**](RoutingApi.md#routing_version_number_calculate_route_locations_content_type_get) | **GET** /routing/{versionNumber}/calculateRoute/{locations}/{contentType} | Calculate Route
[**routing_version_number_calculate_route_locations_content_type_post**](RoutingApi.md#routing_version_number_calculate_route_locations_content_type_post) | **POST** /routing/{versionNumber}/calculateRoute/{locations}/{contentType} | Calculate Route


# **routing_version_number_calculate_reachable_range_origin_content_type_get**
> routing_version_number_calculate_reachable_range_origin_content_type_get(version_number, origin, content_type, fuel_budget_in_liters=fuel_budget_in_liters, energy_budget_ink_wh=energy_budget_ink_wh, time_budget_in_sec=time_budget_in_sec, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm)

Reachable Range

Calculates a set of locations that can be reached from the origin point.

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
    api_instance = openapi_client.RoutingApi(api_client)
    version_number = 56 # int | Service version number. The current value is 1.
    origin = '52.50931,13.42936' # str | Point from which the range calculation should start.
    content_type = xml # str | The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. (default to xml)
    fuel_budget_in_liters = 3.4 # float | Fuel budget in liters. Determines the maximum vehicle range using the specified Combustion Consumption Model. (optional)
    energy_budget_ink_wh = 43 # float | Electric energy budget in kilowatt hours (kWh). Determines the maximum vehicle range using the specified Electric Consumption Model. (optional)
    time_budget_in_sec = 3.4 # float | Time budget in seconds. Determines the maximum vehicle range using the specified driving time. The consumption parameters in the request will only affect eco-routes, and thereby indirectly the driving time. (optional)
    param_callback = 'callback' # str | Specifies the jsonp callback method. (optional) (default to 'callback')
    report = 'report_example' # str | Specifies which data should be reported for diagnosis purposes. (optional)
    depart_at = 'now' # str | The date and time of departure from the origin point. Departure times apart from <i>now</i> must be specified as a dateTime. (optional) (default to 'now')
    arrive_at = 'arrive_at_example' # str | The date and time of arrival at the destination point. It must be specified as a dateTime. (optional)
    route_type = fastest # str | The type of route requested. (optional) (default to fastest)
    traffic = True # bool | Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. (optional) (default to True)
    avoid = 'unpavedRoads' # str | Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools (optional)
    travel_mode = car # str | The mode of travel for the requested route. (optional) (default to car)
    hilliness = normal # str | Degree of hilliness for calculating a thrilling route. (optional) (default to normal)
    windingness = normal # str | Amount that a thrilling route should wind. (optional) (default to normal)
    vehicle_max_speed = 0 # int | Maximum speed of the vehicle in km/hour. (optional) (default to 0)
    vehicle_weight = 0 # int | Weight of the vehicle in kilograms. (optional) (default to 0)
    vehicle_axle_weight = 0 # int | Weight per axle of the vehicle in kg. (optional) (default to 0)
    vehicle_length = 0 # float | Length of the vehicle in meters. (optional) (default to 0)
    vehicle_width = 0 # float | Width of the vehicle in meters. (optional) (default to 0)
    vehicle_height = 0 # float | Height of the vehicle in meters. (optional) (default to 0)
    vehicle_commercial = False # bool | Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. (optional) (default to False)
    vehicle_load_type = 'vehicle_load_type_example' # str | Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - <i>USHazmatClass1</i> Explosives   - <i>USHazmatClass2</i> Compressed gas   - <i>USHazmatClass3</i> Flammable liquids   - <i>USHazmatClass4</i> Flammable solids   - <i>USHazmatClass5</i> Oxidizers   - <i>USHazmatClass6</i> Poisons   - <i>USHazmatClass7</i> Radioactive   - <i>USHazmatClass8</i> Corrosives   - <i>USHazmatClass9</i> Miscellaneous  Use these for routing in all other countries:    - <i>otherHazmatExplosive</i> Explosives   - <i>otherHazmatGeneral</i> Miscellaneous   - <i>otherHazmatHarmfulToWater</i> Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for <b>travelMode</b>=<i>truck</i>. (optional)
    constant_speed_consumption_in_liters_per_hundredkm = 'constant_speed_consumption_in_liters_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    current_fuel_in_liters = 3.4 # float | Specifies the current supply of fuel in liters. (optional)
    auxiliary_power_in_liters_per_hour = 3.4 # float | Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. (optional)
    fuel_energy_density_in_m_joules_per_liter = 3.4 # float | Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). (optional)
    acceleration_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). (optional)
    deceleration_efficiency = 3.4 # float | Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). (optional)
    uphill_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). (optional)
    downhill_efficiency = 3.4 # float | Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). (optional)
    vehicle_engine_type = combustion # str | Engine type of the vehicle. (optional) (default to combustion)
    constant_speed_consumption_ink_wh_per_hundredkm = '50,8.2:130,21.3' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)

    try:
        # Reachable Range
        api_instance.routing_version_number_calculate_reachable_range_origin_content_type_get(version_number, origin, content_type, fuel_budget_in_liters=fuel_budget_in_liters, energy_budget_ink_wh=energy_budget_ink_wh, time_budget_in_sec=time_budget_in_sec, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm)
    except Exception as e:
        print("Exception when calling RoutingApi->routing_version_number_calculate_reachable_range_origin_content_type_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Service version number. The current value is 1. | 
 **origin** | **str**| Point from which the range calculation should start. | 
 **content_type** | **str**| The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. | [default to xml]
 **fuel_budget_in_liters** | **float**| Fuel budget in liters. Determines the maximum vehicle range using the specified Combustion Consumption Model. | [optional] 
 **energy_budget_ink_wh** | **float**| Electric energy budget in kilowatt hours (kWh). Determines the maximum vehicle range using the specified Electric Consumption Model. | [optional] 
 **time_budget_in_sec** | **float**| Time budget in seconds. Determines the maximum vehicle range using the specified driving time. The consumption parameters in the request will only affect eco-routes, and thereby indirectly the driving time. | [optional] 
 **param_callback** | **str**| Specifies the jsonp callback method. | [optional] [default to &#39;callback&#39;]
 **report** | **str**| Specifies which data should be reported for diagnosis purposes. | [optional] 
 **depart_at** | **str**| The date and time of departure from the origin point. Departure times apart from &lt;i&gt;now&lt;/i&gt; must be specified as a dateTime. | [optional] [default to &#39;now&#39;]
 **arrive_at** | **str**| The date and time of arrival at the destination point. It must be specified as a dateTime. | [optional] 
 **route_type** | **str**| The type of route requested. | [optional] [default to fastest]
 **traffic** | **bool**| Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. | [optional] [default to True]
 **avoid** | **str**| Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools | [optional] 
 **travel_mode** | **str**| The mode of travel for the requested route. | [optional] [default to car]
 **hilliness** | **str**| Degree of hilliness for calculating a thrilling route. | [optional] [default to normal]
 **windingness** | **str**| Amount that a thrilling route should wind. | [optional] [default to normal]
 **vehicle_max_speed** | **int**| Maximum speed of the vehicle in km/hour. | [optional] [default to 0]
 **vehicle_weight** | **int**| Weight of the vehicle in kilograms. | [optional] [default to 0]
 **vehicle_axle_weight** | **int**| Weight per axle of the vehicle in kg. | [optional] [default to 0]
 **vehicle_length** | **float**| Length of the vehicle in meters. | [optional] [default to 0]
 **vehicle_width** | **float**| Width of the vehicle in meters. | [optional] [default to 0]
 **vehicle_height** | **float**| Height of the vehicle in meters. | [optional] [default to 0]
 **vehicle_commercial** | **bool**| Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. | [optional] [default to False]
 **vehicle_load_type** | **str**| Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - &lt;i&gt;USHazmatClass1&lt;/i&gt; Explosives   - &lt;i&gt;USHazmatClass2&lt;/i&gt; Compressed gas   - &lt;i&gt;USHazmatClass3&lt;/i&gt; Flammable liquids   - &lt;i&gt;USHazmatClass4&lt;/i&gt; Flammable solids   - &lt;i&gt;USHazmatClass5&lt;/i&gt; Oxidizers   - &lt;i&gt;USHazmatClass6&lt;/i&gt; Poisons   - &lt;i&gt;USHazmatClass7&lt;/i&gt; Radioactive   - &lt;i&gt;USHazmatClass8&lt;/i&gt; Corrosives   - &lt;i&gt;USHazmatClass9&lt;/i&gt; Miscellaneous  Use these for routing in all other countries:    - &lt;i&gt;otherHazmatExplosive&lt;/i&gt; Explosives   - &lt;i&gt;otherHazmatGeneral&lt;/i&gt; Miscellaneous   - &lt;i&gt;otherHazmatHarmfulToWater&lt;/i&gt; Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for &lt;b&gt;travelMode&lt;/b&gt;&#x3D;&lt;i&gt;truck&lt;/i&gt;. | [optional] 
 **constant_speed_consumption_in_liters_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **current_fuel_in_liters** | **float**| Specifies the current supply of fuel in liters. | [optional] 
 **auxiliary_power_in_liters_per_hour** | **float**| Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. | [optional] 
 **fuel_energy_density_in_m_joules_per_liter** | **float**| Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). | [optional] 
 **acceleration_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **deceleration_efficiency** | **float**| Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). | [optional] 
 **uphill_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **downhill_efficiency** | **float**| Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). | [optional] 
 **vehicle_engine_type** | **str**| Engine type of the vehicle. | [optional] [default to combustion]
 **constant_speed_consumption_ink_wh_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 

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
**200** | OK: a range was calculated and the body of the response contains the polygon description and further data. |  -  |
**400** | Bad request: one or more parameters were incorrectly specified or are mutually exclusive, or the origin point specified in the request is not near enough to a road. |  -  |
**403** | Permission, capacity, or authentication issues:   - Forbidden   - Not authorized   - Account inactive   - Account over queries per second limit   - Account over rate limit   - Rate limit exceeded |  -  |
**404** | Not Found: the requested resource could not be found, but it may be available again in the future. |  -  |
**405** | Method Not Allowed: the client used a HTTP method other than GET or POST. |  -  |
**408** | Request timeout. |  -  |
**414** | Requested uri is too long. |  -  |
**500** | An error occurred while processing the request. Please try again later. |  -  |
**502** | Internal network connectivity issue. |  -  |
**503** | Service currently unavailable. |  -  |
**504** | Internal network connectivity issue or a request that has taken too long to complete. |  -  |
**596** | Service not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **routing_version_number_calculate_reachable_range_origin_content_type_post**
> routing_version_number_calculate_reachable_range_origin_content_type_post(version_number, origin, content_type, fuel_budget_in_liters=fuel_budget_in_liters, energy_budget_ink_wh=energy_budget_ink_wh, time_budget_in_sec=time_budget_in_sec, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm, calculate_reachable_range_post_data_parameters=calculate_reachable_range_post_data_parameters)

Reachable Range

Calculates a set of locations that can be reached from the origin point. POST method handles additionally parameters: <em>supportingPoints</em>, <em>allowVignette</em>, <em>avoidVignette</em>, <em>avoidAreas</em>.

### Example

* Api Key Authentication (api_key):

```python
import openapi_client
from openapi_client.models.calculate_reachable_range_post_data_parameters import CalculateReachableRangePostDataParameters
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
    api_instance = openapi_client.RoutingApi(api_client)
    version_number = 56 # int | Service version number. The current value is 1.
    origin = '52.50931,13.42936' # str | Point from which the range calculation should start.
    content_type = xml # str | The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. (default to xml)
    fuel_budget_in_liters = 3.4 # float | Fuel budget in liters. Determines the maximum vehicle range using the specified Combustion Consumption Model. (optional)
    energy_budget_ink_wh = 43 # float | Electric energy budget in kilowatt hours (kWh). Determines the maximum vehicle range using the specified Electric Consumption Model. (optional)
    time_budget_in_sec = 3.4 # float | Time budget in seconds. Determines the maximum vehicle range using the specified driving time. The consumption parameters in the request will only affect eco-routes, and thereby indirectly the driving time. (optional)
    param_callback = 'callback' # str | Specifies the jsonp callback method. (optional) (default to 'callback')
    report = 'report_example' # str | Specifies which data should be reported for diagnosis purposes. (optional)
    depart_at = 'now' # str | The date and time of departure from the origin point. Departure times apart from <i>now</i> must be specified as a dateTime. (optional) (default to 'now')
    arrive_at = 'arrive_at_example' # str | The date and time of arrival at the destination point. It must be specified as a dateTime. (optional)
    route_type = fastest # str | The type of route requested. (optional) (default to fastest)
    traffic = True # bool | Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. (optional) (default to True)
    avoid = 'unpavedRoads' # str | Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools (optional)
    travel_mode = car # str | The mode of travel for the requested route. (optional) (default to car)
    hilliness = normal # str | Degree of hilliness for calculating a thrilling route. (optional) (default to normal)
    windingness = normal # str | Amount that a thrilling route should wind. (optional) (default to normal)
    vehicle_max_speed = 0 # int | Maximum speed of the vehicle in km/hour. (optional) (default to 0)
    vehicle_weight = 0 # int | Weight of the vehicle in kilograms. (optional) (default to 0)
    vehicle_axle_weight = 0 # int | Weight per axle of the vehicle in kg. (optional) (default to 0)
    vehicle_length = 0 # float | Length of the vehicle in meters. (optional) (default to 0)
    vehicle_width = 0 # float | Width of the vehicle in meters. (optional) (default to 0)
    vehicle_height = 0 # float | Height of the vehicle in meters. (optional) (default to 0)
    vehicle_commercial = False # bool | Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. (optional) (default to False)
    vehicle_load_type = 'vehicle_load_type_example' # str | Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - <i>USHazmatClass1</i> Explosives   - <i>USHazmatClass2</i> Compressed gas   - <i>USHazmatClass3</i> Flammable liquids   - <i>USHazmatClass4</i> Flammable solids   - <i>USHazmatClass5</i> Oxidizers   - <i>USHazmatClass6</i> Poisons   - <i>USHazmatClass7</i> Radioactive   - <i>USHazmatClass8</i> Corrosives   - <i>USHazmatClass9</i> Miscellaneous  Use these for routing in all other countries:    - <i>otherHazmatExplosive</i> Explosives   - <i>otherHazmatGeneral</i> Miscellaneous   - <i>otherHazmatHarmfulToWater</i> Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for <b>travelMode</b>=<i>truck</i>. (optional)
    constant_speed_consumption_in_liters_per_hundredkm = 'constant_speed_consumption_in_liters_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    current_fuel_in_liters = 3.4 # float | Specifies the current supply of fuel in liters. (optional)
    auxiliary_power_in_liters_per_hour = 3.4 # float | Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. (optional)
    fuel_energy_density_in_m_joules_per_liter = 3.4 # float | Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). (optional)
    acceleration_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). (optional)
    deceleration_efficiency = 3.4 # float | Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). (optional)
    uphill_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). (optional)
    downhill_efficiency = 3.4 # float | Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). (optional)
    vehicle_engine_type = combustion # str | Engine type of the vehicle. (optional) (default to combustion)
    constant_speed_consumption_ink_wh_per_hundredkm = '50,8.2:130,21.3' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    calculate_reachable_range_post_data_parameters = openapi_client.CalculateReachableRangePostDataParameters() # CalculateReachableRangePostDataParameters |  (optional)

    try:
        # Reachable Range
        api_instance.routing_version_number_calculate_reachable_range_origin_content_type_post(version_number, origin, content_type, fuel_budget_in_liters=fuel_budget_in_liters, energy_budget_ink_wh=energy_budget_ink_wh, time_budget_in_sec=time_budget_in_sec, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm, calculate_reachable_range_post_data_parameters=calculate_reachable_range_post_data_parameters)
    except Exception as e:
        print("Exception when calling RoutingApi->routing_version_number_calculate_reachable_range_origin_content_type_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Service version number. The current value is 1. | 
 **origin** | **str**| Point from which the range calculation should start. | 
 **content_type** | **str**| The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. | [default to xml]
 **fuel_budget_in_liters** | **float**| Fuel budget in liters. Determines the maximum vehicle range using the specified Combustion Consumption Model. | [optional] 
 **energy_budget_ink_wh** | **float**| Electric energy budget in kilowatt hours (kWh). Determines the maximum vehicle range using the specified Electric Consumption Model. | [optional] 
 **time_budget_in_sec** | **float**| Time budget in seconds. Determines the maximum vehicle range using the specified driving time. The consumption parameters in the request will only affect eco-routes, and thereby indirectly the driving time. | [optional] 
 **param_callback** | **str**| Specifies the jsonp callback method. | [optional] [default to &#39;callback&#39;]
 **report** | **str**| Specifies which data should be reported for diagnosis purposes. | [optional] 
 **depart_at** | **str**| The date and time of departure from the origin point. Departure times apart from &lt;i&gt;now&lt;/i&gt; must be specified as a dateTime. | [optional] [default to &#39;now&#39;]
 **arrive_at** | **str**| The date and time of arrival at the destination point. It must be specified as a dateTime. | [optional] 
 **route_type** | **str**| The type of route requested. | [optional] [default to fastest]
 **traffic** | **bool**| Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. | [optional] [default to True]
 **avoid** | **str**| Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools | [optional] 
 **travel_mode** | **str**| The mode of travel for the requested route. | [optional] [default to car]
 **hilliness** | **str**| Degree of hilliness for calculating a thrilling route. | [optional] [default to normal]
 **windingness** | **str**| Amount that a thrilling route should wind. | [optional] [default to normal]
 **vehicle_max_speed** | **int**| Maximum speed of the vehicle in km/hour. | [optional] [default to 0]
 **vehicle_weight** | **int**| Weight of the vehicle in kilograms. | [optional] [default to 0]
 **vehicle_axle_weight** | **int**| Weight per axle of the vehicle in kg. | [optional] [default to 0]
 **vehicle_length** | **float**| Length of the vehicle in meters. | [optional] [default to 0]
 **vehicle_width** | **float**| Width of the vehicle in meters. | [optional] [default to 0]
 **vehicle_height** | **float**| Height of the vehicle in meters. | [optional] [default to 0]
 **vehicle_commercial** | **bool**| Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. | [optional] [default to False]
 **vehicle_load_type** | **str**| Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - &lt;i&gt;USHazmatClass1&lt;/i&gt; Explosives   - &lt;i&gt;USHazmatClass2&lt;/i&gt; Compressed gas   - &lt;i&gt;USHazmatClass3&lt;/i&gt; Flammable liquids   - &lt;i&gt;USHazmatClass4&lt;/i&gt; Flammable solids   - &lt;i&gt;USHazmatClass5&lt;/i&gt; Oxidizers   - &lt;i&gt;USHazmatClass6&lt;/i&gt; Poisons   - &lt;i&gt;USHazmatClass7&lt;/i&gt; Radioactive   - &lt;i&gt;USHazmatClass8&lt;/i&gt; Corrosives   - &lt;i&gt;USHazmatClass9&lt;/i&gt; Miscellaneous  Use these for routing in all other countries:    - &lt;i&gt;otherHazmatExplosive&lt;/i&gt; Explosives   - &lt;i&gt;otherHazmatGeneral&lt;/i&gt; Miscellaneous   - &lt;i&gt;otherHazmatHarmfulToWater&lt;/i&gt; Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for &lt;b&gt;travelMode&lt;/b&gt;&#x3D;&lt;i&gt;truck&lt;/i&gt;. | [optional] 
 **constant_speed_consumption_in_liters_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **current_fuel_in_liters** | **float**| Specifies the current supply of fuel in liters. | [optional] 
 **auxiliary_power_in_liters_per_hour** | **float**| Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. | [optional] 
 **fuel_energy_density_in_m_joules_per_liter** | **float**| Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). | [optional] 
 **acceleration_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **deceleration_efficiency** | **float**| Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). | [optional] 
 **uphill_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **downhill_efficiency** | **float**| Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). | [optional] 
 **vehicle_engine_type** | **str**| Engine type of the vehicle. | [optional] [default to combustion]
 **constant_speed_consumption_ink_wh_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **calculate_reachable_range_post_data_parameters** | [**CalculateReachableRangePostDataParameters**](CalculateReachableRangePostDataParameters.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK: a range was calculated and the body of the response contains the polygon description and further data. |  -  |
**400** | Bad request: one or more parameters were incorrectly specified or are mutually exclusive, or the origin point specified in the request is not near enough to a road. |  -  |
**403** | Permission, capacity, or authentication issues:   - Forbidden   - Not authorized   - Account inactive   - Account over queries per second limit   - Account over rate limit   - Rate limit exceeded |  -  |
**404** | Not Found: the requested resource could not be found, but it may be available again in the future. |  -  |
**405** | Method Not Allowed: the client used a HTTP method other than GET or POST. |  -  |
**408** | Request timeout. |  -  |
**414** | Requested uri is too long. |  -  |
**500** | An error occurred while processing the request. Please try again later. |  -  |
**502** | Internal network connectivity issue. |  -  |
**503** | Service currently unavailable. |  -  |
**504** | Internal network connectivity issue or a request that has taken too long to complete. |  -  |
**596** | Service not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **routing_version_number_calculate_route_locations_content_type_get**
> routing_version_number_calculate_route_locations_content_type_get(version_number, locations, content_type, max_alternatives=max_alternatives, alternative_type=alternative_type, min_deviation_distance=min_deviation_distance, min_deviation_time=min_deviation_time, instructions_type=instructions_type, language=language, compute_best_order=compute_best_order, route_representation=route_representation, compute_travel_time_for=compute_travel_time_for, vehicle_heading=vehicle_heading, section_type=section_type, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm)

Calculate Route

Calculates a route between an origin and a destination.

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
    api_instance = openapi_client.RoutingApi(api_client)
    version_number = 56 # int | Service version number. The current value is 1.
    locations = '52.50931,13.42936:52.50274,13.43872' # str | Locations through which the calculated route must pass.
    content_type = xml # str | The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. (default to xml)
    max_alternatives = 0 # int | Number of alternative routes to be calculated. (optional) (default to 0)
    alternative_type = anyRoute # str | Determines whether the alternative routes to be calculated should be better with respect to the planning criteria provided than the reference route. (optional) (default to anyRoute)
    min_deviation_distance = 0 # int | All alternative routes will follow the reference route for the specified minimum number of meters starting from the origin point. (optional) (default to 0)
    min_deviation_time = 0 # int | All alternative routes will follow the reference route for the specified minimum number of seconds starting from the origin point. (optional) (default to 0)
    instructions_type = 'instructions_type_example' # str | If specified, guidance instructions will be returned (if available). (optional)
    language = 'en-GB' # str | The language parameter determines the language of the guidance messages. (optional) (default to 'en-GB')
    compute_best_order = False # bool | Re-order the route waypoints to reduce the route length. (optional) (default to False)
    route_representation = polyline # str | Specifies the representation of the set of routes provided as a response. (optional) (default to polyline)
    compute_travel_time_for = none # str | Specifies whether to return additional travel times using different types of traffic information (none, historic, live) as well as the default best-estimate travel time. (optional) (default to none)
    vehicle_heading = 56 # int | The directional heading of the vehicle in degrees. Entered in degrees, measured clockwise from north (so north is 0, east is 90, etc.). (optional)
    section_type = 'travelMode' # str | Specifies which section types are explicitly reported in the route response. Can be specified multiple times.   - carTrain, ferry, tunnel or motorway   - pedestrian   - tollRoad   - tollVignette   - country   - travelMode   - traffic (optional) (default to 'travelMode')
    param_callback = 'callback' # str | Specifies the jsonp callback method. (optional) (default to 'callback')
    report = 'report_example' # str | Specifies which data should be reported for diagnosis purposes. (optional)
    depart_at = 'now' # str | The date and time of departure from the origin point. Departure times apart from <i>now</i> must be specified as a dateTime. (optional) (default to 'now')
    arrive_at = 'arrive_at_example' # str | The date and time of arrival at the destination point. It must be specified as a dateTime. (optional)
    route_type = fastest # str | The type of route requested. (optional) (default to fastest)
    traffic = True # bool | Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. (optional) (default to True)
    avoid = 'unpavedRoads' # str | Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools   - alreadyUsedRoads (optional)
    travel_mode = car # str | The mode of travel for the requested route. (optional) (default to car)
    hilliness = normal # str | Degree of hilliness for calculating a thrilling route. (optional) (default to normal)
    windingness = normal # str | Amount that a thrilling route should wind. (optional) (default to normal)
    vehicle_max_speed = 0 # int | Maximum speed of the vehicle in km/hour. (optional) (default to 0)
    vehicle_weight = 0 # int | Weight of the vehicle in kilograms. (optional) (default to 0)
    vehicle_axle_weight = 0 # int | Weight per axle of the vehicle in kg. (optional) (default to 0)
    vehicle_length = 0 # float | Length of the vehicle in meters. (optional) (default to 0)
    vehicle_width = 0 # float | Width of the vehicle in meters. (optional) (default to 0)
    vehicle_height = 0 # float | Height of the vehicle in meters. (optional) (default to 0)
    vehicle_commercial = False # bool | Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. (optional) (default to False)
    vehicle_load_type = 'vehicle_load_type_example' # str | Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - <i>USHazmatClass1</i> Explosives   - <i>USHazmatClass2</i> Compressed gas   - <i>USHazmatClass3</i> Flammable liquids   - <i>USHazmatClass4</i> Flammable solids   - <i>USHazmatClass5</i> Oxidizers   - <i>USHazmatClass6</i> Poisons   - <i>USHazmatClass7</i> Radioactive   - <i>USHazmatClass8</i> Corrosives   - <i>USHazmatClass9</i> Miscellaneous  Use these for routing in all other countries:    - <i>otherHazmatExplosive</i> Explosives   - <i>otherHazmatGeneral</i> Miscellaneous   - <i>otherHazmatHarmfulToWater</i> Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for <b>travelMode</b>=<i>truck</i>. (optional)
    vehicle_engine_type = combustion # str | Engine type of the vehicle. (optional) (default to combustion)
    constant_speed_consumption_in_liters_per_hundredkm = 'constant_speed_consumption_in_liters_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    current_fuel_in_liters = 3.4 # float | Specifies the current supply of fuel in liters. (optional)
    auxiliary_power_in_liters_per_hour = 3.4 # float | Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. (optional)
    fuel_energy_density_in_m_joules_per_liter = 3.4 # float | Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). (optional)
    acceleration_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). (optional)
    deceleration_efficiency = 3.4 # float | Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). (optional)
    uphill_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). (optional)
    downhill_efficiency = 3.4 # float | Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). (optional)
    constant_speed_consumption_ink_wh_per_hundredkm = 'constant_speed_consumption_ink_wh_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)

    try:
        # Calculate Route
        api_instance.routing_version_number_calculate_route_locations_content_type_get(version_number, locations, content_type, max_alternatives=max_alternatives, alternative_type=alternative_type, min_deviation_distance=min_deviation_distance, min_deviation_time=min_deviation_time, instructions_type=instructions_type, language=language, compute_best_order=compute_best_order, route_representation=route_representation, compute_travel_time_for=compute_travel_time_for, vehicle_heading=vehicle_heading, section_type=section_type, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm)
    except Exception as e:
        print("Exception when calling RoutingApi->routing_version_number_calculate_route_locations_content_type_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Service version number. The current value is 1. | 
 **locations** | **str**| Locations through which the calculated route must pass. | 
 **content_type** | **str**| The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. | [default to xml]
 **max_alternatives** | **int**| Number of alternative routes to be calculated. | [optional] [default to 0]
 **alternative_type** | **str**| Determines whether the alternative routes to be calculated should be better with respect to the planning criteria provided than the reference route. | [optional] [default to anyRoute]
 **min_deviation_distance** | **int**| All alternative routes will follow the reference route for the specified minimum number of meters starting from the origin point. | [optional] [default to 0]
 **min_deviation_time** | **int**| All alternative routes will follow the reference route for the specified minimum number of seconds starting from the origin point. | [optional] [default to 0]
 **instructions_type** | **str**| If specified, guidance instructions will be returned (if available). | [optional] 
 **language** | **str**| The language parameter determines the language of the guidance messages. | [optional] [default to &#39;en-GB&#39;]
 **compute_best_order** | **bool**| Re-order the route waypoints to reduce the route length. | [optional] [default to False]
 **route_representation** | **str**| Specifies the representation of the set of routes provided as a response. | [optional] [default to polyline]
 **compute_travel_time_for** | **str**| Specifies whether to return additional travel times using different types of traffic information (none, historic, live) as well as the default best-estimate travel time. | [optional] [default to none]
 **vehicle_heading** | **int**| The directional heading of the vehicle in degrees. Entered in degrees, measured clockwise from north (so north is 0, east is 90, etc.). | [optional] 
 **section_type** | **str**| Specifies which section types are explicitly reported in the route response. Can be specified multiple times.   - carTrain, ferry, tunnel or motorway   - pedestrian   - tollRoad   - tollVignette   - country   - travelMode   - traffic | [optional] [default to &#39;travelMode&#39;]
 **param_callback** | **str**| Specifies the jsonp callback method. | [optional] [default to &#39;callback&#39;]
 **report** | **str**| Specifies which data should be reported for diagnosis purposes. | [optional] 
 **depart_at** | **str**| The date and time of departure from the origin point. Departure times apart from &lt;i&gt;now&lt;/i&gt; must be specified as a dateTime. | [optional] [default to &#39;now&#39;]
 **arrive_at** | **str**| The date and time of arrival at the destination point. It must be specified as a dateTime. | [optional] 
 **route_type** | **str**| The type of route requested. | [optional] [default to fastest]
 **traffic** | **bool**| Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. | [optional] [default to True]
 **avoid** | **str**| Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools   - alreadyUsedRoads | [optional] 
 **travel_mode** | **str**| The mode of travel for the requested route. | [optional] [default to car]
 **hilliness** | **str**| Degree of hilliness for calculating a thrilling route. | [optional] [default to normal]
 **windingness** | **str**| Amount that a thrilling route should wind. | [optional] [default to normal]
 **vehicle_max_speed** | **int**| Maximum speed of the vehicle in km/hour. | [optional] [default to 0]
 **vehicle_weight** | **int**| Weight of the vehicle in kilograms. | [optional] [default to 0]
 **vehicle_axle_weight** | **int**| Weight per axle of the vehicle in kg. | [optional] [default to 0]
 **vehicle_length** | **float**| Length of the vehicle in meters. | [optional] [default to 0]
 **vehicle_width** | **float**| Width of the vehicle in meters. | [optional] [default to 0]
 **vehicle_height** | **float**| Height of the vehicle in meters. | [optional] [default to 0]
 **vehicle_commercial** | **bool**| Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. | [optional] [default to False]
 **vehicle_load_type** | **str**| Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - &lt;i&gt;USHazmatClass1&lt;/i&gt; Explosives   - &lt;i&gt;USHazmatClass2&lt;/i&gt; Compressed gas   - &lt;i&gt;USHazmatClass3&lt;/i&gt; Flammable liquids   - &lt;i&gt;USHazmatClass4&lt;/i&gt; Flammable solids   - &lt;i&gt;USHazmatClass5&lt;/i&gt; Oxidizers   - &lt;i&gt;USHazmatClass6&lt;/i&gt; Poisons   - &lt;i&gt;USHazmatClass7&lt;/i&gt; Radioactive   - &lt;i&gt;USHazmatClass8&lt;/i&gt; Corrosives   - &lt;i&gt;USHazmatClass9&lt;/i&gt; Miscellaneous  Use these for routing in all other countries:    - &lt;i&gt;otherHazmatExplosive&lt;/i&gt; Explosives   - &lt;i&gt;otherHazmatGeneral&lt;/i&gt; Miscellaneous   - &lt;i&gt;otherHazmatHarmfulToWater&lt;/i&gt; Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for &lt;b&gt;travelMode&lt;/b&gt;&#x3D;&lt;i&gt;truck&lt;/i&gt;. | [optional] 
 **vehicle_engine_type** | **str**| Engine type of the vehicle. | [optional] [default to combustion]
 **constant_speed_consumption_in_liters_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **current_fuel_in_liters** | **float**| Specifies the current supply of fuel in liters. | [optional] 
 **auxiliary_power_in_liters_per_hour** | **float**| Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. | [optional] 
 **fuel_energy_density_in_m_joules_per_liter** | **float**| Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). | [optional] 
 **acceleration_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **deceleration_efficiency** | **float**| Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). | [optional] 
 **uphill_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **downhill_efficiency** | **float**| Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). | [optional] 
 **constant_speed_consumption_ink_wh_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 

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
**200** | OK: a route was calculated and the body of the response contains the route description and any other requested data. |  -  |
**400** | Bad request: one or more parameters were incorrectly specified, are mutually exclusive, the points in the request are not connected by the road network or the points in the request are not near enough to a road. |  -  |
**403** | Permission, capacity, or authentication issues:   - Forbidden   - Not authorized   - Account inactive   - Account over queries per second limit   - Account over rate limit   - Rate limit exceeded |  -  |
**404** | Not Found: the requested resource could not be found, but it may be available again in the future. |  -  |
**405** | Method Not Allowed: the client used a HTTP method other than GET or POST. |  -  |
**408** | Request timeout. |  -  |
**414** | Requested uri is too long. |  -  |
**500** | An error occurred while processing the request. Please try again later. |  -  |
**502** | Internal network connectivity issue. |  -  |
**503** | Service currently unavailable. |  -  |
**504** | Internal network connectivity issue or a request that has taken too long to complete. |  -  |
**596** | Service not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **routing_version_number_calculate_route_locations_content_type_post**
> routing_version_number_calculate_route_locations_content_type_post(version_number, locations, content_type, max_alternatives=max_alternatives, alternative_type=alternative_type, min_deviation_distance=min_deviation_distance, min_deviation_time=min_deviation_time, instructions_type=instructions_type, language=language, compute_best_order=compute_best_order, route_representation=route_representation, compute_travel_time_for=compute_travel_time_for, vehicle_heading=vehicle_heading, section_type=section_type, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm, calculate_route_post_data_parameters=calculate_route_post_data_parameters)

Calculate Route

Calculates a route between an origin and a destination. POST method handles additionally parameters: <em>supportingPoints</em>, <em>allowVignette</em>, <em>avoidVignette</em>, <em>avoidAreas</em>.

### Example

* Api Key Authentication (api_key):

```python
import openapi_client
from openapi_client.models.calculate_route_post_data_parameters import CalculateRoutePostDataParameters
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
    api_instance = openapi_client.RoutingApi(api_client)
    version_number = 56 # int | Service version number. The current value is 1.
    locations = '52.50931,13.42936:52.50274,13.43872' # str | Locations through which the calculated route must pass.
    content_type = xml # str | The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. (default to xml)
    max_alternatives = 0 # int | Number of alternative routes to be calculated. (optional) (default to 0)
    alternative_type = anyRoute # str | Determines whether the alternative routes to be calculated should be better with respect to the planning criteria provided than the reference route. (optional) (default to anyRoute)
    min_deviation_distance = 0 # int | All alternative routes will follow the reference route for the specified minimum number of meters starting from the origin point. (optional) (default to 0)
    min_deviation_time = 0 # int | All alternative routes will follow the reference route for the specified minimum number of seconds starting from the origin point. (optional) (default to 0)
    instructions_type = 'instructions_type_example' # str | If specified, guidance instructions will be returned (if available). (optional)
    language = 'en-GB' # str | The language parameter determines the language of the guidance messages. (optional) (default to 'en-GB')
    compute_best_order = False # bool | Re-order the route waypoints to reduce the route length. (optional) (default to False)
    route_representation = polyline # str | Specifies the representation of the set of routes provided as a response. (optional) (default to polyline)
    compute_travel_time_for = none # str | Specifies whether to return additional travel times using different types of traffic information (none, historic, live) as well as the default best-estimate travel time. (optional) (default to none)
    vehicle_heading = 56 # int | The directional heading of the vehicle in degrees. Entered in degrees, measured clockwise from north (so north is 0, east is 90, etc.). (optional)
    section_type = 'travelMode' # str | Specifies which section types are explicitly reported in the route response. Can be specified multiple times.   - carTrain, ferry, tunnel or motorway   - pedestrian   - tollRoad   - tollVignette   - country   - travelMode   - traffic (optional) (default to 'travelMode')
    param_callback = 'callback' # str | Specifies the jsonp callback method. (optional) (default to 'callback')
    report = 'report_example' # str | Specifies which data should be reported for diagnosis purposes. (optional)
    depart_at = 'now' # str | The date and time of departure from the origin point. Departure times apart from <i>now</i> must be specified as a dateTime. (optional) (default to 'now')
    arrive_at = 'arrive_at_example' # str | The date and time of arrival at the destination point. It must be specified as a dateTime. (optional)
    route_type = fastest # str | The type of route requested. (optional) (default to fastest)
    traffic = True # bool | Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. (optional) (default to True)
    avoid = 'unpavedRoads' # str | Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools   - alreadyUsedRoads (optional)
    travel_mode = car # str | The mode of travel for the requested route. (optional) (default to car)
    hilliness = normal # str | Degree of hilliness for calculating a thrilling route. (optional) (default to normal)
    windingness = normal # str | Amount that a thrilling route should wind. (optional) (default to normal)
    vehicle_max_speed = 0 # int | Maximum speed of the vehicle in km/hour. (optional) (default to 0)
    vehicle_weight = 0 # int | Weight of the vehicle in kilograms. (optional) (default to 0)
    vehicle_axle_weight = 0 # int | Weight per axle of the vehicle in kg. (optional) (default to 0)
    vehicle_length = 0 # float | Length of the vehicle in meters. (optional) (default to 0)
    vehicle_width = 0 # float | Width of the vehicle in meters. (optional) (default to 0)
    vehicle_height = 0 # float | Height of the vehicle in meters. (optional) (default to 0)
    vehicle_commercial = False # bool | Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. (optional) (default to False)
    vehicle_load_type = 'vehicle_load_type_example' # str | Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - <i>USHazmatClass1</i> Explosives   - <i>USHazmatClass2</i> Compressed gas   - <i>USHazmatClass3</i> Flammable liquids   - <i>USHazmatClass4</i> Flammable solids   - <i>USHazmatClass5</i> Oxidizers   - <i>USHazmatClass6</i> Poisons   - <i>USHazmatClass7</i> Radioactive   - <i>USHazmatClass8</i> Corrosives   - <i>USHazmatClass9</i> Miscellaneous  Use these for routing in all other countries:    - <i>otherHazmatExplosive</i> Explosives   - <i>otherHazmatGeneral</i> Miscellaneous   - <i>otherHazmatHarmfulToWater</i> Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for <b>travelMode</b>=<i>truck</i>. (optional)
    vehicle_engine_type = combustion # str | Engine type of the vehicle. (optional) (default to combustion)
    constant_speed_consumption_in_liters_per_hundredkm = 'constant_speed_consumption_in_liters_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    current_fuel_in_liters = 3.4 # float | Specifies the current supply of fuel in liters. (optional)
    auxiliary_power_in_liters_per_hour = 3.4 # float | Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. (optional)
    fuel_energy_density_in_m_joules_per_liter = 3.4 # float | Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). (optional)
    acceleration_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). (optional)
    deceleration_efficiency = 3.4 # float | Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). (optional)
    uphill_efficiency = 3.4 # float | Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). (optional)
    downhill_efficiency = 3.4 # float | Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). (optional)
    constant_speed_consumption_ink_wh_per_hundredkm = 'constant_speed_consumption_ink_wh_per_hundredkm_example' # str | Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. (optional)
    calculate_route_post_data_parameters = openapi_client.CalculateRoutePostDataParameters() # CalculateRoutePostDataParameters |  (optional)

    try:
        # Calculate Route
        api_instance.routing_version_number_calculate_route_locations_content_type_post(version_number, locations, content_type, max_alternatives=max_alternatives, alternative_type=alternative_type, min_deviation_distance=min_deviation_distance, min_deviation_time=min_deviation_time, instructions_type=instructions_type, language=language, compute_best_order=compute_best_order, route_representation=route_representation, compute_travel_time_for=compute_travel_time_for, vehicle_heading=vehicle_heading, section_type=section_type, param_callback=param_callback, report=report, depart_at=depart_at, arrive_at=arrive_at, route_type=route_type, traffic=traffic, avoid=avoid, travel_mode=travel_mode, hilliness=hilliness, windingness=windingness, vehicle_max_speed=vehicle_max_speed, vehicle_weight=vehicle_weight, vehicle_axle_weight=vehicle_axle_weight, vehicle_length=vehicle_length, vehicle_width=vehicle_width, vehicle_height=vehicle_height, vehicle_commercial=vehicle_commercial, vehicle_load_type=vehicle_load_type, vehicle_engine_type=vehicle_engine_type, constant_speed_consumption_in_liters_per_hundredkm=constant_speed_consumption_in_liters_per_hundredkm, current_fuel_in_liters=current_fuel_in_liters, auxiliary_power_in_liters_per_hour=auxiliary_power_in_liters_per_hour, fuel_energy_density_in_m_joules_per_liter=fuel_energy_density_in_m_joules_per_liter, acceleration_efficiency=acceleration_efficiency, deceleration_efficiency=deceleration_efficiency, uphill_efficiency=uphill_efficiency, downhill_efficiency=downhill_efficiency, constant_speed_consumption_ink_wh_per_hundredkm=constant_speed_consumption_ink_wh_per_hundredkm, calculate_route_post_data_parameters=calculate_route_post_data_parameters)
    except Exception as e:
        print("Exception when calling RoutingApi->routing_version_number_calculate_route_locations_content_type_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version_number** | **int**| Service version number. The current value is 1. | 
 **locations** | **str**| Locations through which the calculated route must pass. | 
 **content_type** | **str**| The content type of the response structure. If the content type is jsonp, a callback method can be specified in the query parameters. | [default to xml]
 **max_alternatives** | **int**| Number of alternative routes to be calculated. | [optional] [default to 0]
 **alternative_type** | **str**| Determines whether the alternative routes to be calculated should be better with respect to the planning criteria provided than the reference route. | [optional] [default to anyRoute]
 **min_deviation_distance** | **int**| All alternative routes will follow the reference route for the specified minimum number of meters starting from the origin point. | [optional] [default to 0]
 **min_deviation_time** | **int**| All alternative routes will follow the reference route for the specified minimum number of seconds starting from the origin point. | [optional] [default to 0]
 **instructions_type** | **str**| If specified, guidance instructions will be returned (if available). | [optional] 
 **language** | **str**| The language parameter determines the language of the guidance messages. | [optional] [default to &#39;en-GB&#39;]
 **compute_best_order** | **bool**| Re-order the route waypoints to reduce the route length. | [optional] [default to False]
 **route_representation** | **str**| Specifies the representation of the set of routes provided as a response. | [optional] [default to polyline]
 **compute_travel_time_for** | **str**| Specifies whether to return additional travel times using different types of traffic information (none, historic, live) as well as the default best-estimate travel time. | [optional] [default to none]
 **vehicle_heading** | **int**| The directional heading of the vehicle in degrees. Entered in degrees, measured clockwise from north (so north is 0, east is 90, etc.). | [optional] 
 **section_type** | **str**| Specifies which section types are explicitly reported in the route response. Can be specified multiple times.   - carTrain, ferry, tunnel or motorway   - pedestrian   - tollRoad   - tollVignette   - country   - travelMode   - traffic | [optional] [default to &#39;travelMode&#39;]
 **param_callback** | **str**| Specifies the jsonp callback method. | [optional] [default to &#39;callback&#39;]
 **report** | **str**| Specifies which data should be reported for diagnosis purposes. | [optional] 
 **depart_at** | **str**| The date and time of departure from the origin point. Departure times apart from &lt;i&gt;now&lt;/i&gt; must be specified as a dateTime. | [optional] [default to &#39;now&#39;]
 **arrive_at** | **str**| The date and time of arrival at the destination point. It must be specified as a dateTime. | [optional] 
 **route_type** | **str**| The type of route requested. | [optional] [default to fastest]
 **traffic** | **bool**| Determines whether current traffic is used in route calculations. Note that information on historic road speeds is always used. | [optional] [default to True]
 **avoid** | **str**| Specifies whether the routing engine should try to avoid specific types of road segment when calculating the route. Can be specified multiple times. Possible values:   - tollRoads   - motorways   - ferries   - unpavedRoads   - carpools   - alreadyUsedRoads | [optional] 
 **travel_mode** | **str**| The mode of travel for the requested route. | [optional] [default to car]
 **hilliness** | **str**| Degree of hilliness for calculating a thrilling route. | [optional] [default to normal]
 **windingness** | **str**| Amount that a thrilling route should wind. | [optional] [default to normal]
 **vehicle_max_speed** | **int**| Maximum speed of the vehicle in km/hour. | [optional] [default to 0]
 **vehicle_weight** | **int**| Weight of the vehicle in kilograms. | [optional] [default to 0]
 **vehicle_axle_weight** | **int**| Weight per axle of the vehicle in kg. | [optional] [default to 0]
 **vehicle_length** | **float**| Length of the vehicle in meters. | [optional] [default to 0]
 **vehicle_width** | **float**| Width of the vehicle in meters. | [optional] [default to 0]
 **vehicle_height** | **float**| Height of the vehicle in meters. | [optional] [default to 0]
 **vehicle_commercial** | **bool**| Indicates that the vehicle is used for commercial purposes. This means it may not be allowed on certain roads. | [optional] [default to False]
 **vehicle_load_type** | **str**| Indicates what kinds of hazardous materials the vehicle is carrying (if any). This means it may not be allowed on certain roads. Use these for routing in the US:    - &lt;i&gt;USHazmatClass1&lt;/i&gt; Explosives   - &lt;i&gt;USHazmatClass2&lt;/i&gt; Compressed gas   - &lt;i&gt;USHazmatClass3&lt;/i&gt; Flammable liquids   - &lt;i&gt;USHazmatClass4&lt;/i&gt; Flammable solids   - &lt;i&gt;USHazmatClass5&lt;/i&gt; Oxidizers   - &lt;i&gt;USHazmatClass6&lt;/i&gt; Poisons   - &lt;i&gt;USHazmatClass7&lt;/i&gt; Radioactive   - &lt;i&gt;USHazmatClass8&lt;/i&gt; Corrosives   - &lt;i&gt;USHazmatClass9&lt;/i&gt; Miscellaneous  Use these for routing in all other countries:    - &lt;i&gt;otherHazmatExplosive&lt;/i&gt; Explosives   - &lt;i&gt;otherHazmatGeneral&lt;/i&gt; Miscellaneous   - &lt;i&gt;otherHazmatHarmfulToWater&lt;/i&gt; Harmful to water  vehicleLoadType can be specified multiple times. This parameter is currently only considered for &lt;b&gt;travelMode&lt;/b&gt;&#x3D;&lt;i&gt;truck&lt;/i&gt;. | [optional] 
 **vehicle_engine_type** | **str**| Engine type of the vehicle. | [optional] [default to combustion]
 **constant_speed_consumption_in_liters_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **current_fuel_in_liters** | **float**| Specifies the current supply of fuel in liters. | [optional] 
 **auxiliary_power_in_liters_per_hour** | **float**| Specifies the amount of fuel consumed for sustaining auxiliary systems of the vehicle, in liters per hour. | [optional] 
 **fuel_energy_density_in_m_joules_per_liter** | **float**| Specifies the amount of chemical energy stored in one liter of fuel in megajoules (MJ). | [optional] 
 **acceleration_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to kinetic energy when the vehicle accelerates (i.e. KineticEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **deceleration_efficiency** | **float**| Specifies the efficiency of converting kinetic energy to saved (not consumed) fuel when the vehicle decelerates (i.e. ChemicalEnergySaved/KineticEnergyLost). | [optional] 
 **uphill_efficiency** | **float**| Specifies the efficiency of converting chemical energy stored in fuel to potential energy when the vehicle gains elevation (i.e. PotentialEnergyGained/ChemicalEnergyConsumed). | [optional] 
 **downhill_efficiency** | **float**| Specifies the efficiency of converting potential energy to saved (not consumed) fuel when the vehicle loses elevation (i.e. ChemicalEnergySaved/PotentialEnergyLost). | [optional] 
 **constant_speed_consumption_ink_wh_per_hundredkm** | **str**| Specifies the speed-dependent component of consumption. Provided as an unordered list of speed/consumption-rate pairs. | [optional] 
 **calculate_route_post_data_parameters** | [**CalculateRoutePostDataParameters**](CalculateRoutePostDataParameters.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK: a route was calculated and the body of the response contains the route description and any other requested data. |  -  |
**400** | Bad request: one or more parameters were incorrectly specified, are mutually exclusive, the points in the request are not connected by the road network or the points in the request are not near enough to a road. |  -  |
**403** | Permission, capacity, or authentication issues:   - Forbidden   - Not authorized   - Account inactive   - Account over queries per second limit   - Account over rate limit   - Rate limit exceeded |  -  |
**404** | Not Found: the requested resource could not be found, but it may be available again in the future. |  -  |
**405** | Method Not Allowed: the client used a HTTP method other than GET or POST. |  -  |
**408** | Request timeout. |  -  |
**414** | Requested uri is too long. |  -  |
**500** | An error occurred while processing the request. Please try again later. |  -  |
**502** | Internal network connectivity issue. |  -  |
**503** | Service currently unavailable. |  -  |
**504** | Internal network connectivity issue or a request that has taken too long to complete. |  -  |
**596** | Service not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

