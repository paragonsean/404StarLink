# TopicSearchResultItem

Topic Search Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List[TopicSearchResultItemAliasesInner]**](TopicSearchResultItemAliasesInner.md) |  | [optional] 
**created_at** | **datetime** |  | 
**created_by** | **str** |  | 
**curated** | **bool** |  | 
**description** | **str** |  | 
**display_name** | **str** |  | 
**featured** | **bool** |  | 
**logo_url** | **str** |  | [optional] 
**name** | **str** |  | 
**related** | [**List[TopicSearchResultItemAliasesInner]**](TopicSearchResultItemAliasesInner.md) |  | [optional] 
**released** | **str** |  | 
**repository_count** | **int** |  | [optional] 
**score** | **float** |  | 
**short_description** | **str** |  | 
**text_matches** | [**List[SearchResultTextMatchesInner]**](SearchResultTextMatchesInner.md) |  | [optional] 
**updated_at** | **datetime** |  | 

## Example

```python
from openapi_client.models.topic_search_result_item import TopicSearchResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of TopicSearchResultItem from a JSON string
topic_search_result_item_instance = TopicSearchResultItem.from_json(json)
# print the JSON string representation of the object
print(TopicSearchResultItem.to_json())

# convert the object into a dict
topic_search_result_item_dict = topic_search_result_item_instance.to_dict()
# create an instance of TopicSearchResultItem from a dict
topic_search_result_item_from_dict = TopicSearchResultItem.from_dict(topic_search_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


