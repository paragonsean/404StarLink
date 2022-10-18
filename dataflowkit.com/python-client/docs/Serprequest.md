# Serprequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List[ModelField]**](ModelField.md) | Specify CSS selectors (patterns) used to gather data from Search Engine Result Pages.  Ready-to-use payloads for collecting search results from the most popular Search Engines are available. These payloads are customizable, though.  | [optional] 
**format** | **str** | Extracted data is returned either in CSV, MS Excel, JSON, JSON(Lines) or XML format. | 
**name** | **str** | Collection name. | 
**page_num** | **int** | Specify number of pages to crawl. | [optional] [default to 1]
**proxy** | **str** | Always specify proxy for sending SERP requests. Add choosen [country ISO code](https://en.wikipedia.org/wiki/ISO_3166-2) to &#x60;country-&#x60; value to send requests through a proxy in the specified country. Use &#x60;country-any&#x60; to use random geo-targets. | 
**type** | **str** | For SERP requests you should _always_ use &#x60;chrome&#x60; type to fetch content with a Headless chrome browser | 
**url** | **str** | url holds the link to a Search Engine to use, and other optional parameters like languages or country. | 

## Example

```python
from openapi_client.models.serprequest import Serprequest

# TODO update the JSON string below
json = "{}"
# create an instance of Serprequest from a JSON string
serprequest_instance = Serprequest.from_json(json)
# print the JSON string representation of the object
print(Serprequest.to_json())

# convert the object into a dict
serprequest_dict = serprequest_instance.to_dict()
# create an instance of Serprequest from a dict
serprequest_from_dict = Serprequest.from_dict(serprequest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


