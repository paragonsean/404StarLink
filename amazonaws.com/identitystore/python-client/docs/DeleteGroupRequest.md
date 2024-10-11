# DeleteGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 

## Example

```python
from openapi_client.models.delete_group_request import DeleteGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteGroupRequest from a JSON string
delete_group_request_instance = DeleteGroupRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteGroupRequest.to_json())

# convert the object into a dict
delete_group_request_dict = delete_group_request_instance.to_dict()
# create an instance of DeleteGroupRequest from a dict
delete_group_request_from_dict = DeleteGroupRequest.from_dict(delete_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


