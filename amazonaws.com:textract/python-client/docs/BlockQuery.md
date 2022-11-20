# BlockQuery


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 
**alias** | **str** |  | [optional] 
**pages** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.block_query import BlockQuery

# TODO update the JSON string below
json = "{}"
# create an instance of BlockQuery from a JSON string
block_query_instance = BlockQuery.from_json(json)
# print the JSON string representation of the object
print(BlockQuery.to_json())

# convert the object into a dict
block_query_dict = block_query_instance.to_dict()
# create an instance of BlockQuery from a dict
block_query_from_dict = BlockQuery.from_dict(block_query_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


