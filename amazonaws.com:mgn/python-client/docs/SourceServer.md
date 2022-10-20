# SourceServer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 
**data_replication_info** | [**SourceServerDataReplicationInfo**](SourceServerDataReplicationInfo.md) |  | [optional] 
**fqdn_for_action_framework** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**launched_instance** | [**SourceServerLaunchedInstance**](SourceServerLaunchedInstance.md) |  | [optional] 
**life_cycle** | [**SourceServerLifeCycle**](SourceServerLifeCycle.md) |  | [optional] 
**replication_type** | [**ReplicationType**](ReplicationType.md) |  | [optional] 
**source_properties** | [**SourceServerSourceProperties**](SourceServerSourceProperties.md) |  | [optional] 
**source_server_id** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**user_provided_id** | **str** |  | [optional] 
**vcenter_client_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.source_server import SourceServer

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServer from a JSON string
source_server_instance = SourceServer.from_json(json)
# print the JSON string representation of the object
print(SourceServer.to_json())

# convert the object into a dict
source_server_dict = source_server_instance.to_dict()
# create an instance of SourceServer from a dict
source_server_from_dict = SourceServer.from_dict(source_server_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


