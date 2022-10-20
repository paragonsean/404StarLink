# ReplicationConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associate_default_security_group** | **bool** |  | [optional] 
**bandwidth_throttling** | **int** |  | [optional] 
**create_public_ip** | **bool** |  | [optional] 
**data_plane_routing** | [**ReplicationConfigurationDataPlaneRouting**](ReplicationConfigurationDataPlaneRouting.md) |  | [optional] 
**default_large_staging_disk_type** | [**ReplicationConfigurationDefaultLargeStagingDiskType**](ReplicationConfigurationDefaultLargeStagingDiskType.md) |  | [optional] 
**ebs_encryption** | [**ReplicationConfigurationEbsEncryption**](ReplicationConfigurationEbsEncryption.md) |  | [optional] 
**ebs_encryption_key_arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**replicated_disks** | **List** |  | [optional] 
**replication_server_instance_type** | **str** |  | [optional] 
**replication_servers_security_groups_ids** | **List** |  | [optional] 
**source_server_id** | **str** |  | [optional] 
**staging_area_subnet_id** | **str** |  | [optional] 
**staging_area_tags** | **Dict** |  | [optional] 
**use_dedicated_replication_server** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.replication_configuration import ReplicationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ReplicationConfiguration from a JSON string
replication_configuration_instance = ReplicationConfiguration.from_json(json)
# print the JSON string representation of the object
print(ReplicationConfiguration.to_json())

# convert the object into a dict
replication_configuration_dict = replication_configuration_instance.to_dict()
# create an instance of ReplicationConfiguration from a dict
replication_configuration_from_dict = ReplicationConfiguration.from_dict(replication_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


