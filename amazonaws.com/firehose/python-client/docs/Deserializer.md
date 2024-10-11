# Deserializer

The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON. Kinesis Data Firehose then serializes the data to its final format using the <a>Serializer</a>. Kinesis Data Firehose supports two types of deserializers: the <a href=\"https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON\">Apache Hive JSON SerDe</a> and the <a href=\"https://github.com/rcongiu/Hive-JSON-Serde\">OpenX JSON SerDe</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**open_x_json_ser_de** | [**DeserializerOpenXJsonSerDe**](DeserializerOpenXJsonSerDe.md) |  | [optional] 
**hive_json_ser_de** | [**DeserializerHiveJsonSerDe**](DeserializerHiveJsonSerDe.md) |  | [optional] 

## Example

```python
from openapi_client.models.deserializer import Deserializer

# TODO update the JSON string below
json = "{}"
# create an instance of Deserializer from a JSON string
deserializer_instance = Deserializer.from_json(json)
# print the JSON string representation of the object
print(Deserializer.to_json())

# convert the object into a dict
deserializer_dict = deserializer_instance.to_dict()
# create an instance of Deserializer from a dict
deserializer_from_dict = Deserializer.from_dict(deserializer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


