# InputFormatConfiguration

Specifies the deserializer you want to use to convert the format of the input data. This parameter is required if <code>Enabled</code> is set to true.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deserializer** | [**InputFormatConfigurationDeserializer**](InputFormatConfigurationDeserializer.md) |  | [optional] 

## Example

```python
from openapi_client.models.input_format_configuration import InputFormatConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of InputFormatConfiguration from a JSON string
input_format_configuration_instance = InputFormatConfiguration.from_json(json)
# print the JSON string representation of the object
print(InputFormatConfiguration.to_json())

# convert the object into a dict
input_format_configuration_dict = input_format_configuration_instance.to_dict()
# create an instance of InputFormatConfiguration from a dict
input_format_configuration_from_dict = InputFormatConfiguration.from_dict(input_format_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


