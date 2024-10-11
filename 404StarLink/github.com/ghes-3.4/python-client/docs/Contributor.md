# Contributor

Contributor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | [optional] 
**contributions** | **int** |  | 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | [optional] 
**followers_url** | **str** |  | [optional] 
**following_url** | **str** |  | [optional] 
**gists_url** | **str** |  | [optional] 
**gravatar_id** | **str** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**login** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 
**organizations_url** | **str** |  | [optional] 
**received_events_url** | **str** |  | [optional] 
**repos_url** | **str** |  | [optional] 
**site_admin** | **bool** |  | [optional] 
**starred_url** | **str** |  | [optional] 
**subscriptions_url** | **str** |  | [optional] 
**type** | **str** |  | 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.contributor import Contributor

# TODO update the JSON string below
json = "{}"
# create an instance of Contributor from a JSON string
contributor_instance = Contributor.from_json(json)
# print the JSON string representation of the object
print(Contributor.to_json())

# convert the object into a dict
contributor_dict = contributor_instance.to_dict()
# create an instance of Contributor from a dict
contributor_from_dict = Contributor.from_dict(contributor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


