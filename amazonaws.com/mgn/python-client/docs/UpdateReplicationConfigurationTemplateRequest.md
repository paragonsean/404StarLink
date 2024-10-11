# UpdateReplicationConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | Update replication configuration template ARN request. | [optional] 
**associate_default_security_group** | **bool** | Update replication configuration template associate default Application Migration Service Security group request. | [optional] 
**bandwidth_throttling** | **int** | Update replication configuration template bandwidth throttling request. | [optional] 
**create_public_ip** | **bool** | Update replication configuration template create Public IP request. | [optional] 
**data_plane_routing** | **str** | Update replication configuration template data plane routing request. | [optional] 
**default_large_staging_disk_type** | **str** | Update replication configuration template use default large Staging Disk type request. | [optional] 
**ebs_encryption** | **str** | Update replication configuration template EBS encryption request. | [optional] 
**ebs_encryption_key_arn** | **str** | Update replication configuration template EBS encryption key ARN request. | [optional] 
**replication_configuration_template_id** | **str** | Update replication configuration template template ID request. | 
**replication_server_instance_type** | **str** | Update replication configuration template Replication Server instance type request. | [optional] 
**replication_servers_security_groups_ids** | **List[str]** | Update replication configuration template Replication Server Security groups IDs request. | [optional] 
**staging_area_subnet_id** | **str** | Update replication configuration template Staging Area subnet ID request. | [optional] 
**staging_area_tags** | **Dict[str, str]** | Update replication configuration template Staging Area Tags request. | [optional] 
**use_dedicated_replication_server** | **bool** | Update replication configuration template use dedicated Replication Server request. | [optional] 

## Example

```python
from openapi_client.models.update_replication_configuration_template_request import UpdateReplicationConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateReplicationConfigurationTemplateRequest from a JSON string
update_replication_configuration_template_request_instance = UpdateReplicationConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateReplicationConfigurationTemplateRequest.to_json())

# convert the object into a dict
update_replication_configuration_template_request_dict = update_replication_configuration_template_request_instance.to_dict()
# create an instance of UpdateReplicationConfigurationTemplateRequest from a dict
update_replication_configuration_template_request_from_dict = UpdateReplicationConfigurationTemplateRequest.from_dict(update_replication_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


