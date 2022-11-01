# PrivateUser

Private User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**bio** | **str** |  | 
**blog** | **str** |  | 
**business_plus** | **bool** |  | [optional] 
**collaborators** | **int** |  | 
**company** | **str** |  | 
**created_at** | **datetime** |  | 
**disk_usage** | **int** |  | 
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
**ldap_dn** | **str** |  | [optional] 
**location** | **str** |  | 
**login** | **str** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**owned_private_repos** | **int** |  | 
**plan** | [**LdapMappingUserPlan**](LdapMappingUserPlan.md) |  | [optional] 
**private_gists** | **int** |  | 
**public_gists** | **int** |  | 
**public_repos** | **int** |  | 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**suspended_at** | **datetime** |  | [optional] 
**total_private_repos** | **int** |  | 
**twitter_username** | **str** |  | [optional] 
**two_factor_authentication** | **bool** |  | 
**type** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.private_user import PrivateUser

# TODO update the JSON string below
json = "{}"
# create an instance of PrivateUser from a JSON string
private_user_instance = PrivateUser.from_json(json)
# print the JSON string representation of the object
print(PrivateUser.to_json())

# convert the object into a dict
private_user_dict = private_user_instance.to_dict()
# create an instance of PrivateUser from a dict
private_user_from_dict = PrivateUser.from_dict(private_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


