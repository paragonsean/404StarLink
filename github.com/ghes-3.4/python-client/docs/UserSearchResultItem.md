# UserSearchResultItem

User Search Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**bio** | **str** |  | [optional] 
**blog** | **str** |  | [optional] 
**company** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | 
**followers** | **int** |  | [optional] 
**followers_url** | **str** |  | 
**following** | **int** |  | [optional] 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**hireable** | **bool** |  | [optional] 
**html_url** | **str** |  | 
**id** | **int** |  | 
**location** | **str** |  | [optional] 
**login** | **str** |  | 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**public_gists** | **int** |  | [optional] 
**public_repos** | **int** |  | [optional] 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**score** | **float** |  | 
**site_admin** | **bool** |  | 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**suspended_at** | **datetime** |  | [optional] 
**text_matches** | [**List[SearchResultTextMatchesInner]**](SearchResultTextMatchesInner.md) |  | [optional] 
**type** | **str** |  | 
**updated_at** | **datetime** |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.user_search_result_item import UserSearchResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of UserSearchResultItem from a JSON string
user_search_result_item_instance = UserSearchResultItem.from_json(json)
# print the JSON string representation of the object
print(UserSearchResultItem.to_json())

# convert the object into a dict
user_search_result_item_dict = user_search_result_item_instance.to_dict()
# create an instance of UserSearchResultItem from a dict
user_search_result_item_from_dict = UserSearchResultItem.from_dict(user_search_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


