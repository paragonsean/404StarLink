# HiveJsonSerDe

The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp_formats** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.hive_json_ser_de import HiveJsonSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of HiveJsonSerDe from a JSON string
hive_json_ser_de_instance = HiveJsonSerDe.from_json(json)
# print the JSON string representation of the object
print(HiveJsonSerDe.to_json())

# convert the object into a dict
hive_json_ser_de_dict = hive_json_ser_de_instance.to_dict()
# create an instance of HiveJsonSerDe from a dict
hive_json_ser_de_from_dict = HiveJsonSerDe.from_dict(hive_json_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


