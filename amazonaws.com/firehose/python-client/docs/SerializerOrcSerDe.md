# SerializerOrcSerDe


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stripe_size_bytes** | **int** |  | [optional] 
**block_size_bytes** | **int** |  | [optional] 
**row_index_stride** | **int** |  | [optional] 
**enable_padding** | **bool** |  | [optional] 
**padding_tolerance** | **float** |  | [optional] 
**compression** | [**OrcCompression**](OrcCompression.md) |  | [optional] 
**bloom_filter_columns** | **List** |  | [optional] 
**bloom_filter_false_positive_probability** | **float** |  | [optional] 
**dictionary_key_threshold** | **float** |  | [optional] 
**format_version** | [**OrcFormatVersion**](OrcFormatVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.serializer_orc_ser_de import SerializerOrcSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of SerializerOrcSerDe from a JSON string
serializer_orc_ser_de_instance = SerializerOrcSerDe.from_json(json)
# print the JSON string representation of the object
print(SerializerOrcSerDe.to_json())

# convert the object into a dict
serializer_orc_ser_de_dict = serializer_orc_ser_de_instance.to_dict()
# create an instance of SerializerOrcSerDe from a dict
serializer_orc_ser_de_from_dict = SerializerOrcSerDe.from_dict(serializer_orc_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


