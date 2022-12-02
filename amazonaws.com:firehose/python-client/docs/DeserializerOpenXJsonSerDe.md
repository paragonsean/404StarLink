# DeserializerOpenXJsonSerDe


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert_dots_in_json_keys_to_underscores** | **bool** |  | [optional] 
**case_insensitive** | **bool** |  | [optional] 
**column_to_json_key_mappings** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.deserializer_open_x_json_ser_de import DeserializerOpenXJsonSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of DeserializerOpenXJsonSerDe from a JSON string
deserializer_open_x_json_ser_de_instance = DeserializerOpenXJsonSerDe.from_json(json)
# print the JSON string representation of the object
print(DeserializerOpenXJsonSerDe.to_json())

# convert the object into a dict
deserializer_open_x_json_ser_de_dict = deserializer_open_x_json_ser_de_instance.to_dict()
# create an instance of DeserializerOpenXJsonSerDe from a dict
deserializer_open_x_json_ser_de_from_dict = DeserializerOpenXJsonSerDe.from_dict(deserializer_open_x_json_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


