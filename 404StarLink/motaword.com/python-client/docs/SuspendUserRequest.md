# SuspendUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | Suspension reason for vendor | [optional] 

## Example

```python
from openapi_client.models.suspend_user_request import SuspendUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SuspendUserRequest from a JSON string
suspend_user_request_instance = SuspendUserRequest.from_json(json)
# print the JSON string representation of the object
print(SuspendUserRequest.to_json())

# convert the object into a dict
suspend_user_request_dict = suspend_user_request_instance.to_dict()
# create an instance of SuspendUserRequest from a dict
suspend_user_request_from_dict = SuspendUserRequest.from_dict(suspend_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


