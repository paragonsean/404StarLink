# RunBuildTriggerRequest

Specifies a build trigger to run and the source to use.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** | Required. ID of the project. | [optional] 
**source** | [**RepoSource**](RepoSource.md) |  | [optional] 
**trigger_id** | **str** | Required. ID of the trigger. | [optional] 

## Example

```python
from openapi_client.models.run_build_trigger_request import RunBuildTriggerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RunBuildTriggerRequest from a JSON string
run_build_trigger_request_instance = RunBuildTriggerRequest.from_json(json)
# print the JSON string representation of the object
print(RunBuildTriggerRequest.to_json())

# convert the object into a dict
run_build_trigger_request_dict = run_build_trigger_request_instance.to_dict()
# create an instance of RunBuildTriggerRequest from a dict
run_build_trigger_request_from_dict = RunBuildTriggerRequest.from_dict(run_build_trigger_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


