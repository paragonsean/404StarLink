# CancelBuildRequest

Request to cancel an ongoing build.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Required. ID of the build. | [optional] 
**name** | **str** | The name of the &#x60;Build&#x60; to cancel. Format: &#x60;projects/{project}/locations/{location}/builds/{build}&#x60; | [optional] 
**project_id** | **str** | Required. ID of the project. | [optional] 

## Example

```python
from openapi_client.models.cancel_build_request import CancelBuildRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CancelBuildRequest from a JSON string
cancel_build_request_instance = CancelBuildRequest.from_json(json)
# print the JSON string representation of the object
print(CancelBuildRequest.to_json())

# convert the object into a dict
cancel_build_request_dict = cancel_build_request_instance.to_dict()
# create an instance of CancelBuildRequest from a dict
cancel_build_request_from_dict = CancelBuildRequest.from_dict(cancel_build_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


