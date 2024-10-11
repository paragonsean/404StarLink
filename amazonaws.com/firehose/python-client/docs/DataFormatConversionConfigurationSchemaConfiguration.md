# DataFormatConversionConfigurationSchemaConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**catalog_id** | **str** |  | [optional] 
**database_name** | **str** |  | [optional] 
**table_name** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**version_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.data_format_conversion_configuration_schema_configuration import DataFormatConversionConfigurationSchemaConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DataFormatConversionConfigurationSchemaConfiguration from a JSON string
data_format_conversion_configuration_schema_configuration_instance = DataFormatConversionConfigurationSchemaConfiguration.from_json(json)
# print the JSON string representation of the object
print(DataFormatConversionConfigurationSchemaConfiguration.to_json())

# convert the object into a dict
data_format_conversion_configuration_schema_configuration_dict = data_format_conversion_configuration_schema_configuration_instance.to_dict()
# create an instance of DataFormatConversionConfigurationSchemaConfiguration from a dict
data_format_conversion_configuration_schema_configuration_from_dict = DataFormatConversionConfigurationSchemaConfiguration.from_dict(data_format_conversion_configuration_schema_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


