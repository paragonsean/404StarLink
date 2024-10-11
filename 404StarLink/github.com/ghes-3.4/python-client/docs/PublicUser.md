# PublicUser

Public User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**bio** | **str** |  | 
**blog** | **str** |  | 
**collaborators** | **int** |  | [optional] 
**company** | **str** |  | 
**created_at** | **datetime** |  | 
**disk_usage** | **int** |  | [optional] 
**email** | **str** |  | 
**events_url** | **str** |  | 
**followers** | **int** |  | 
**followers_url** | **str** |  | 
**following** | **int** |  | 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**hireable** | **bool** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**location** | **str** |  | 
**login** | **str** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**owned_private_repos** | **int** |  | [optional] 
**plan** | [**LdapMappingUserPlan**](LdapMappingUserPlan.md) |  | [optional] 
**private_gists** | **int** |  | [optional] 
**public_gists** | **int** |  | 
**public_repos** | **int** |  | 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**suspended_at** | **datetime** |  | [optional] 
**total_private_repos** | **int** |  | [optional] 
**twitter_username** | **str** |  | [optional] 
**type** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.public_user import PublicUser

# TODO update the JSON string below
json = "{}"
# create an instance of PublicUser from a JSON string
public_user_instance = PublicUser.from_json(json)
# print the JSON string representation of the object
print(PublicUser.to_json())

# convert the object into a dict
public_user_dict = public_user_instance.to_dict()
# create an instance of PublicUser from a dict
public_user_from_dict = PublicUser.from_dict(public_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


