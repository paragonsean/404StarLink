# PagingMetaPaging


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**links** | [**PagingLinksMeta**](PagingLinksMeta.md) |  | [optional] 
**page** | **int** |  | [optional] [default to 1]
**per_page** | **int** |  | [optional] [default to 10]
**total_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.paging_meta_paging import PagingMetaPaging

# TODO update the JSON string below
json = "{}"
# create an instance of PagingMetaPaging from a JSON string
paging_meta_paging_instance = PagingMetaPaging.from_json(json)
# print the JSON string representation of the object
print(PagingMetaPaging.to_json())

# convert the object into a dict
paging_meta_paging_dict = paging_meta_paging_instance.to_dict()
# create an instance of PagingMetaPaging from a dict
paging_meta_paging_from_dict = PagingMetaPaging.from_dict(paging_meta_paging_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


