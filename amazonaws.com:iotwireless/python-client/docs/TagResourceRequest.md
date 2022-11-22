# TagResourceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | 

## Example

```python
from openapi_client.models.tag_resource_request import TagResourceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TagResourceRequest from a JSON string
tag_resource_request_instance = TagResourceRequest.from_json(json)
# print the JSON string representation of the object
print(TagResourceRequest.to_json())

# convert the object into a dict
tag_resource_request_dict = tag_resource_request_instance.to_dict()
# create an instance of TagResourceRequest from a dict
tag_resource_request_from_dict = TagResourceRequest.from_dict(tag_resource_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


