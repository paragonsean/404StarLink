# RetryBuildRequest

Specifies a build to retry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Required. Build ID of the original build. | [optional] 
**name** | **str** | The name of the &#x60;Build&#x60; to retry. Format: &#x60;projects/{project}/locations/{location}/builds/{build}&#x60; | [optional] 
**project_id** | **str** | Required. ID of the project. | [optional] 

## Example

```python
from openapi_client.models.retry_build_request import RetryBuildRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RetryBuildRequest from a JSON string
retry_build_request_instance = RetryBuildRequest.from_json(json)
# print the JSON string representation of the object
print(RetryBuildRequest.to_json())

# convert the object into a dict
retry_build_request_dict = retry_build_request_instance.to_dict()
# create an instance of RetryBuildRequest from a dict
retry_build_request_from_dict = RetryBuildRequest.from_dict(retry_build_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


