# LabelSearchResultItem

Label Search Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | **str** |  | 
**default** | **bool** |  | 
**description** | **str** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**score** | **float** |  | 
**text_matches** | [**List[SearchResultTextMatchesInner]**](SearchResultTextMatchesInner.md) |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.label_search_result_item import LabelSearchResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of LabelSearchResultItem from a JSON string
label_search_result_item_instance = LabelSearchResultItem.from_json(json)
# print the JSON string representation of the object
print(LabelSearchResultItem.to_json())

# convert the object into a dict
label_search_result_item_dict = label_search_result_item_instance.to_dict()
# create an instance of LabelSearchResultItem from a dict
label_search_result_item_from_dict = LabelSearchResultItem.from_dict(label_search_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


