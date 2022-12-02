# OrcSerDe

A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see <a href=\"https://orc.apache.org/docs/\">Apache ORC</a>.

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
from openapi_client.models.orc_ser_de import OrcSerDe

# TODO update the JSON string below
json = "{}"
# create an instance of OrcSerDe from a JSON string
orc_ser_de_instance = OrcSerDe.from_json(json)
# print the JSON string representation of the object
print(OrcSerDe.to_json())

# convert the object into a dict
orc_ser_de_dict = orc_ser_de_instance.to_dict()
# create an instance of OrcSerDe from a dict
orc_ser_de_from_dict = OrcSerDe.from_dict(orc_ser_de_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


