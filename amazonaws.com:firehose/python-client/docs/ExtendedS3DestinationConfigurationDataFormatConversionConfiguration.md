# ExtendedS3DestinationConfigurationDataFormatConversionConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema_configuration** | [**DataFormatConversionConfigurationSchemaConfiguration**](DataFormatConversionConfigurationSchemaConfiguration.md) |  | [optional] 
**input_format_configuration** | [**DataFormatConversionConfigurationInputFormatConfiguration**](DataFormatConversionConfigurationInputFormatConfiguration.md) |  | [optional] 
**output_format_configuration** | [**DataFormatConversionConfigurationOutputFormatConfiguration**](DataFormatConversionConfigurationOutputFormatConfiguration.md) |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_configuration_data_format_conversion_configuration import ExtendedS3DestinationConfigurationDataFormatConversionConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationConfigurationDataFormatConversionConfiguration from a JSON string
extended_s3_destination_configuration_data_format_conversion_configuration_instance = ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.to_json())

# convert the object into a dict
extended_s3_destination_configuration_data_format_conversion_configuration_dict = extended_s3_destination_configuration_data_format_conversion_configuration_instance.to_dict()
# create an instance of ExtendedS3DestinationConfigurationDataFormatConversionConfiguration from a dict
extended_s3_destination_configuration_data_format_conversion_configuration_from_dict = ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.from_dict(extended_s3_destination_configuration_data_format_conversion_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


