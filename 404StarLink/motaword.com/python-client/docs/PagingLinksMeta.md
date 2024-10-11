# PagingLinksMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.paging_links_meta import PagingLinksMeta

# TODO update the JSON string below
json = "{}"
# create an instance of PagingLinksMeta from a JSON string
paging_links_meta_instance = PagingLinksMeta.from_json(json)
# print the JSON string representation of the object
print(PagingLinksMeta.to_json())

# convert the object into a dict
paging_links_meta_dict = paging_links_meta_instance.to_dict()
# create an instance of PagingLinksMeta from a dict
paging_links_meta_from_dict = PagingLinksMeta.from_dict(paging_links_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


