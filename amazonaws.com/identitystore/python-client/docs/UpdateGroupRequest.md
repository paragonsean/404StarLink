# UpdateGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 
**operations** | **List** |  | 

## Example

```python
from openapi_client.models.update_group_request import UpdateGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGroupRequest from a JSON string
update_group_request_instance = UpdateGroupRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateGroupRequest.to_json())

# convert the object into a dict
update_group_request_dict = update_group_request_instance.to_dict()
# create an instance of UpdateGroupRequest from a dict
update_group_request_from_dict = UpdateGroupRequest.from_dict(update_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


