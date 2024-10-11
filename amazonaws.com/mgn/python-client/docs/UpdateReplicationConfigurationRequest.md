# UpdateReplicationConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associate_default_security_group** | **bool** | Update replication configuration associate default Application Migration Service Security group request. | [optional] 
**bandwidth_throttling** | **int** | Update replication configuration bandwidth throttling request. | [optional] 
**create_public_ip** | **bool** | Update replication configuration create Public IP request. | [optional] 
**data_plane_routing** | **str** | Update replication configuration data plane routing request. | [optional] 
**default_large_staging_disk_type** | **str** | Update replication configuration use default large Staging Disk type request. | [optional] 
**ebs_encryption** | **str** | Update replication configuration EBS encryption request. | [optional] 
**ebs_encryption_key_arn** | **str** | Update replication configuration EBS encryption key ARN request. | [optional] 
**name** | **str** | Update replication configuration name request. | [optional] 
**replicated_disks** | [**List[ReplicationConfigurationReplicatedDisk]**](ReplicationConfigurationReplicatedDisk.md) | Update replication configuration replicated disks request. | [optional] 
**replication_server_instance_type** | **str** | Update replication configuration Replication Server instance type request. | [optional] 
**replication_servers_security_groups_ids** | **List[str]** | Update replication configuration Replication Server Security Groups IDs request. | [optional] 
**source_server_id** | **str** | Update replication configuration Source Server ID request. | 
**staging_area_subnet_id** | **str** | Update replication configuration Staging Area subnet request. | [optional] 
**staging_area_tags** | **Dict[str, str]** | Update replication configuration Staging Area Tags request. | [optional] 
**use_dedicated_replication_server** | **bool** | Update replication configuration use dedicated Replication Server request. | [optional] 

## Example

```python
from openapi_client.models.update_replication_configuration_request import UpdateReplicationConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateReplicationConfigurationRequest from a JSON string
update_replication_configuration_request_instance = UpdateReplicationConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateReplicationConfigurationRequest.to_json())

# convert the object into a dict
update_replication_configuration_request_dict = update_replication_configuration_request_instance.to_dict()
# create an instance of UpdateReplicationConfigurationRequest from a dict
update_replication_configuration_request_from_dict = UpdateReplicationConfigurationRequest.from_dict(update_replication_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


