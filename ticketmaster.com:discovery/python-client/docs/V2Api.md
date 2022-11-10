# openapi_client.V2Api

All URIs are relative to *http://www.ticketmaster.com/discovery/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discovery_v2_suggest_get**](V2Api.md#discovery_v2_suggest_get) | **GET** /discovery/v2/suggest | Find Suggest


# **discovery_v2_suggest_get**
> str discovery_v2_suggest_get(keyword=keyword, source=source, latlong=latlong, radius=radius, unit=unit, size=size, include_fuzzy=include_fuzzy, client_visibility=client_visibility, country_code=country_code, include_tba=include_tba, include_tbd=include_tbd, segment_id=segment_id, geo_point=geo_point, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)

Find Suggest

Find search suggestions and filter your suggestions by location, source, etc.

### Example


```python
import openapi_client
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
    api_instance = openapi_client.V2Api(api_client)
    keyword = '' # str | Keyword to search on (optional) (default to '')
    source =  # str | Filter entities by its source name (optional) (default to )
    latlong = '' # str | Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead (optional) (default to '')
    radius = '100' # str | Radius of the area in which we want to search for events. (optional) (default to '100')
    unit = miles # str | Unit of the radius (optional) (default to miles)
    size = '5' # str | Size of every entity returned in the response (optional) (default to '5')
    include_fuzzy = false # str | yes, to include fuzzy matches in the search. This has performance impact. (optional) (default to false)
    client_visibility = '' # str | Filter events to clientName (optional) (default to '')
    country_code = '' # str | Filter suggestions by country code (optional) (default to '')
    include_tba = no if date parameter sent, yes otherwise # str | True, to include events with date to be announce (TBA) (optional) (default to no if date parameter sent, yes otherwise)
    include_tbd = no if date parameter sent, yes otherwise # str | True, to include event with a date to be defined (TBD) (optional) (default to no if date parameter sent, yes otherwise)
    segment_id = '' # str | Filter suggestions by segment id (optional) (default to '')
    geo_point = '' # str | filter events by geoHash (optional) (default to '')
    locale = 'en' # str | The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*')  (optional) (default to 'en')
    include_licensed_content = false # str | Yes if you want to display licensed content (optional) (default to false)
    include_spellcheck = false # str | yes, to include spell check suggestions in the response. (optional) (default to false)

    try:
        # Find Suggest
        api_response = api_instance.discovery_v2_suggest_get(keyword=keyword, source=source, latlong=latlong, radius=radius, unit=unit, size=size, include_fuzzy=include_fuzzy, client_visibility=client_visibility, country_code=country_code, include_tba=include_tba, include_tbd=include_tbd, segment_id=segment_id, geo_point=geo_point, locale=locale, include_licensed_content=include_licensed_content, include_spellcheck=include_spellcheck)
        print("The response of V2Api->discovery_v2_suggest_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling V2Api->discovery_v2_suggest_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **str**| Keyword to search on | [optional] [default to &#39;&#39;]
 **source** | **str**| Filter entities by its source name | [optional] [default to ]
 **latlong** | **str**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to &#39;&#39;]
 **radius** | **str**| Radius of the area in which we want to search for events. | [optional] [default to &#39;100&#39;]
 **unit** | **str**| Unit of the radius | [optional] [default to miles]
 **size** | **str**| Size of every entity returned in the response | [optional] [default to &#39;5&#39;]
 **include_fuzzy** | **str**| yes, to include fuzzy matches in the search. This has performance impact. | [optional] [default to false]
 **client_visibility** | **str**| Filter events to clientName | [optional] [default to &#39;&#39;]
 **country_code** | **str**| Filter suggestions by country code | [optional] [default to &#39;&#39;]
 **include_tba** | **str**| True, to include events with date to be announce (TBA) | [optional] [default to no if date parameter sent, yes otherwise]
 **include_tbd** | **str**| True, to include event with a date to be defined (TBD) | [optional] [default to no if date parameter sent, yes otherwise]
 **segment_id** | **str**| Filter suggestions by segment id | [optional] [default to &#39;&#39;]
 **geo_point** | **str**| filter events by geoHash | [optional] [default to &#39;&#39;]
 **locale** | **str**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to &#39;en&#39;]
 **include_licensed_content** | **str**| Yes if you want to display licensed content | [optional] [default to false]
 **include_spellcheck** | **str**| yes, to include spell check suggestions in the response. | [optional] [default to false]

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json; charset=utf-8, application/json; charset=utf-8

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

