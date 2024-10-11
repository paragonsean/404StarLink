# SerializerParquetSerDe


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block_size_bytes** | **int** |  | [optional] 
**page_size_bytes** | **int** |  | [optional] 
**compression** | [**ParquetCompression**](ParquetCompression.md) |  | [optional] 
**enable_dictionary_compression** | **bool** |  | [optional] 
**max_padding_bytes** | **int** |  | [optional] 
**writer_version** | [**ParquetWriterVersion**](ParquetWriterVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.serializer_parquet_ser_de import SerializerParquetSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of SerializerParquetSerDe from a JSON string
serializer_parquet_ser_de_instance = SerializerParquetSerDe.from_json(json)
# print the JSON string representation of the object
print(SerializerParquetSerDe.to_json())

# convert the object into a dict
serializer_parquet_ser_de_dict = serializer_parquet_ser_de_instance.to_dict()
# create an instance of SerializerParquetSerDe from a dict
serializer_parquet_ser_de_from_dict = SerializerParquetSerDe.from_dict(serializer_parquet_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


