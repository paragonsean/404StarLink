# DeleteReplicationConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replication_configuration_template_id** | **str** | Request to delete Replication Configuration Template from service by Replication Configuration Template ID. | 

## Example

```python
from openapi_client.models.delete_replication_configuration_template_request import DeleteReplicationConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteReplicationConfigurationTemplateRequest from a JSON string
delete_replication_configuration_template_request_instance = DeleteReplicationConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteReplicationConfigurationTemplateRequest.to_json())

# convert the object into a dict
delete_replication_configuration_template_request_dict = delete_replication_configuration_template_request_instance.to_dict()
# create an instance of DeleteReplicationConfigurationTemplateRequest from a dict
delete_replication_configuration_template_request_from_dict = DeleteReplicationConfigurationTemplateRequest.from_dict(delete_replication_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


