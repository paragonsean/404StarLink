# LaunchedInstance

Launched instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ec2_instance_id** | **str** |  | [optional] 
**first_boot** | [**FirstBoot**](FirstBoot.md) |  | [optional] 
**job_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.launched_instance import LaunchedInstance

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchedInstance from a JSON string
launched_instance_instance = LaunchedInstance.from_json(json)
# print the JSON string representation of the object
print(LaunchedInstance.to_json())

# convert the object into a dict
launched_instance_dict = launched_instance_instance.to_dict()
# create an instance of LaunchedInstance from a dict
launched_instance_from_dict = LaunchedInstance.from_dict(launched_instance_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


