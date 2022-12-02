# ElasticsearchDestinationDescriptionVpcConfigurationDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnet_ids** | **List** |  | 
**role_arn** | **str** |  | 
**security_group_ids** | **List** |  | 
**vpc_id** | **str** |  | 

## Example

```python
from openapi_client.models.elasticsearch_destination_description_vpc_configuration_description import ElasticsearchDestinationDescriptionVpcConfigurationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationDescriptionVpcConfigurationDescription from a JSON string
elasticsearch_destination_description_vpc_configuration_description_instance = ElasticsearchDestinationDescriptionVpcConfigurationDescription.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationDescriptionVpcConfigurationDescription.to_json())

# convert the object into a dict
elasticsearch_destination_description_vpc_configuration_description_dict = elasticsearch_destination_description_vpc_configuration_description_instance.to_dict()
# create an instance of ElasticsearchDestinationDescriptionVpcConfigurationDescription from a dict
elasticsearch_destination_description_vpc_configuration_description_from_dict = ElasticsearchDestinationDescriptionVpcConfigurationDescription.from_dict(elasticsearch_destination_description_vpc_configuration_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


