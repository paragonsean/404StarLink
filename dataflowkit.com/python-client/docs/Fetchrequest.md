# Fetchrequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Action]**](Action.md) | Use actions to automate manual workflows while rendering web pages. They simulate real-world human interaction with pages. _(Chrome fetcher type only)_ | [optional] [default to []]
**ignore_http_status_err_codes** | **bool** | The HTTP 200 OK success status response code indicates that the request has succeeded. Sometimes a server returns normal HTML content even with an erroneous Non-200 HTTP response status code. The IgnoreHTTPStatusCode option is useful when you need to force the return of HTML content. Defaults to \&quot;false.\&quot; | [optional] 
**initial_cookies** | [**List[InitialCookie]**](InitialCookie.md) | The \&quot;Initial Cookies\&quot; option is useful for crawling websites that require a login. The simplest solution to get an array of cookies for specific websites is to use a web browser \&quot;EditThisCookie\&quot; extension. Copy a cookie array with \&quot;EditThisCookie\&quot; and paste it into the \&quot;Initial cookie\&quot; field. | [optional] [default to []]
**output** | **str** | If set to _file_, the content of downloaded HTML is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, downloaded content is returned in the response body. | [optional] [default to 'buffer']
**proxy** | **str** | Specify proxy by adding [country ISO code](https://en.wikipedia.org/wiki/ISO_3166-2) to &#x60;country-&#x60; value to send requests through a proxy in the specified country. Use &#x60;country-any&#x60; to use random geo-targets. | [optional] 
**type** | **str** | If set to &#x60;base&#x60;, the Base fetcher is used for downloading web page content. Use &#x60;chrome&#x60; for fetching content with a Headless chrome browser. If omitted &#x60;base&#x60; fetcher is used by default. | 
**url** | **str** | Specify URL to download. | 
**wait_delay** | **float** | Specify a wait delay (in seconds). This may be useful if certain elements of the web site need to be rendered after the initial page load. _(Chrome fetcher type only)_ | [optional] 

## Example

```python
from openapi_client.models.fetchrequest import Fetchrequest

# TODO update the JSON string below
json = "{}"
# create an instance of Fetchrequest from a JSON string
fetchrequest_instance = Fetchrequest.from_json(json)
# print the JSON string representation of the object
print(Fetchrequest.to_json())

# convert the object into a dict
fetchrequest_dict = fetchrequest_instance.to_dict()
# create an instance of Fetchrequest from a dict
fetchrequest_from_dict = Fetchrequest.from_dict(fetchrequest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


