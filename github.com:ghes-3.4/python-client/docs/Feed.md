# Feed

Feed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**FeedLinks**](FeedLinks.md) |  | 
**current_user_actor_url** | **str** |  | [optional] 
**current_user_organization_url** | **str** |  | [optional] 
**current_user_organization_urls** | **List[str]** |  | [optional] 
**current_user_public_url** | **str** |  | [optional] 
**current_user_url** | **str** |  | [optional] 
**repository_discussions** | [**LinkWithType**](LinkWithType.md) |  | [optional] 
**repository_discussions_category** | [**LinkWithType**](LinkWithType.md) |  | [optional] 
**repository_discussions_category_url** | **str** | A feed of discussions for a given repository and category. | [optional] 
**repository_discussions_url** | **str** | A feed of discussions for a given repository. | [optional] 
**security_advisories_url** | **str** |  | [optional] 
**timeline_url** | **str** |  | 
**user_url** | **str** |  | 

## Example

```python
from openapi_client.models.feed import Feed

# TODO update the JSON string below
json = "{}"
# create an instance of Feed from a JSON string
feed_instance = Feed.from_json(json)
# print the JSON string representation of the object
print(Feed.to_json())

# convert the object into a dict
feed_dict = feed_instance.to_dict()
# create an instance of Feed from a dict
feed_from_dict = Feed.from_dict(feed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


