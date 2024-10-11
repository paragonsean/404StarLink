# GetReplicationConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Request to get Replication Configuration by Source Server ID. | 

## Example

```python
from openapi_client.models.get_replication_configuration_request import GetReplicationConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetReplicationConfigurationRequest from a JSON string
get_replication_configuration_request_instance = GetReplicationConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(GetReplicationConfigurationRequest.to_json())

# convert the object into a dict
get_replication_configuration_request_dict = get_replication_configuration_request_instance.to_dict()
# create an instance of GetReplicationConfigurationRequest from a dict
get_replication_configuration_request_from_dict = GetReplicationConfigurationRequest.from_dict(get_replication_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


