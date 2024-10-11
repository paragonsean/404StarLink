# ReplicationConfigurationTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**associate_default_security_group** | **bool** |  | [optional] 
**bandwidth_throttling** | **int** |  | [optional] 
**create_public_ip** | **bool** |  | [optional] 
**data_plane_routing** | [**ReplicationConfigurationDataPlaneRouting**](ReplicationConfigurationDataPlaneRouting.md) |  | [optional] 
**default_large_staging_disk_type** | [**ReplicationConfigurationDefaultLargeStagingDiskType**](ReplicationConfigurationDefaultLargeStagingDiskType.md) |  | [optional] 
**ebs_encryption** | [**ReplicationConfigurationEbsEncryption**](ReplicationConfigurationEbsEncryption.md) |  | [optional] 
**ebs_encryption_key_arn** | **str** |  | [optional] 
**replication_configuration_template_id** | **str** |  | 
**replication_server_instance_type** | **str** |  | [optional] 
**replication_servers_security_groups_ids** | **List** |  | [optional] 
**staging_area_subnet_id** | **str** |  | [optional] 
**staging_area_tags** | **Dict** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**use_dedicated_replication_server** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.replication_configuration_template import ReplicationConfigurationTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of ReplicationConfigurationTemplate from a JSON string
replication_configuration_template_instance = ReplicationConfigurationTemplate.from_json(json)
# print the JSON string representation of the object
print(ReplicationConfigurationTemplate.to_json())

# convert the object into a dict
replication_configuration_template_dict = replication_configuration_template_instance.to_dict()
# create an instance of ReplicationConfigurationTemplate from a dict
replication_configuration_template_from_dict = ReplicationConfigurationTemplate.from_dict(replication_configuration_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


