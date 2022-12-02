# ExtendedS3DestinationConfigurationProcessingConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**processors** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_configuration_processing_configuration import ExtendedS3DestinationConfigurationProcessingConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationConfigurationProcessingConfiguration from a JSON string
extended_s3_destination_configuration_processing_configuration_instance = ExtendedS3DestinationConfigurationProcessingConfiguration.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationConfigurationProcessingConfiguration.to_json())

# convert the object into a dict
extended_s3_destination_configuration_processing_configuration_dict = extended_s3_destination_configuration_processing_configuration_instance.to_dict()
# create an instance of ExtendedS3DestinationConfigurationProcessingConfiguration from a dict
extended_s3_destination_configuration_processing_configuration_from_dict = ExtendedS3DestinationConfigurationProcessingConfiguration.from_dict(extended_s3_destination_configuration_processing_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


