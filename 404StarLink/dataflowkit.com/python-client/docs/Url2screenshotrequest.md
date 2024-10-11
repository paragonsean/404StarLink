# Url2screenshotrequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Action]**](Action.md) | Use actions to automate manual workflows while rendering web pages. They simulate real-world human interaction with pages. | [optional] [default to []]
**clip_selector** | **str** | Captures a screenshot of specified CSS element on a web page. | [optional] 
**format** | **str** | Sets the Format of output image | [optional] [default to 'png']
**full_page** | **bool** | takes a screenshot of a full web page. It ignores offsetX, offsety, width and height argument values. | [optional] [default to False]
**height** | **int** | Rectangle height in device independent pixels (dip). | [optional] [default to 600]
**ignore_http_status_err_codes** | **bool** | The HTTP 200 OK success status response code indicates that the request has succeeded. Sometimes a server returns normal HTML content even with an erroneous Non-200 HTTP response status code. The IgnoreHTTPStatusCode option is useful when you need to force the return of HTML content. Defaults to \&quot;false.\&quot; | [optional] 
**initial_cookies** | [**List[InitialCookie]**](InitialCookie.md) | The \&quot;Initial Cookies\&quot; option is useful for crawling websites that require a login. The simplest solution to get an array of cookies for specific websites is to use a web browser \&quot;EditThisCookie\&quot; extension. Copy a cookie array with \&quot;EditThisCookie\&quot; and paste it into the \&quot;Initial cookie\&quot; field. | [optional] [default to []]
**offsetx** | **int** | X offset in device independent pixels (dip). | [optional] [default to 0]
**offsety** | **int** | Y offset in device independent pixels (dip). | [optional] [default to 0]
**output** | **str** | If set to _file_, the resulted screenshot is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, web site screenshot is returned in the response body. | [optional] [default to 'buffer']
**print_background** | **bool** | Print background graphics in the PDF. | [optional] [default to False]
**proxy** | **str** | Specify proxy by adding [country ISO code](https://en.wikipedia.org/wiki/ISO_3166-2) to &#x60;country-&#x60; value to send requests through a proxy in the specified country. Use &#x60;country-any&#x60; to use random geo-targets. | [optional] 
**quality** | **int** | Sets the Quality of output image. Compression quality from range [0..100] (jpeg only). | [optional] [default to 80]
**scale** | **float** | Image scale factor. range [0.1 .. 3] | [optional] [default to 1]
**url** | **str** | The full URL address (including HTTP/HTTPS) of a web page that you want to capture | 
**wait_delay** | **float** | Specify a wait delay (in seconds). This may be useful if certain elements of the web site need to be rendered after the initial page load. | [optional] [default to 0.5]
**width** | **int** | Rectangle width in device independent pixels (dip). | [optional] [default to 800]

## Example

```python
from openapi_client.models.url2screenshotrequest import Url2screenshotrequest

# TODO update the JSON string below
json = "{}"
# create an instance of Url2screenshotrequest from a JSON string
url2screenshotrequest_instance = Url2screenshotrequest.from_json(json)
# print the JSON string representation of the object
print(Url2screenshotrequest.to_json())

# convert the object into a dict
url2screenshotrequest_dict = url2screenshotrequest_instance.to_dict()
# create an instance of Url2screenshotrequest from a dict
url2screenshotrequest_from_dict = Url2screenshotrequest.from_dict(url2screenshotrequest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


