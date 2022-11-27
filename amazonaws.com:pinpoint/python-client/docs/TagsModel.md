# TagsModel

Specifies the tags (keys and values) for an application, campaign, message template, or segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Dict** |  | 

## Example

```python
from openapi_client.models.tags_model import TagsModel

# TODO update the JSON string below
json = "{}"
# create an instance of TagsModel from a JSON string
tags_model_instance = TagsModel.from_json(json)
# print the JSON string representation of the object
print(TagsModel.to_json())

# convert the object into a dict
tags_model_dict = tags_model_instance.to_dict()
# create an instance of TagsModel from a dict
tags_model_from_dict = TagsModel.from_dict(tags_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


