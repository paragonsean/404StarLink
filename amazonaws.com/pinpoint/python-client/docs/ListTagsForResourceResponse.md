# ListTagsForResourceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags_model** | [**TagsModel**](TagsModel.md) |  | 

## Example

```python
from openapi_client.models.list_tags_for_resource_response import ListTagsForResourceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTagsForResourceResponse from a JSON string
list_tags_for_resource_response_instance = ListTagsForResourceResponse.from_json(json)
# print the JSON string representation of the object
print(ListTagsForResourceResponse.to_json())

# convert the object into a dict
list_tags_for_resource_response_dict = list_tags_for_resource_response_instance.to_dict()
# create an instance of ListTagsForResourceResponse from a dict
list_tags_for_resource_response_from_dict = ListTagsForResourceResponse.from_dict(list_tags_for_resource_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


