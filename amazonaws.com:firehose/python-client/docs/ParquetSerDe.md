# ParquetSerDe

A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see <a href=\"https://parquet.apache.org/documentation/latest/\">Apache Parquet</a>.

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
from openapi_client.models.parquet_ser_de import ParquetSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of ParquetSerDe from a JSON string
parquet_ser_de_instance = ParquetSerDe.from_json(json)
# print the JSON string representation of the object
print(ParquetSerDe.to_json())

# convert the object into a dict
parquet_ser_de_dict = parquet_ser_de_instance.to_dict()
# create an instance of ParquetSerDe from a dict
parquet_ser_de_from_dict = ParquetSerDe.from_dict(parquet_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


