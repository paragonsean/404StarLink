# ReposListCacheInfo200ResponseInner

Status for a cache replica

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**git** | [**ReposListCacheInfo200ResponseInnerGit**](ReposListCacheInfo200ResponseInnerGit.md) |  | 
**host** | **str** |  | 
**location** | **str** |  | 

## Example

```python
from openapi_client.models.repos_list_cache_info200_response_inner import ReposListCacheInfo200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of ReposListCacheInfo200ResponseInner from a JSON string
repos_list_cache_info200_response_inner_instance = ReposListCacheInfo200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(ReposListCacheInfo200ResponseInner.to_json())

# convert the object into a dict
repos_list_cache_info200_response_inner_dict = repos_list_cache_info200_response_inner_instance.to_dict()
# create an instance of ReposListCacheInfo200ResponseInner from a dict
repos_list_cache_info200_response_inner_from_dict = ReposListCacheInfo200ResponseInner.from_dict(repos_list_cache_info200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


