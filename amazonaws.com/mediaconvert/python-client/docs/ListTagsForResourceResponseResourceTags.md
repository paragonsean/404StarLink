# ListTagsForResourceResponseResourceTags


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.list_tags_for_resource_response_resource_tags import ListTagsForResourceResponseResourceTags

# TODO update the JSON string below
json = "{}"
# create an instance of ListTagsForResourceResponseResourceTags from a JSON string
list_tags_for_resource_response_resource_tags_instance = ListTagsForResourceResponseResourceTags.from_json(json)
# print the JSON string representation of the object
print(ListTagsForResourceResponseResourceTags.to_json())

# convert the object into a dict
list_tags_for_resource_response_resource_tags_dict = list_tags_for_resource_response_resource_tags_instance.to_dict()
# create an instance of ListTagsForResourceResponseResourceTags from a dict
list_tags_for_resource_response_resource_tags_from_dict = ListTagsForResourceResponseResourceTags.from_dict(list_tags_for_resource_response_resource_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


