# InputFormatConfigurationDeserializer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**open_x_json_ser_de** | [**DeserializerOpenXJsonSerDe**](DeserializerOpenXJsonSerDe.md) |  | [optional] 
**hive_json_ser_de** | [**DeserializerHiveJsonSerDe**](DeserializerHiveJsonSerDe.md) |  | [optional] 

## Example

```python
from openapi_client.models.input_format_configuration_deserializer import InputFormatConfigurationDeserializer

# TODO update the JSON string below
json = "{}"
# create an instance of InputFormatConfigurationDeserializer from a JSON string
input_format_configuration_deserializer_instance = InputFormatConfigurationDeserializer.from_json(json)
# print the JSON string representation of the object
print(InputFormatConfigurationDeserializer.to_json())

# convert the object into a dict
input_format_configuration_deserializer_dict = input_format_configuration_deserializer_instance.to_dict()
# create an instance of InputFormatConfigurationDeserializer from a dict
input_format_configuration_deserializer_from_dict = InputFormatConfigurationDeserializer.from_dict(input_format_configuration_deserializer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


