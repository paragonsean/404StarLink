# DescribeReplicationConfigurationTemplatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_results** | **int** | Request to describe Replication Configuration template by max results. | [optional] 
**next_token** | **str** | Request to describe Replication Configuration template by next token. | [optional] 
**replication_configuration_template_ids** | **List[str]** | Request to describe Replication Configuration template by template IDs. | [optional] 

## Example

```python
from openapi_client.models.describe_replication_configuration_templates_request import DescribeReplicationConfigurationTemplatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeReplicationConfigurationTemplatesRequest from a JSON string
describe_replication_configuration_templates_request_instance = DescribeReplicationConfigurationTemplatesRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeReplicationConfigurationTemplatesRequest.to_json())

# convert the object into a dict
describe_replication_configuration_templates_request_dict = describe_replication_configuration_templates_request_instance.to_dict()
# create an instance of DescribeReplicationConfigurationTemplatesRequest from a dict
describe_replication_configuration_templates_request_from_dict = DescribeReplicationConfigurationTemplatesRequest.from_dict(describe_replication_configuration_templates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


