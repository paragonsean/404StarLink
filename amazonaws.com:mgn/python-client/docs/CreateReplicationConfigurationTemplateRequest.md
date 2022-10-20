# CreateReplicationConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associate_default_security_group** | **bool** | Request to associate the default Application Migration Service Security group with the Replication Settings template. | 
**bandwidth_throttling** | **int** | Request to configure bandwidth throttling during Replication Settings template creation. | 
**create_public_ip** | **bool** | Request to create Public IP during Replication Settings template creation. | 
**data_plane_routing** | **str** | Request to configure data plane routing during Replication Settings template creation. | 
**default_large_staging_disk_type** | **str** | Request to configure the default large staging disk EBS volume type during Replication Settings template creation. | 
**ebs_encryption** | **str** | Request to configure EBS encryption during Replication Settings template creation. | 
**ebs_encryption_key_arn** | **str** | Request to configure an EBS encryption key during Replication Settings template creation. | [optional] 
**replication_server_instance_type** | **str** | Request to configure the Replication Server instance type during Replication Settings template creation. | 
**replication_servers_security_groups_ids** | **List[str]** | Request to configure the Replication Server Security group ID during Replication Settings template creation. | 
**staging_area_subnet_id** | **str** | Request to configure the Staging Area subnet ID during Replication Settings template creation. | 
**staging_area_tags** | **Dict[str, str]** | Request to configure Staging Area tags during Replication Settings template creation. | 
**tags** | **Dict[str, str]** | Request to configure tags during Replication Settings template creation. | [optional] 
**use_dedicated_replication_server** | **bool** | Request to use Dedicated Replication Servers during Replication Settings template creation. | 

## Example

```python
from openapi_client.models.create_replication_configuration_template_request import CreateReplicationConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateReplicationConfigurationTemplateRequest from a JSON string
create_replication_configuration_template_request_instance = CreateReplicationConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreateReplicationConfigurationTemplateRequest.to_json())

# convert the object into a dict
create_replication_configuration_template_request_dict = create_replication_configuration_template_request_instance.to_dict()
# create an instance of CreateReplicationConfigurationTemplateRequest from a dict
create_replication_configuration_template_request_from_dict = CreateReplicationConfigurationTemplateRequest.from_dict(create_replication_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


