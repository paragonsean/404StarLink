# ProjectLaunchResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ProjectLaunchResponseEnum**](ProjectLaunchResponseEnum.md) |  | [optional] 

## Example

```python
from openapi_client.models.project_launch_response import ProjectLaunchResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectLaunchResponse from a JSON string
project_launch_response_instance = ProjectLaunchResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectLaunchResponse.to_json())

# convert the object into a dict
project_launch_response_dict = project_launch_response_instance.to_dict()
# create an instance of ProjectLaunchResponse from a dict
project_launch_response_from_dict = ProjectLaunchResponse.from_dict(project_launch_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


