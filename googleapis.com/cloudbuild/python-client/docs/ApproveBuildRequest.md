# ApproveBuildRequest

Request to approve or reject a pending build.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approval_result** | [**ApprovalResult**](ApprovalResult.md) |  | [optional] 

## Example

```python
from openapi_client.models.approve_build_request import ApproveBuildRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ApproveBuildRequest from a JSON string
approve_build_request_instance = ApproveBuildRequest.from_json(json)
# print the JSON string representation of the object
print(ApproveBuildRequest.to_json())

# convert the object into a dict
approve_build_request_dict = approve_build_request_instance.to_dict()
# create an instance of ApproveBuildRequest from a dict
approve_build_request_from_dict = ApproveBuildRequest.from_dict(approve_build_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


