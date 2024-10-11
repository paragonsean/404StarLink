# TagResourceRequestTagsModel

Specifies the tags (keys and values) for an application, campaign, message template, or segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.tag_resource_request_tags_model import TagResourceRequestTagsModel

# TODO update the JSON string below
json = "{}"
# create an instance of TagResourceRequestTagsModel from a JSON string
tag_resource_request_tags_model_instance = TagResourceRequestTagsModel.from_json(json)
# print the JSON string representation of the object
print(TagResourceRequestTagsModel.to_json())

# convert the object into a dict
tag_resource_request_tags_model_dict = tag_resource_request_tags_model_instance.to_dict()
# create an instance of TagResourceRequestTagsModel from a dict
tag_resource_request_tags_model_from_dict = TagResourceRequestTagsModel.from_dict(tag_resource_request_tags_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


