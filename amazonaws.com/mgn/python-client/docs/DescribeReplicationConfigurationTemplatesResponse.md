# DescribeReplicationConfigurationTemplatesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_replication_configuration_templates_response import DescribeReplicationConfigurationTemplatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeReplicationConfigurationTemplatesResponse from a JSON string
describe_replication_configuration_templates_response_instance = DescribeReplicationConfigurationTemplatesResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeReplicationConfigurationTemplatesResponse.to_json())

# convert the object into a dict
describe_replication_configuration_templates_response_dict = describe_replication_configuration_templates_response_instance.to_dict()
# create an instance of DescribeReplicationConfigurationTemplatesResponse from a dict
describe_replication_configuration_templates_response_from_dict = DescribeReplicationConfigurationTemplatesResponse.from_dict(describe_replication_configuration_templates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


