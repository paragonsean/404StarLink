# Paginator

Specify _Next link_ paginator on pages containing a link pointing to the next page. The next page link is extracted from a document by querying href attribute of a given element's CSS selector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_page_selector** | **str** |  | [optional] 
**page_num** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.paginator import Paginator

# TODO update the JSON string below
json = "{}"
# create an instance of Paginator from a JSON string
paginator_instance = Paginator.from_json(json)
# print the JSON string representation of the object
print(Paginator.to_json())

# convert the object into a dict
paginator_dict = paginator_instance.to_dict()
# create an instance of Paginator from a dict
paginator_from_dict = Paginator.from_dict(paginator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


