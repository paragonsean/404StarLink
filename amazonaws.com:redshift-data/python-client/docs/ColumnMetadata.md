# ColumnMetadata

The properties (metadata) of a column. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column_default** | **str** |  | [optional] 
**is_case_sensitive** | **bool** |  | [optional] 
**is_currency** | **bool** |  | [optional] 
**is_signed** | **bool** |  | [optional] 
**label** | **str** |  | [optional] 
**length** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**nullable** | **int** |  | [optional] 
**precision** | **int** |  | [optional] 
**scale** | **int** |  | [optional] 
**schema_name** | **str** |  | [optional] 
**table_name** | **str** |  | [optional] 
**type_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.column_metadata import ColumnMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of ColumnMetadata from a JSON string
column_metadata_instance = ColumnMetadata.from_json(json)
# print the JSON string representation of the object
print(ColumnMetadata.to_json())

# convert the object into a dict
column_metadata_dict = column_metadata_instance.to_dict()
# create an instance of ColumnMetadata from a dict
column_metadata_from_dict = ColumnMetadata.from_dict(column_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


