# SourceServerLaunchedInstance


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ec2_instance_id** | **str** |  | [optional] 
**first_boot** | [**FirstBoot**](FirstBoot.md) |  | [optional] 
**job_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.source_server_launched_instance import SourceServerLaunchedInstance

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerLaunchedInstance from a JSON string
source_server_launched_instance_instance = SourceServerLaunchedInstance.from_json(json)
# print the JSON string representation of the object
print(SourceServerLaunchedInstance.to_json())

# convert the object into a dict
source_server_launched_instance_dict = source_server_launched_instance_instance.to_dict()
# create an instance of SourceServerLaunchedInstance from a dict
source_server_launched_instance_from_dict = SourceServerLaunchedInstance.from_dict(source_server_launched_instance_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


