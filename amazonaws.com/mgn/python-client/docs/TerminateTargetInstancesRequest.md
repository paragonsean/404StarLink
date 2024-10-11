# TerminateTargetInstancesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_ids** | **List[str]** | Terminate Target instance by Source Server IDs. | 
**tags** | **Dict[str, str]** | Terminate Target instance by Tags. | [optional] 

## Example

```python
from openapi_client.models.terminate_target_instances_request import TerminateTargetInstancesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TerminateTargetInstancesRequest from a JSON string
terminate_target_instances_request_instance = TerminateTargetInstancesRequest.from_json(json)
# print the JSON string representation of the object
print(TerminateTargetInstancesRequest.to_json())

# convert the object into a dict
terminate_target_instances_request_dict = terminate_target_instances_request_instance.to_dict()
# create an instance of TerminateTargetInstancesRequest from a dict
terminate_target_instances_request_from_dict = TerminateTargetInstancesRequest.from_dict(terminate_target_instances_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


