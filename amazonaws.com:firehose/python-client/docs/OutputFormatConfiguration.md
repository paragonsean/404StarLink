# OutputFormatConfiguration

Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data before it writes it to Amazon S3. This parameter is required if <code>Enabled</code> is set to true.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serializer** | [**OutputFormatConfigurationSerializer**](OutputFormatConfigurationSerializer.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_format_configuration import OutputFormatConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of OutputFormatConfiguration from a JSON string
output_format_configuration_instance = OutputFormatConfiguration.from_json(json)
# print the JSON string representation of the object
print(OutputFormatConfiguration.to_json())

# convert the object into a dict
output_format_configuration_dict = output_format_configuration_instance.to_dict()
# create an instance of OutputFormatConfiguration from a dict
output_format_configuration_from_dict = OutputFormatConfiguration.from_dict(output_format_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


