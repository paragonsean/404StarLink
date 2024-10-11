# AmazonopensearchserviceDestinationConfigurationBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_in_seconds** | **int** |  | [optional] 
**size_in_mbs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.amazonopensearchservice_destination_configuration_buffering_hints import AmazonopensearchserviceDestinationConfigurationBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonopensearchserviceDestinationConfigurationBufferingHints from a JSON string
amazonopensearchservice_destination_configuration_buffering_hints_instance = AmazonopensearchserviceDestinationConfigurationBufferingHints.from_json(json)
# print the JSON string representation of the object
print(AmazonopensearchserviceDestinationConfigurationBufferingHints.to_json())

# convert the object into a dict
amazonopensearchservice_destination_configuration_buffering_hints_dict = amazonopensearchservice_destination_configuration_buffering_hints_instance.to_dict()
# create an instance of AmazonopensearchserviceDestinationConfigurationBufferingHints from a dict
amazonopensearchservice_destination_configuration_buffering_hints_from_dict = AmazonopensearchserviceDestinationConfigurationBufferingHints.from_dict(amazonopensearchservice_destination_configuration_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


