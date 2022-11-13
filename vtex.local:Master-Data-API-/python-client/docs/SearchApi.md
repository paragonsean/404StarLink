# openapi_client.SearchApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchdocuments**](SearchApi.md#searchdocuments) | **GET** /api/dataentities/{dataEntityName}/search | Search documents


# **searchdocuments**
> searchdocuments(data_entity_name, content_type, accept, rest_range, fields=fields, where=where, var_schema=var_schema, keyword=keyword, sort=sort)

Search documents

Retrieves documents' information, while choosing which fields will be returned and filtering documents by specific fields.    > The response header `REST-Content-Range` indicates the total amount of results for that specific search. For example, it may return `resources 0-100/136108`, which indicates it has returned results from 0 to 100 of a total 136108.    Below you can see some query examples and learn more about each query parameter.    > Avoid sending too many requests with wildcards (`*`) in the search parameters or that use the `keyword` parameter. This may lead to this endpoint being temporarily blocked for your account. If this happens you will receive an error with status code `503`.    ## Query examples    ### Simple filter    ```  /dataentities/Client/search?email=my@email.com  ```    ### Complex filter    ```  /dataentities/Client/search?_where=(firstName=Jon OR lastName=Smith) OR (createdIn between 2001-01-01 AND 2016-01-01)  ```    ### Date Range    ```  /dataentities/Client/search?_where=createdIn between 2001-01-01 AND 2016-01-01  ```    ### Range numeric fields    ```  /dataentities/Client/search?_where=age between 18 AND 25  ```    ### Partial filter    ```  /dataentities/Client/search?firstName=*Maria*  ```    ### Filter for null values    ```  /dataentities/Client/search?_where=firstName is null  ```    ### Filter for non-null values    ```  /dataentities/Client/search?_where=firstName is not null  ```    ### Filter for difference  ```  /dataentities/Client/search?_where=firstName<>maria  ```    ### Filter greater than or less than  ```  /dataentities/Client/search?_where=number>5  /dataentities/Client/search?_where=date<2001-01-01  ```

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SearchApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    rest_range = 'resources=0-10' # str | Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query.
    fields = 'email,firstName,document' # str | Fields that should be returned by document. Separate fields' names with commas. For example `_fields=email,firstName,document`. You can also use `_all` to fetch all fields. (optional) (default to 'email,firstName,document')
    where = 'firstName is not null.' # str | Filter specification. (optional)
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)
    keyword = 'String to search' # str | String to search. Use quotes for a partial query. For example, `_keyword=Maria` or `_keyword=\"Maria\"`. (optional)
    sort = 'firstName ASC' # str | Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use `ASC` for ascending or `DESC` for descending. (optional) (default to 'firstName ASC')

    try:
        # Search documents
        api_instance.searchdocuments(data_entity_name, content_type, accept, rest_range, fields=fields, where=where, var_schema=var_schema, keyword=keyword, sort=sort)
    except Exception as e:
        print("Exception when calling SearchApi->searchdocuments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **rest_range** | **str**| Defines the collection of documents to be returned. A range within the collection limited by 100 documents per query. | 
 **fields** | **str**| Fields that should be returned by document. Separate fields&#39; names with commas. For example &#x60;_fields&#x3D;email,firstName,document&#x60;. You can also use &#x60;_all&#x60; to fetch all fields. | [optional] [default to &#39;email,firstName,document&#39;]
 **where** | **str**| Filter specification. | [optional] 
 **var_schema** | **str**| Name of the schema the document to be created needs to be compliant with. | [optional] 
 **keyword** | **str**| String to search. Use quotes for a partial query. For example, &#x60;_keyword&#x3D;Maria&#x60; or &#x60;_keyword&#x3D;\&quot;Maria\&quot;&#x60;. | [optional] 
 **sort** | **str**| Sets sorting mode in two parts. The first part is the name of the field you want to sort by. In the second part, use &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending. | [optional] [default to &#39;firstName ASC&#39;]

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

