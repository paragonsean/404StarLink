# openapi_client.BlogApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_blog_posts**](BlogApi.md#get_blog_posts) | **GET** /blogs | Get blog posts - ordered by created desc by default


# **get_blog_posts**
> BlogArticleList get_blog_posts(locale=locale, fallback=fallback, page=page, per_page=per_page)

Get blog posts - ordered by created desc by default

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.blog_article_list import BlogArticleList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BlogApi(api_client)
    locale = 'locale_example' # str | Article language, default `en`. When no blog article is available and `fallback=true` is specified, it falls back to `en`. (optional)
    fallback = True # bool | When `true`, and no article is found in the locale, it falls back to `locale=en`. (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 1 # int |  (optional) (default to 1)

    try:
        # Get blog posts - ordered by created desc by default
        api_response = api_instance.get_blog_posts(locale=locale, fallback=fallback, page=page, per_page=per_page)
        print("The response of BlogApi->get_blog_posts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlogApi->get_blog_posts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **str**| Article language, default &#x60;en&#x60;. When no blog article is available and &#x60;fallback&#x3D;true&#x60; is specified, it falls back to &#x60;en&#x60;. | [optional] 
 **fallback** | **bool**| When &#x60;true&#x60;, and no article is found in the locale, it falls back to &#x60;locale&#x3D;en&#x60;. | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 1]

### Return type

[**BlogArticleList**](BlogArticleList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of blog articles |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

