# ElasticsearchDestinationConfigurationVpcConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnet_ids** | **List** |  | 
**role_arn** | **str** |  | 
**security_group_ids** | **List** |  | 

## Example

```python
from openapi_client.models.elasticsearch_destination_configuration_vpc_configuration import ElasticsearchDestinationConfigurationVpcConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationConfigurationVpcConfiguration from a JSON string
elasticsearch_destination_configuration_vpc_configuration_instance = ElasticsearchDestinationConfigurationVpcConfiguration.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationConfigurationVpcConfiguration.to_json())

# convert the object into a dict
elasticsearch_destination_configuration_vpc_configuration_dict = elasticsearch_destination_configuration_vpc_configuration_instance.to_dict()
# create an instance of ElasticsearchDestinationConfigurationVpcConfiguration from a dict
elasticsearch_destination_configuration_vpc_configuration_from_dict = ElasticsearchDestinationConfigurationVpcConfiguration.from_dict(elasticsearch_destination_configuration_vpc_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


