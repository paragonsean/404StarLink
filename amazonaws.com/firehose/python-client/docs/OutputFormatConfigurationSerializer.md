# OutputFormatConfigurationSerializer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parquet_ser_de** | [**SerializerParquetSerDe**](SerializerParquetSerDe.md) |  | [optional] 
**orc_ser_de** | [**SerializerOrcSerDe**](SerializerOrcSerDe.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_format_configuration_serializer import OutputFormatConfigurationSerializer

# TODO update the JSON string below
json = "{}"
# create an instance of OutputFormatConfigurationSerializer from a JSON string
output_format_configuration_serializer_instance = OutputFormatConfigurationSerializer.from_json(json)
# print the JSON string representation of the object
print(OutputFormatConfigurationSerializer.to_json())

# convert the object into a dict
output_format_configuration_serializer_dict = output_format_configuration_serializer_instance.to_dict()
# create an instance of OutputFormatConfigurationSerializer from a dict
output_format_configuration_serializer_from_dict = OutputFormatConfigurationSerializer.from_dict(output_format_configuration_serializer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


