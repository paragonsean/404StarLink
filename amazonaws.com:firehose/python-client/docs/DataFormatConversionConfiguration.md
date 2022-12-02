# DataFormatConversionConfiguration

Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the column information from the Amazon Web Services Glue table, to deserialize your input data from JSON and then serialize it to the Parquet or ORC format. For more information, see <a href=\"https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html\">Kinesis Data Firehose Record Format Conversion</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema_configuration** | [**DataFormatConversionConfigurationSchemaConfiguration**](DataFormatConversionConfigurationSchemaConfiguration.md) |  | [optional] 
**input_format_configuration** | [**DataFormatConversionConfigurationInputFormatConfiguration**](DataFormatConversionConfigurationInputFormatConfiguration.md) |  | [optional] 
**output_format_configuration** | [**DataFormatConversionConfigurationOutputFormatConfiguration**](DataFormatConversionConfigurationOutputFormatConfiguration.md) |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.data_format_conversion_configuration import DataFormatConversionConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DataFormatConversionConfiguration from a JSON string
data_format_conversion_configuration_instance = DataFormatConversionConfiguration.from_json(json)
# print the JSON string representation of the object
print(DataFormatConversionConfiguration.to_json())

# convert the object into a dict
data_format_conversion_configuration_dict = data_format_conversion_configuration_instance.to_dict()
# create an instance of DataFormatConversionConfiguration from a dict
data_format_conversion_configuration_from_dict = DataFormatConversionConfiguration.from_dict(data_format_conversion_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


