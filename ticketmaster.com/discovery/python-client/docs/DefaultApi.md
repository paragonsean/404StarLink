# openapi_client.DefaultApi

All URIs are relative to *http://www.ticketmaster.com/discovery/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discovery_v2_classifications_get**](DefaultApi.md#discovery_v2_classifications_get) | **GET** /discovery/v2/classifications | Classification Search
[**discovery_v2_classifications_id_get**](DefaultApi.md#discovery_v2_classifications_id_get) | **GET** /discovery/v2/classifications/{id} | Get Classification Details
[**discovery_v2_events_get**](DefaultApi.md#discovery_v2_events_get) | **GET** /discovery/v2/events | Event Search
[**discovery_v2_events_id_get**](DefaultApi.md#discovery_v2_events_id_get) | **GET** /discovery/v2/events/{id} | Get Event Details
[**discovery_v2_venues_get**](DefaultApi.md#discovery_v2_venues_get) | **GET** /discovery/v2/venues | Venue Search
[**discovery_v2_venues_id_get**](DefaultApi.md#discovery_v2_venues_id_get) | **GET** /discovery/v2/venues/{id} | Get Venue Details
[**find**](DefaultApi.md#find) | **GET** /discovery/v2/attractions | Attraction Search
[**get**](DefaultApi.md#get) | **GET** /discovery/v2/attractions/{id} | Get Attraction Details
[**get_genre**](DefaultApi.md#get_genre) | **GET** /discovery/v2/classifications/genres/{id} | Get Genre Details
[**get_images**](DefaultApi.md#get_images) | **GET** /discovery/v2/events/{id}/images | Get Event Images
[**get_segment**](DefaultApi.md#get_segment) | **GET** /discovery/v2/classifications/segments/{id} | Get Segment Details
[**get_subgenre**](DefaultApi.md#get_subgenre) | **GET** /discovery/v2/classifications/subgenres/{id} | Get Sub-Genre Details


# **discovery_v2_classifications_get**
> List[Classification] discovery_v2_classifications_get(sort=sort, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)

Classification Search

Find classifications and filter your search by name, and much more. Classifications help define the nature of attractions and events.

### Example


```python
import openapi_client
from openapi_client.models.classification import Classification
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sort = 'name,asc' # str | Sorting order of the search result (optional) (default to 'name,asc')
    keyword = '' # str | Keyword to search on (optional) (default to '')
    id = '' # str | Filter entities by its id (optional) (default to '')
    source =  # str | Filter entities by its source name (optional) (default to )
    include_test = false # str | True if you want to have entities flag as test in the response. Only, if you only wanted test entities (optional) (default to false)
    page = '0' # str | Page number (optional) (default to '0')
    size = '20' # str | Page size of the response (optional) (default to '20')
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | Yes if you want to display licensed content (optional) (default to false)
    include_spellcheck = false # str | yes, to include spell check suggestions in the response. (optional) (default to false)

    try:
        # Classification Search
        api_response = api_instance.discovery_v2_classifications_get(sort=sort, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)
        print("The response of DefaultApi->discovery_v2_classifications_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_classifications_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Sorting order of the search result | [optional] [default to &#39;name,asc&#39;]
 **keyword** | **str**| Keyword to search on | [optional] [default to &#39;&#39;]
 **id** | **str**| Filter entities by its id | [optional] [default to &#39;&#39;]
 **source** | **str**| Filter entities by its source name | [optional] [default to ]
 **include_test** | **str**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false]
 **page** | **str**| Page number | [optional] [default to &#39;0&#39;]
 **size** | **str**| Page size of the response | [optional] [default to &#39;20&#39;]
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| Yes if you want to display licensed content | [optional] [default to false]
 **include_spellcheck** | **str**| yes, to include spell check suggestions in the response. | [optional] [default to false]

### Return type

[**List[Classification]**](Classification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_v2_classifications_id_get**
> Classification discovery_v2_classifications_id_get(id, locale=locale, include_licensed_content=include_licensed_content)

Get Classification Details

Get details for a specific segment, genre, or sub-genre using its unique identifier.

### Example


```python
import openapi_client
from openapi_client.models.classification import Classification
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the segment, genre, or sub-genre
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Classification Details
        api_response = api_instance.discovery_v2_classifications_id_get(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->discovery_v2_classifications_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_classifications_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the segment, genre, or sub-genre | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Classification**](Classification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_v2_events_get**
> List[Event] discovery_v2_events_get(sort=sort, start_date_time=start_date_time, end_date_time=end_date_time, onsale_start_date_time=onsale_start_date_time, onsale_on_start_date=onsale_on_start_date, onsale_on_after_start_date=onsale_on_after_start_date, onsale_end_date_time=onsale_end_date_time, city=city, country_code=country_code, state_code=state_code, postal_code=postal_code, venue_id=venue_id, attraction_id=attraction_id, segment_id=segment_id, segment_name=segment_name, classification_name=classification_name, classification_id=classification_id, market_id=market_id, promoter_id=promoter_id, dma_id=dma_id, include_tba=include_tba, include_tbd=include_tbd, client_visibility=client_visibility, latlong=latlong, radius=radius, unit=unit, geo_point=geo_point, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)

Event Search

Find events and filter your search by location, date, availability, and much more.

### Example


```python
import openapi_client
from openapi_client.models.event import Event
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sort = 'relevance,desc' # str | Sorting order of the search result. Allowable values : 'name,asc', 'name,desc', 'date,asc', 'date,desc', 'relevance,asc', 'relevance,desc', 'distance,asc', 'name,date,asc', 'name,date,desc', 'date,name,asc', 'date,name,desc','onsaleStartDate,asc', 'id,asc' (optional) (default to 'relevance,desc')
    start_date_time = '' # str | Filter events with a start date after this date (optional) (default to '')
    end_date_time = '' # str | Filter events with a start date before this date (optional) (default to '')
    onsale_start_date_time = '' # str | Filter events with onsale start date after this date (optional) (default to '')
    onsale_on_start_date = '' # str | Filter events with onsale start date on this date (optional) (default to '')
    onsale_on_after_start_date = '' # str | Filter events with onsale range within this date (optional) (default to '')
    onsale_end_date_time = '' # str | Filter events with onsale end date before this date (optional) (default to '')
    city = '' # str | Filter events by city (optional) (default to '')
    country_code = '' # str | Filter events by country code (optional) (default to '')
    state_code = '' # str | Filter events by state code (optional) (default to '')
    postal_code = '' # str | Filter events by postal code / zipcode (optional) (default to '')
    venue_id = '' # str | Filter events by venue id (optional) (default to '')
    attraction_id = '' # str | Filter events by attraction id (optional) (default to '')
    segment_id = '' # str | Filter events by segment id (optional) (default to '')
    segment_name = '' # str | Filter events by segment name (optional) (default to '')
    classification_name = [] # List[object] | Filter events by classification name: name of any segment, genre, sub-genre, type, sub-type (optional)
    classification_id = [] # List[object] | Filter events by classification id: id of any segment, genre, sub-genre, type, sub-type (optional)
    market_id = '' # str | Filter events by market id (optional) (default to '')
    promoter_id = '' # str | Filter events by promoter id (optional) (default to '')
    dma_id = '' # str | Filter events by dma id (optional) (default to '')
    include_tba = no if date parameter sent, yes otherwise # str | True, to include events with date to be announce (TBA) (optional) (default to no if date parameter sent, yes otherwise)
    include_tbd = no if date parameter sent, yes otherwise # str | True, to include event with a date to be defined (TBD) (optional) (default to no if date parameter sent, yes otherwise)
    client_visibility = '' # str | Filter events by clientName (optional) (default to '')
    latlong = '' # str | Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead (optional) (default to '')
    radius = '50' # str | Radius of the area in which we want to search for events. (optional) (default to '50')
    unit = miles # str | Unit of the radius (optional) (default to miles)
    geo_point = '' # str | filter events by geoHash (optional) (default to '')
    keyword = '' # str | Keyword to search on (optional) (default to '')
    id = '' # str | Filter entities by its id (optional) (default to '')
    source =  # str | Filter entities by its source name (optional) (default to )
    include_test = false # str | True if you want to have entities flag as test in the response. Only, if you only wanted test entities (optional) (default to false)
    page = '0' # str | Page number (optional) (default to '0')
    size = '20' # str | Page size of the response (optional) (default to '20')
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | Yes if you want to display licensed content (optional) (default to false)
    include_spellcheck = false # str | yes, to include spell check suggestions in the response. (optional) (default to false)

    try:
        # Event Search
        api_response = api_instance.discovery_v2_events_get(sort=sort, start_date_time=start_date_time, end_date_time=end_date_time, onsale_start_date_time=onsale_start_date_time, onsale_on_start_date=onsale_on_start_date, onsale_on_after_start_date=onsale_on_after_start_date, onsale_end_date_time=onsale_end_date_time, city=city, country_code=country_code, state_code=state_code, postal_code=postal_code, venue_id=venue_id, attraction_id=attraction_id, segment_id=segment_id, segment_name=segment_name, classification_name=classification_name, classification_id=classification_id, market_id=market_id, promoter_id=promoter_id, dma_id=dma_id, include_tba=include_tba, include_tbd=include_tbd, client_visibility=client_visibility, latlong=latlong, radius=radius, unit=unit, geo_point=geo_point, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)
        print("The response of DefaultApi->discovery_v2_events_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_events_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Sorting order of the search result. Allowable values : &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;date,asc&#39;, &#39;date,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39;, &#39;distance,asc&#39;, &#39;name,date,asc&#39;, &#39;name,date,desc&#39;, &#39;date,name,asc&#39;, &#39;date,name,desc&#39;,&#39;onsaleStartDate,asc&#39;, &#39;id,asc&#39; | [optional] [default to &#39;relevance,desc&#39;]
 **start_date_time** | **str**| Filter events with a start date after this date | [optional] [default to &#39;&#39;]
 **end_date_time** | **str**| Filter events with a start date before this date | [optional] [default to &#39;&#39;]
 **onsale_start_date_time** | **str**| Filter events with onsale start date after this date | [optional] [default to &#39;&#39;]
 **onsale_on_start_date** | **str**| Filter events with onsale start date on this date | [optional] [default to &#39;&#39;]
 **onsale_on_after_start_date** | **str**| Filter events with onsale range within this date | [optional] [default to &#39;&#39;]
 **onsale_end_date_time** | **str**| Filter events with onsale end date before this date | [optional] [default to &#39;&#39;]
 **city** | **str**| Filter events by city | [optional] [default to &#39;&#39;]
 **country_code** | **str**| Filter events by country code | [optional] [default to &#39;&#39;]
 **state_code** | **str**| Filter events by state code | [optional] [default to &#39;&#39;]
 **postal_code** | **str**| Filter events by postal code / zipcode | [optional] [default to &#39;&#39;]
 **venue_id** | **str**| Filter events by venue id | [optional] [default to &#39;&#39;]
 **attraction_id** | **str**| Filter events by attraction id | [optional] [default to &#39;&#39;]
 **segment_id** | **str**| Filter events by segment id | [optional] [default to &#39;&#39;]
 **segment_name** | **str**| Filter events by segment name | [optional] [default to &#39;&#39;]
 **classification_name** | [**List[object]**](object.md)| Filter events by classification name: name of any segment, genre, sub-genre, type, sub-type | [optional] 
 **classification_id** | [**List[object]**](object.md)| Filter events by classification id: id of any segment, genre, sub-genre, type, sub-type | [optional] 
 **market_id** | **str**| Filter events by market id | [optional] [default to &#39;&#39;]
 **promoter_id** | **str**| Filter events by promoter id | [optional] [default to &#39;&#39;]
 **dma_id** | **str**| Filter events by dma id | [optional] [default to &#39;&#39;]
 **include_tba** | **str**| True, to include events with date to be announce (TBA) | [optional] [default to no if date parameter sent, yes otherwise]
 **include_tbd** | **str**| True, to include event with a date to be defined (TBD) | [optional] [default to no if date parameter sent, yes otherwise]
 **client_visibility** | **str**| Filter events by clientName | [optional] [default to &#39;&#39;]
 **latlong** | **str**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to &#39;&#39;]
 **radius** | **str**| Radius of the area in which we want to search for events. | [optional] [default to &#39;50&#39;]
 **unit** | **str**| Unit of the radius | [optional] [default to miles]
 **geo_point** | **str**| filter events by geoHash | [optional] [default to &#39;&#39;]
 **keyword** | **str**| Keyword to search on | [optional] [default to &#39;&#39;]
 **id** | **str**| Filter entities by its id | [optional] [default to &#39;&#39;]
 **source** | **str**| Filter entities by its source name | [optional] [default to ]
 **include_test** | **str**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false]
 **page** | **str**| Page number | [optional] [default to &#39;0&#39;]
 **size** | **str**| Page size of the response | [optional] [default to &#39;20&#39;]
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| Yes if you want to display licensed content | [optional] [default to false]
 **include_spellcheck** | **str**| yes, to include spell check suggestions in the response. | [optional] [default to false]

### Return type

[**List[Event]**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_v2_events_id_get**
> Event discovery_v2_events_id_get(id, locale=locale, include_licensed_content=include_licensed_content)

Get Event Details

Get details for a specific event using the unique identifier for the event. This includes the venue and location, the attraction(s), and the Ticketmaster Website URL for purchasing tickets for the event.

### Example


```python
import openapi_client
from openapi_client.models.event import Event
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the event
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Event Details
        api_response = api_instance.discovery_v2_events_id_get(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->discovery_v2_events_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_events_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the event | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_v2_venues_get**
> List[Venue] discovery_v2_venues_get(sort=sort, state_code=state_code, country_code=country_code, latlong=latlong, radius=radius, unit=unit, geo_point=geo_point, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)

Venue Search

Find venues and filter your search by name, and much more.

### Example


```python
import openapi_client
from openapi_client.models.venue import Venue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sort = 'relevance,desc' # str | Sorting order of the search result. Allowable Values: 'name,asc', 'name,desc', 'relevance,asc', 'relevance,desc', 'distance,asc', 'distance,desc' (optional) (default to 'relevance,desc')
    state_code = '' # str | Filter venues by state / province code (optional) (default to '')
    country_code = '' # str | Filter venues by country code (optional) (default to '')
    latlong = '' # str | Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead (optional) (default to '')
    radius = '50' # str | Radius of the area in which we want to search for events. (optional) (default to '50')
    unit = miles # str | Unit of the radius (optional) (default to miles)
    geo_point = '' # str | filter events by geoHash (optional) (default to '')
    keyword = '' # str | Keyword to search on (optional) (default to '')
    id = '' # str | Filter entities by its id (optional) (default to '')
    source =  # str | Filter entities by its source name (optional) (default to )
    include_test = false # str | True if you want to have entities flag as test in the response. Only, if you only wanted test entities (optional) (default to false)
    page = '0' # str | Page number (optional) (default to '0')
    size = '20' # str | Page size of the response (optional) (default to '20')
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | Yes if you want to display licensed content (optional) (default to false)
    include_spellcheck = false # str | yes, to include spell check suggestions in the response. (optional) (default to false)

    try:
        # Venue Search
        api_response = api_instance.discovery_v2_venues_get(sort=sort, state_code=state_code, country_code=country_code, latlong=latlong, radius=radius, unit=unit, geo_point=geo_point, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)
        print("The response of DefaultApi->discovery_v2_venues_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_venues_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Sorting order of the search result. Allowable Values: &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39;, &#39;distance,asc&#39;, &#39;distance,desc&#39; | [optional] [default to &#39;relevance,desc&#39;]
 **state_code** | **str**| Filter venues by state / province code | [optional] [default to &#39;&#39;]
 **country_code** | **str**| Filter venues by country code | [optional] [default to &#39;&#39;]
 **latlong** | **str**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to &#39;&#39;]
 **radius** | **str**| Radius of the area in which we want to search for events. | [optional] [default to &#39;50&#39;]
 **unit** | **str**| Unit of the radius | [optional] [default to miles]
 **geo_point** | **str**| filter events by geoHash | [optional] [default to &#39;&#39;]
 **keyword** | **str**| Keyword to search on | [optional] [default to &#39;&#39;]
 **id** | **str**| Filter entities by its id | [optional] [default to &#39;&#39;]
 **source** | **str**| Filter entities by its source name | [optional] [default to ]
 **include_test** | **str**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false]
 **page** | **str**| Page number | [optional] [default to &#39;0&#39;]
 **size** | **str**| Page size of the response | [optional] [default to &#39;20&#39;]
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| Yes if you want to display licensed content | [optional] [default to false]
 **include_spellcheck** | **str**| yes, to include spell check suggestions in the response. | [optional] [default to false]

### Return type

[**List[Venue]**](Venue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_v2_venues_id_get**
> Venue discovery_v2_venues_id_get(id, locale=locale, include_licensed_content=include_licensed_content)

Get Venue Details

Get details for a specific venue using the unique identifier for the venue.

### Example


```python
import openapi_client
from openapi_client.models.venue import Venue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the venue
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Venue Details
        api_response = api_instance.discovery_v2_venues_id_get(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->discovery_v2_venues_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->discovery_v2_venues_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the venue | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Venue**](Venue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find**
> List[Attraction] find(sort=sort, classification_name=classification_name, classification_id=classification_id, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)

Attraction Search

Find attractions (artists, sports, packages, plays and so on) and filter your search by name, and much more.

### Example


```python
import openapi_client
from openapi_client.models.attraction import Attraction
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sort = 'relevance,desc' # str | Sorting order of the search result. Allowable Values : 'name,asc', 'name,desc', 'relevance,asc', 'relevance,desc' (optional) (default to 'relevance,desc')
    classification_name = [] # List[object] | Filter attractions by classification name: name of any segment, genre, sub-genre, type, sub-type (optional)
    classification_id = [] # List[object] | Filter attractions by classification id: id of any segment, genre, sub-genre, type, sub-type (optional)
    keyword = '' # str | Keyword to search on (optional) (default to '')
    id = '' # str | Filter entities by its id (optional) (default to '')
    source =  # str | Filter entities by its source name (optional) (default to )
    include_test = false # str | True if you want to have entities flag as test in the response. Only, if you only wanted test entities (optional) (default to false)
    page = '0' # str | Page number (optional) (default to '0')
    size = '20' # str | Page size of the response (optional) (default to '20')
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | Yes if you want to display licensed content (optional) (default to false)
    include_spellcheck = false # str | yes, to include spell check suggestions in the response. (optional) (default to false)

    try:
        # Attraction Search
        api_response = api_instance.find(sort=sort, classification_name=classification_name, classification_id=classification_id, keyword=keyword, id=id, source=source, include_test=include_test, page=page, size=size, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)
        print("The response of DefaultApi->find:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Sorting order of the search result. Allowable Values : &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39; | [optional] [default to &#39;relevance,desc&#39;]
 **classification_name** | [**List[object]**](object.md)| Filter attractions by classification name: name of any segment, genre, sub-genre, type, sub-type | [optional] 
 **classification_id** | [**List[object]**](object.md)| Filter attractions by classification id: id of any segment, genre, sub-genre, type, sub-type | [optional] 
 **keyword** | **str**| Keyword to search on | [optional] [default to &#39;&#39;]
 **id** | **str**| Filter entities by its id | [optional] [default to &#39;&#39;]
 **source** | **str**| Filter entities by its source name | [optional] [default to ]
 **include_test** | **str**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false]
 **page** | **str**| Page number | [optional] [default to &#39;0&#39;]
 **size** | **str**| Page size of the response | [optional] [default to &#39;20&#39;]
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| Yes if you want to display licensed content | [optional] [default to false]
 **include_spellcheck** | **str**| yes, to include spell check suggestions in the response. | [optional] [default to false]

### Return type

[**List[Attraction]**](Attraction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> Attraction get(id, locale=locale, include_licensed_content=include_licensed_content)

Get Attraction Details

Get details for a specific attraction using the unique identifier for the attraction.

### Example


```python
import openapi_client
from openapi_client.models.attraction import Attraction
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the attraction
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Attraction Details
        api_response = api_instance.get(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the attraction | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Attraction**](Attraction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_genre**
> Genre get_genre(id, locale=locale, include_licensed_content=include_licensed_content)

Get Genre Details

Get details for a specific genre using its unique identifier.

### Example


```python
import openapi_client
from openapi_client.models.genre import Genre
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the genre
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Genre Details
        api_response = api_instance.get_genre(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->get_genre:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_genre: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the genre | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Genre**](Genre.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_images**
> EventImages get_images(id, locale=locale, include_licensed_content=include_licensed_content)

Get Event Images

Get images for a specific event using the unique identifier for the event.

### Example


```python
import openapi_client
from openapi_client.models.event_images import EventImages
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the event
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Event Images
        api_response = api_instance.get_images(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->get_images:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_images: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the event | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**EventImages**](EventImages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment**
> Segment get_segment(id, locale=locale, include_licensed_content=include_licensed_content)

Get Segment Details

Get details for a specific segment using its unique identifier.

### Example


```python
import openapi_client
from openapi_client.models.segment import Segment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the segment
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Segment Details
        api_response = api_instance.get_segment(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->get_segment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the segment | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Segment**](Segment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subgenre**
> Level get_subgenre(id, locale=locale, include_licensed_content=include_licensed_content)

Get Sub-Genre Details

Get details for a specific sub-genre using its unique identifier.

### Example


```python
import openapi_client
from openapi_client.models.level import Level
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://www.ticketmaster.com/discovery/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://www.ticketmaster.com/discovery/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = 'id_example' # str | ID of the subgenre
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | True if you want to display licensed content (optional) (default to false)

    try:
        # Get Sub-Genre Details
        api_response = api_instance.get_subgenre(id, locale=locale, include_licensed_content=include_licensed_content)
        print("The response of DefaultApi->get_subgenre:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_subgenre: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the subgenre | 
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| True if you want to display licensed content | [optional] [default to false]

### Return type

[**Level**](Level.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

