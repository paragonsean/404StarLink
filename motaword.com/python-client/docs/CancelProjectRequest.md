# CancelProjectRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | Cancellation reason | [optional] 

## Example

```python
from openapi_client.models.cancel_project_request import CancelProjectRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CancelProjectRequest from a JSON string
cancel_project_request_instance = CancelProjectRequest.from_json(json)
# print the JSON string representation of the object
print(CancelProjectRequest.to_json())

# convert the object into a dict
cancel_project_request_dict = cancel_project_request_instance.to_dict()
# create an instance of CancelProjectRequest from a dict
cancel_project_request_from_dict = CancelProjectRequest.from_dict(cancel_project_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


