# UntagResourceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag_keys** | **List[str]** | The keys of the tags that you want to remove from the resource. | [optional] 

## Example

```python
from openapi_client.models.untag_resource_request import UntagResourceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UntagResourceRequest from a JSON string
untag_resource_request_instance = UntagResourceRequest.from_json(json)
# print the JSON string representation of the object
print(UntagResourceRequest.to_json())

# convert the object into a dict
untag_resource_request_dict = untag_resource_request_instance.to_dict()
# create an instance of UntagResourceRequest from a dict
untag_resource_request_from_dict = UntagResourceRequest.from_dict(untag_resource_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


