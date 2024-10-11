# OpenXJsonSerDe

The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert_dots_in_json_keys_to_underscores** | **bool** |  | [optional] 
**case_insensitive** | **bool** |  | [optional] 
**column_to_json_key_mappings** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.open_x_json_ser_de import OpenXJsonSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of OpenXJsonSerDe from a JSON string
open_x_json_ser_de_instance = OpenXJsonSerDe.from_json(json)
# print the JSON string representation of the object
print(OpenXJsonSerDe.to_json())

# convert the object into a dict
open_x_json_ser_de_dict = open_x_json_ser_de_instance.to_dict()
# create an instance of OpenXJsonSerDe from a dict
open_x_json_ser_de_from_dict = OpenXJsonSerDe.from_dict(open_x_json_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


