# GlobalIdentity

Global identity information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lac** | **int** |  | 
**geran_cid** | **int** |  | 

## Example

```python
from openapi_client.models.global_identity import GlobalIdentity

# TODO update the JSON string below
json = "{}"
# create an instance of GlobalIdentity from a JSON string
global_identity_instance = GlobalIdentity.from_json(json)
# print the JSON string representation of the object
print(GlobalIdentity.to_json())

# convert the object into a dict
global_identity_dict = global_identity_instance.to_dict()
# create an instance of GlobalIdentity from a dict
global_identity_from_dict = GlobalIdentity.from_dict(global_identity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


