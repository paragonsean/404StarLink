# SimpleUser

A GitHub user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | 
**followers_url** | **str** |  | 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**login** | **str** |  | 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_at** | **str** |  | [optional] 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.simple_user import SimpleUser

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleUser from a JSON string
simple_user_instance = SimpleUser.from_json(json)
# print the JSON string representation of the object
print(SimpleUser.to_json())

# convert the object into a dict
simple_user_dict = simple_user_instance.to_dict()
# create an instance of SimpleUser from a dict
simple_user_from_dict = SimpleUser.from_dict(simple_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


