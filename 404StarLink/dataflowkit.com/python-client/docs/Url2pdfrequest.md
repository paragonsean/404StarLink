# Url2pdfrequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Action]**](Action.md) | Use actions to automate manual workflows while rendering web pages. They simulate real-world human interaction with pages. | [optional] [default to []]
**ignore_http_status_err_codes** | **bool** | The HTTP 200 OK success status response code indicates that the request has succeeded. Sometimes a server returns normal HTML content even with an erroneous Non-200 HTTP response status code. The IgnoreHTTPStatusCode option is useful when you need to force the return of HTML content. Defaults to \&quot;false.\&quot; | [optional] 
**initial_cookies** | [**List[InitialCookie]**](InitialCookie.md) | The \&quot;Initial Cookies\&quot; option is useful for crawling websites that require a login. The simplest solution to get an array of cookies for specific websites is to use a web browser \&quot;EditThisCookie\&quot; extension. Copy a cookie array with \&quot;EditThisCookie\&quot; and paste it into the \&quot;Initial cookie\&quot; field. | [optional] [default to []]
**landscape** | **bool** | Paper orientation. Parameter landscape &#x3D; false means portrait orientation. Set landscape to true for landscape page oriantation. | [optional] [default to False]
**margin_bottom** | **float** | Bottom Margin of the PDF (in inches) | [optional] [default to 0.4]
**margin_left** | **float** | Left Margin of the PDF (in inches) | [optional] [default to 0.4]
**margin_right** | **float** | Right Margin of the PDF (in inches) | [optional] [default to 0.4]
**margin_top** | **float** | Top Margin of the PDF (in inches) | [optional] [default to 0.4]
**output** | **str** | If set to _file_, the resulted PDF is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, PDF content is returned in the response body. | [optional] [default to 'buffer']
**page_ranges** | **str** | Specify page ranges to convert. Defaults to the empty value, which means convert all pages. | [optional] 
**paper_size** | **str** | Page size parameter consists of the most popular page formats. | [optional] [default to 'A4']
**print_background** | **bool** | Print background graphics in the PDF. | [optional] [default to False]
**print_header_footer** | **bool** | printHeaderFooter  parameter consists of the date, name of the web page, the page URL, and how many pages the document you are printing. | [optional] [default to False]
**proxy** | **str** | Specify proxy by adding [country ISO code](https://en.wikipedia.org/wiki/ISO_3166-2) to &#x60;country-&#x60; value to send requests through a proxy in the specified country. Use &#x60;country-any&#x60; to use random geo-targets. | [optional] 
**scale** | **float** | By default, PDF document content is generated according to dimensions of the original web page content. Using the &#x60;scale&#x60; parameter, you can specify a custom zoom factor from 0.1 to 5.0 of the webpage rendering. | [optional] [default to 1]
**url** | **str** | The full URL address (including HTTP/HTTPS) of a web page that you want to save as PDF | 
**wait_delay** | **float** | Specify a wait delay (in seconds). This may be useful if certain elements of the web site need to be rendered after the initial page load. | [optional] [default to 0.5]

## Example

```python
from openapi_client.models.url2pdfrequest import Url2pdfrequest

# TODO update the JSON string below
json = "{}"
# create an instance of Url2pdfrequest from a JSON string
url2pdfrequest_instance = Url2pdfrequest.from_json(json)
# print the JSON string representation of the object
print(Url2pdfrequest.to_json())

# convert the object into a dict
url2pdfrequest_dict = url2pdfrequest_instance.to_dict()
# create an instance of Url2pdfrequest from a dict
url2pdfrequest_from_dict = Url2pdfrequest.from_dict(url2pdfrequest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


